package principal.odawngeons_and_goblins_apk;

public class players {

    static String[] tipoClases = {"Guerrero", "Mago", "Paladín", "Asesino", "Mari Kong", "Maguerrero"};

    private String name;
    private int lvl = 1;
    private int xp = 0;
    private int nextLvl = 50;
    //clase
    private char claseP;
    //atributos
    private int hp;
    public int hpNow;
    private int atq;
    private int Satq;
    private int def;
    private int Sdef;
    private int luck;

    public players(String name, char claseP) {
        this.name = name;
        this.claseP = comprobarClaseP(claseP);
        this.luck = (int) (Math.random() * 10);
        switch (claseP) {
            case 'M' -> {
                this.hp = 40;
                this.hpNow = 40;
                this.atq = 1;
                this.Satq = 15;
                this.def = 2;
                this.Sdef = 6;
            }
            case 'P' -> {
                this.hp = 45;
                this.hpNow = 45;
                this.atq = 5;
                this.Satq = 5;
                this.def = 6;
                this.Sdef = 7;
            }
            case 'A' -> {
                this.hp = 35;
                this.hpNow = 35;
                this.atq = 15;
                this.Satq = 1;
                this.def = 6;
                this.Sdef = 2;
            }
            case 'K' -> {
                this.hp = 15;
                this.hpNow = 15;
                this.atq = 20;
                this.Satq = 20;
                this.def = 10;
                this.Sdef = 10;
            }
            case 'X' -> {
                this.hp = 45;
                this.hpNow = 45;
                this.atq = 7;
                this.Satq = 4;
                this.def = 3;
                this.Sdef = 5;;
            }
            default -> {
                this.hp = 50;
                this.hpNow = 50;
                this.atq = 8;
                this.Satq = 2;
                this.def = 8;
                this.Sdef = 8;
            }
        }
    }

    //Getters----------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public int getAtq() {
        return atq;
    }

    public int getSatq() {
        return Satq;
    }

    public int getXp() {
        return xp;
    }

    public int getDef() {
        return def;
    }

    public int getSdef() {
        return Sdef;
    }

    public int getLuck() {
        return luck;
    }

    public String getClaseP(char claseP) {
        switch (claseP) {
            case 'G' -> {
                return tipoClases[0];
            }
            case 'M' -> {
                return tipoClases[1];
            }
            case 'P' -> {
                return tipoClases[2];
            }
            case 'A' -> {
                return tipoClases[3];
            }
            case 'K' -> {
                return tipoClases[4];
            }
            case 'X' -> {
                return tipoClases[5];
            }
            default -> {
                return "Clase desconocida";
            }
        }
    }
    //-----------------------------------------------------------------------------

    public void gainLvl() {
        this.lvl++;
        newLvlHp();
        newLvlAtq();
        newLvlSatq();
        newLvlDef();
        newLvlSdef();
        this.nextLvl += (int) (this.lvl * 2.5); //el nivel 101 necesitaría 12.650 puntos de xp
    }

    public char comprobarClaseP(char claseP) {
        if (claseP == 'M' || claseP == 'P') {
            return claseP;
        } else {
            return 'G';
        }
    }

    public void newLvlHp() {
        switch (this.claseP) {
            case 'M' -> {   //lvl 100 = 5540 hp
                this.hp += 5 + this.lvl;
                this.hpNow += 5 + this.lvl;
            }
            case 'P' -> {   //lvl 100 = 7045 hp
                this.hp += 5 + (int) (this.lvl * 1.3);
                this.hpNow += 5 + (int) (this.lvl * 1.3);
            }
            case 'A' -> {   //lvl 100 = 4045 hp
                this.hp += 3 + (int) (this.lvl * 0.75);
                this.hpNow += 3 + (int) (this.lvl * 0.75);
            }
            case 'K' -> {   //lvl 100 = 8815 hp
                this.hp += (this.lvl * 1.75);
                this.hpNow += (this.lvl * 1.75);
            }
            case 'X' -> {   //lvl 100 = hp 6820
                this.hp += 5 + (int) (this.lvl * 1.25);
                this.hpNow += 5 + (int) (this.lvl * 1.25);
            }
            default -> {    //lvl 100 = 8100
                this.hp += 5 + (int) (this.lvl * 1.5);
                this.hpNow += 5 + (int) (this.lvl * 1.5);
            }
        }
    }

    public void newLvlAtq() {
        switch (this.claseP) {
            case 'M' -> {   //lvl 100 = 212 atq
                this.atq += 1 + (int) (this.lvl * 0.25);
            }
            case 'P' -> {   //lvl 100 = 465 atq
                this.atq += 5 + (int) (this.lvl * 0.33);
            }
            case 'A' -> {   //lvl 100 = 1482 atq
                this.atq += 3 + (int) (this.lvl * 0.24);
            }
            case 'K' -> {   //lvl 100 = 990 atq
                this.atq += (this.lvl * 0.20);
            }
            case 'X' -> {   //lvl 100 = 717 atq
                this.atq += (int) (this.lvl * 0.15);
            }
            default -> {    //lvl 100 = 917 atq
                this.atq += 2 + (int) (this.lvl * 0.15);
            }
        }
    }

    public void newLvlSatq() {
        switch (this.claseP) {
            case 'M' -> {
                this.Satq += 3 + (int) (this.lvl * 0.24);
            }
            case 'P' -> {
                this.Satq += 5 + (int) (this.lvl * 0.33);
            }
            case 'A' -> {
                this.Satq += 1 + (int) (this.lvl * 0.25);
            }
            case 'K' -> {
                this.Satq += (this.lvl * 0.20);
            }
            case 'X' -> {
                this.Satq += (int) (this.lvl * 0.15);
            }
            default -> {
                this.Satq += 1 + (int) (this.lvl * 0.25);
            }
        }
    }

    public void newLvlDef() {
        switch (this.claseP) {
            case 'M' -> {
                this.def += 1 + (int) (this.lvl * 0.15);
            }
            case 'P' -> {
                this.def += 1 + (int) (this.lvl * 0.20);
            }
            case 'A' -> {
                this.def += 1 + (int) (this.lvl * 0.17);
            }
            case 'K' -> {
                this.def += (this.lvl * 0.20);
            }
            case 'X' -> {
                this.def += (int) (this.lvl * 0.24);
            }
            default -> {
                this.def += 5 + (int) (this.lvl * 0.30);
            }
        }
    }

    public void newLvlSdef() {
        switch (this.claseP) {
            case 'M' -> {
                this.Sdef += 3 + (int) (this.lvl * 0.25);
            }
            case 'P' -> {
                this.Sdef += 5 + (int) (this.lvl * 0.30);
            }
            case 'A' -> {
                this.Sdef += 1 + (int) (this.lvl * 0.15);
            }
            case 'K' -> {
                this.Sdef += (this.lvl * 0.17);
            }
            case 'X' -> {
                this.Sdef += (int) (this.lvl * 0.22);
            }
            default -> {
                this.Sdef += 1 + (int) (this.lvl * 0.20);
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n\nNivel: " + lvl + "\nxp :    " + xp + "/" + nextLvl + "\nRol: " + getClaseP(this.claseP) + "\n\n  Stats:\n    hp : " + hpNow + "/" + hp + "\n    Atqaque : " + atq + "       Ataque Sp. : " + Satq + "\n    Defensa : " + def + "        Defensa Sp. : " + Sdef + "\n    Suerte : " + luck + "0%";
    }
}
