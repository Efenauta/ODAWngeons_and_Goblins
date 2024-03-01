package principal.odawngeons_and_goblins_apk;

import java.util.Scanner;

public class checkInput {

    private static final Scanner sc = new Scanner(System.in);
    private static String testInput;

    public checkInput() {
    }

    public char menuOption() {
        char option = ' ';
        while (option == ' ') {
            System.out.println("[a]Luchar     [b]Inventario     [c]Salir");
            System.out.print("Elige una opción: ");
            try {
                option = sc.nextLine().charAt(0);
            } catch (NumberFormatException InvalidOption) {
                System.out.println("Elige una opción válida.");
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
                option = sc.nextLine().charAt(0);
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
