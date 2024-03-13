package principal.odawngeons_and_goblins_apk;

import java.util.Scanner;

public class checkInput {

    private static final Scanner sc = new Scanner(System.in);
    private static String testInput;

    public checkInput() {
    }

    private static void delay(int t) {
        for (int i = 0; i < t; i++) {
            try {
                // Introduce un retraso de 1 segundo (1000 milisegundos)
                Thread.sleep(1000);
            } catch (InterruptedException timeError) {
            }
        }
    }

    public char menuOption() {
        char option = ' ';
        while (option == ' ') {
            System.out.println("[a]Luchar     [b]Inventario     [c]Salir");
            System.out.print("Elige una opción: ");
            testInput = sc.nextLine();
            try {
                if (testInput.length() == 1) {
                    option = testInput.charAt(0);
                }
            } catch (NumberFormatException InvalidOption) {
            }
            if (option != 'a' && option != 'b' && option != 'c' && option != ' ') {
                System.out.println("Opción no encontrada.");
                option = ' ';
            }
        }
        return option;
    }

    public char combatMenuOption() {
        char option = ' ';
        while (option == ' ') {
            System.out.println("Opciones: [a]atacar     [b]bloquear");
            System.out.print("Elige una opción: ");
            try {
                if (testInput.length() == 1) {
                    option = testInput.charAt(0);
                }
            } catch (NumberFormatException InvalidOption) {
                System.out.println("Elige una opción válida.");
            }
            if (option != 'a' && option != 'b' && option != ' ') {
                System.out.println("Opción no encontrada.");
                option = ' ';
            }
        }
        return option;
    }
}
