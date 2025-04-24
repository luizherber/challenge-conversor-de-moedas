import Menu.MainMenu;
import Models.Consult;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice = 0;
        Scanner leitura = new Scanner(System.in);

        while (userChoice != 7) {
            MainMenu menu = new MainMenu(); //instancia o menu
            menu.showMenu(); //exibe o menu

            System.out.print("Escolha uma opção: ");

            try {
                userChoice = leitura.nextInt();

                if (userChoice >= 1 && userChoice <= 6) {
                    new Consult(userChoice); // chama o conversor
                } else if (userChoice == 7) {
                    System.out.println("Saindo do programa...");
                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número de 1 a 7");
                leitura.nextLine(); // limpa o buffer
                userChoice = 0; // força continuar no loop
            }
        }
    }
}
