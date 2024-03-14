package principal.odawngeons_and_goblins_apk;

import java.util.ArrayList;

public class ODAWngeons_and_Goblins_apk {

    private static boolean gameOn = true, combatOn = false;
    private static char menuOption, combatMenuOption;
    private static final checkInput check = new checkInput();
    private static enemy e1;
    private static int ActualCharacter;
    private static ArrayList<player> characters;
    private static player newCharacter;

    public boolean getCombatOn() {
        return combatOn;
    }

    private void luchar(char tipo) {
        switch (tipo) {
            case 'a' -> {
                e1.takeDamage(characters.get(ActualCharacter).golpeBasico(), characters.get(ActualCharacter).defaultStyle(), e1.stateDef());
                System.out.println("¡Golpeaste al enemigo!  Ha perdido " + (e1.getHp() - e1.getHpNow()) + " puntos de vida.");
                if (e1.getHpNow() != 0) {
                    if (!e1.getStateDef()) {
                        characters.get(ActualCharacter).takeDamage(e1.golpeBasico(), e1.defaultStyle(), false);
                        System.out.println("¡" + e1.getName() + " te ha golpeado!   Has perdido " + (characters.get(ActualCharacter).getHp() - characters.get(ActualCharacter).getHpNow()) + " HP.");
                    } else {
                        System.out.println("¡El enemigo se posicionó defensivamente!");
                    }
                    System.out.println("Tu vida: " + characters.get(ActualCharacter).getHpNow() + "/" + characters.get(ActualCharacter).getHp() + " HP.");
                    System.out.println("Vida del enemigo: " + e1.getHpNow() + "/" + e1.getHp() + " HP.");
                    System.out.println("");
                } else {
                    System.out.println("Has sobrevivido con: " + characters.get(ActualCharacter).getHpNow() + "/" + characters.get(ActualCharacter).getHp() + " HP.");
                    System.out.println("Has derrotado al enemigo.\n");
                    characters.get(ActualCharacter).setHpNow(characters.get(ActualCharacter).getHp());
                }
            }
            case 'b' -> {
                System.out.println("¡Te estás defendiendo!");
                if (!e1.getStateDef()) {
                    characters.get(ActualCharacter).takeDamage(e1.golpeBasico(), e1.defaultStyle(), false);
                    System.out.println("¡" + e1.getName() + " te ha golpeado!   Has perdido " + (characters.get(ActualCharacter).getHp() - characters.get(ActualCharacter).getHpNow()) + " HP.");
                } else {
                    System.out.println("¡El enemigo también se posicionó defensivamente!\nNinguno ha sufrido daños.");
                }
                System.out.println("Tu vida: " + characters.get(ActualCharacter).getHpNow() + "/" + characters.get(ActualCharacter).getHp());
                System.out.println("Vida del enemigo: " + e1.getHpNow() + "/" + e1.getHp());
                System.out.println("");
            }
        }

    }

    public void game() {

        newCharacter = new player("Efe", 'A');
        characters.add(newCharacter);
        ActualCharacter = 1;
        
        //menú
        do {
            menuOption = check.menuOption();
            switch (menuOption) {
                case 'a' -> {
                    e1 = new enemy().randomEnemy(characters.get(ActualCharacter).getLvl());
                    System.out.println("\n" + e1.getName() + " se prepara para el combate.");
                    combatOn = true;
                    //menú de combate
                    do {
                        combatMenuOption = check.combatMenuOption();
                        switch (combatMenuOption) {
                            case 'a' -> {
                                luchar('a');
                            }
                            case 'b' -> {
                                luchar('b');
                            }
                        }
                        if (e1.getHpNow() == 0 || characters.get(ActualCharacter).getHpNow() == 0) {
                            combatOn = false;
                        }
                    } while (combatOn);
                    if (characters.get(ActualCharacter).getHpNow() == 0) {
                        System.out.println("Has muerto...");
                        gameOn = false;
                    }
                }
                case 'b' -> {
                    System.out.println("El inventario no se encuentra disponible.");
                }
                case 'c' -> {
                    gameOn = false;
                }
            }
        } while (gameOn);
    }
}
