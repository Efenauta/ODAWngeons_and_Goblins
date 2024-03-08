package principal.odawngeons_and_goblins_apk;

public class ODAWngeons_and_Goblins_apk {

    private static boolean gameOn = true, combatOn = false;
    private static char menuOption, combatMenuOption;
    private static final checkInput check = new checkInput();

    public boolean getCombatOn() {
        return combatOn;
    }

    public void game() {

        player Efe = new player("Efe", 'A');

        //insertar en un bucle
        enemy e1;

        //menú
        do {
            menuOption = check.menuOption();
            switch (menuOption) {
                case 'a' -> {
                    e1 = new enemy().randomEnemy(Efe.getLvl());
                    combatOn = true;
                    //menú de combate
                    do {
                        combatMenuOption = check.combatMenuOption();
                        switch (combatMenuOption) {
                            case 'a' -> {

                            }
                            case 'b' -> {

                            }
                        }
                        if (e1.getHpNow() == 0 || Efe.getHpNow() == 0) {
                            combatOn = false;
                        }
                    } while (combatOn);
                }
                case 'b' -> {

                }
                case 'c' -> {
                    gameOn = false;
                }
            }
        } while (gameOn);
    }
}
