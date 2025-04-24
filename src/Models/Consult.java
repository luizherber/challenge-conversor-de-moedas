package Models;

import API.ApiConnect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consult {

    public Consult(int userChoice) {
        Scanner leitura = new Scanner(System.in);

        switch (userChoice) {
            case 1:
                converter("BRL", "USD", leitura);
                break;
            case 2:
                converter("USD", "BRL", leitura);
                break;
            case 3:
                converter("BRL", "EUR", leitura);
                break;
            case 4:
                converter("EUR", "BRL", leitura);
                break;
            case 5:
                converter("BRL", "ARS", leitura);
                break;
            case 6:
                converter("ARS", "BRL", leitura);
                break;
            default:
                System.out.println("Obrigado!");
                System.out.println("Finalizando aplicação!");
        }
    }

    private void converter(String originCoin, String destinyCoin, Scanner leitura) {
        double amountCoin = 0;

        try {
            System.out.print("Digite a quantia que deseja converter: ");
            amountCoin = leitura.nextDouble();

            ApiConnect apiConnect = new ApiConnect();
            String result = apiConnect.apiConnection(originCoin, destinyCoin, amountCoin);
            String[] takePart = result.split("@");
            String convertedValue = takePart[0];
            String tax = takePart[1];

            System.out.println("Taxa de conversão: 1 " + originCoin + " = " + tax + " " + destinyCoin);
            System.out.printf("%.2f %s corresponde a %s %s%n", amountCoin, originCoin, convertedValue, destinyCoin);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Você precisa digitar um número (ex: 12.5).");

            // Limpa o buffer do Scanner para evitar looping infinito
            leitura.nextLine(); // ou leitura.next(); se preferir
        }
    }
}