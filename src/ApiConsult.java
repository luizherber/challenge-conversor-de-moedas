import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConsult {

    public String apiConnection (String originCoin, String destinyCoin, double amountCoin) {
        String apiAddress = "https://v6.exchangerate-api.com/v6/";
        String apiKey = "d47b7b53cd26e442b490a909";
        String apiComplement = "/pair/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiAddress + apiKey + apiComplement + originCoin + "/" + destinyCoin + "/" + amountCoin))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            double result = jsonObject.get("conversion_result").getAsDouble();

            return String.valueOf(result);

        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
