import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner leitura = new Scanner(System.in);
//        System.out.println("Digite a moeda que deseja converter:");
//        String originCoin = leitura.nextLine();
//        System.out.println("Digite  as moeda para qual deseja converter:");
//        String destinyCoin = leitura.nextLine();
//        System.out.println("Digite a quantidade que deseja converter:");
//        double amountCoin = leitura.nextDouble();

        int userChoice = 0;
        while (userChoice != 7) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Real Brasileiro(BRL) para Dolar(USD)!");
            System.out.println("2 - Dolar(USD) para Real Brasileiro(BRL)!");
            System.out.println("3 - Real Brasileiro(BRL) para Euro(EUR)!");
            System.out.println("4 - Euro(EUR) para Real Brasileiro(BRL)!");
            System.out.println("5 - Real Brasileiro(BRL) para Peso Argentino(ARS)!");
            System.out.println("6 - Peso Argentino(ARS) para Real Brasileiro(BRL)");
            System.out.println("Pressione 7 para Sair");

            userChoice = leitura.nextInt();

            if (userChoice == 1) {
                String originCoin = "BRL";
                String destinyCoin = "USD";
                System.out.println("Digite q quantia que deseja converter.");
                double amountCoin = leitura.nextDouble();

                ApiConsult apiConsult = new ApiConsult();
                String resultado = apiConsult.apiConnection(originCoin, destinyCoin, amountCoin);
                System.out.println(amountCoin + " " + originCoin + " corresponde a " + resultado + " " + destinyCoin);
            } else if(userChoice == 2){
                String originCoin = "USD";
                String destinyCoin = "BRL";
                System.out.println("Digite q quantia que deseja converter.");
                double amountCoin = leitura.nextDouble();

                ApiConsult apiConsult = new ApiConsult();
                String resultado = apiConsult.apiConnection(originCoin, destinyCoin, amountCoin);
                System.out.println(amountCoin + " " + originCoin + " corresponde a " + resultado + " " + destinyCoin);
            } else if (userChoice == 3) {
                String originCoin = "BRL";
                String destinyCoin = "EUR";
                System.out.println("Digite q quantia que deseja converter.");
                double amountCoin = leitura.nextDouble();

                ApiConsult apiConsult = new ApiConsult();
                String resultado = apiConsult.apiConnection(originCoin, destinyCoin, amountCoin);
                System.out.println(amountCoin + " " + originCoin + " corresponde a " + resultado + " " + destinyCoin);
            } else if (userChoice == 4) {
                String originCoin = "EUR";
                String destinyCoin = "BRL";
                System.out.println("Digite q quantia que deseja converter.");
                double amountCoin = leitura.nextDouble();

                ApiConsult apiConsult = new ApiConsult();
                String resultado = apiConsult.apiConnection(originCoin, destinyCoin, amountCoin);
                System.out.println(amountCoin + " " + originCoin + " corresponde a " + resultado + " " + destinyCoin);
            } else if (userChoice == 5) {
                String originCoin = "BRL";
                String destinyCoin = "ARS";
                System.out.println("Digite q quantia que deseja converter.");
                double amountCoin = leitura.nextDouble();

                ApiConsult apiConsult = new ApiConsult();
                String resultado = apiConsult.apiConnection(originCoin, destinyCoin, amountCoin);
                System.out.println(amountCoin + " " + originCoin + " corresponde a " + resultado + " " + destinyCoin);
            } else if (userChoice == 6) {
                String originCoin = "ARS";
                String destinyCoin = "BRL";
                System.out.println("Digite q quantia que deseja converter.");
                double amountCoin = leitura.nextDouble();

                ApiConsult apiConsult = new ApiConsult();
                String resultado = apiConsult.apiConnection(originCoin, destinyCoin, amountCoin);
                System.out.println(amountCoin + " " + originCoin + " corresponde a " + resultado + " " + destinyCoin);
            } else {
                userChoice = 7;
                System.out.println("Obrigado");
                System.out.println("Finalizando aplicação!");
            }
        }
    }
}
