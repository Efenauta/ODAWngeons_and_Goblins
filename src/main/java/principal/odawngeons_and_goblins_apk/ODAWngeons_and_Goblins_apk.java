package principal.odawngeons_and_goblins_apk;

public class ODAWngeons_and_Goblins_apk {

    private static boolean gameOn = true, combatOn = false;
    private static char menuOption, combatMenuOption;
    private static final checkInput check = new checkInput();
    private static enemy e1;
    private static player Jugador;

    public boolean getCombatOn() {
        return combatOn;
    }

    private void luchar(char tipo) {
        switch (tipo) {
            case 'a' -> {
                e1.takeDamage(Jugador.golpeBasico(), Jugador.defaultStyle(), e1.stateDef());
                System.out.println("¡Golpeaste al enemigo!  Ha perdido " + (e1.getHp() - e1.getHpNow()) + " puntos de vida.");
                if (!e1.getStateDef()) {
                    Jugador.takeDamage(e1.golpeBasico(), e1.defaultStyle(), false);
                    System.out.println("¡" + e1.getName() + " te ha golpeado!   Has perdido " + (Jugador.getHp() - Jugador.getHpNow()) + " HP.");
                } else {
                    System.out.println("¡El enemigo se posicionó defensivamente!");
                }
                System.out.println("");
            }
            case 'b' -> {
                System.out.println("¡Te estás defendiendo!");
                if (!e1.getStateDef()) {
                    Jugador.takeDamage(e1.golpeBasico(), e1.defaultStyle(), false);
                    System.out.println("¡" + e1.getName() + " te ha golpeado!   Has perdido " + (Jugador.getHp() - Jugador.getHpNow()) + " HP.");
                } else {
                    System.out.println("¡El enemigo también se posicionó defensivamente!\nNinguno ha sufrido daños.");
                }
                System.out.println("");
            }
        }

    }

    public void game() {

        Jugador = new player("Efe", 'A');

        //menú
        do {
            menuOption = check.menuOption();
            switch (menuOption) {
                case 'a' -> {
                    e1 = new enemy().randomEnemy(Jugador.getLvl());
                    System.out.println(e1.getName() + " se prepara para el combate.");
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
                        if (e1.getHpNow() == 0 || Jugador.getHpNow() == 0) {
                            combatOn = false;
                        }
                    } while (combatOn);
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
