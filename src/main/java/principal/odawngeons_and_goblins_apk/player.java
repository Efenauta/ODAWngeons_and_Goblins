package principal.odawngeons_and_goblins_apk;

public class player extends characters {

    static String[] tipoClases = {"Guerrero", "Mago", "Paladín", "Asesino", "Mari Kong", "Maguerrero"};
    //  Guerrero[G],     Mago[M],     Paladín[P],      Asesino[A],      Mari Kong[K],        Maguerrero[X]

    private int nextLvl = 50;
    //clase
    private char claseP;
    private int luck;

    public player(String name, char claseP) {
        setName(name);
        this.claseP = comprobarClaseP(claseP);
        this.luck = (int) (Math.random() * 10);
        switch (claseP) {
            case 'M' -> {
                setHp(40);
                setHpNow(40);
                setAtq(1);
                setSatq(15);
                setDef(2);
                setSdef(6);
            }
            case 'P' -> {
                setHp(45);
                setHpNow(45);
                setAtq(5);
                setSatq(5);
                setDef(6);
                setSdef(7);
            }
            case 'A' -> {
                setHp(35);
                setHpNow(35);
                setAtq(15);
                setSatq(1);
                setDef(6);
                setSdef(2);
            }
            case 'K' -> {
                setHp(15);
                setHpNow(15);
                setAtq(20);
                setSatq(20);
                setDef(10);
                setSdef(10);
            }
            case 'X' -> {
                setHp(45);
                setHpNow(45);
                setAtq(7);
                setSatq(4);
                setDef(3);
                setSdef(5);
            }
            default -> {
                setHp(50);
                setHpNow(50);
                setAtq(8);
                setSatq(2);
                setDef(8);
                setSdef(8);
            }
        }
    }

    //Getters---------------------------.-------------------------------------------
    public int getNextLvl() {
        return nextLvl;
    }

    public int getLuck() {
        return luck;
    }

    @Override
    public char getClaseP() {
        return claseP;
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
        if (getLvl() < 100) {
            setLvl(getLvl() + 1);
            newLvlHp();
            newLvlAtq();
            newLvlSatq();
            newLvlDef();
            newLvlSdef();
            this.nextLvl += (int) (getLvl() * 2.5);
        } //el nivel 101 necesitaría 12.650 puntos de xp
    }

    private char comprobarClaseP(char claseP) {
        if (claseP == 'M' || claseP == 'P' || claseP == 'A' || claseP == 'K' || claseP == 'X') {
            return claseP;
        } else {
            return 'G';
        }
    }

    private void newLvlHp() {
        switch (this.claseP) {
            case 'M' -> {   //lvl 100 = 5540 hp
                setHp(5 + getHp());
            }
            case 'P' -> {   //lvl 100 = 7045 hp
                setHp(5 + (int) (getLvl() * 1.3));
            }
            case 'A' -> {   //lvl 100 = 4045 hp
                setHp(3 + (int) (getLvl() * 0.75));
            }
            case 'K' -> {   //lvl 100 = 8815 hp
                setHp((int) (getLvl() * 1.75));
            }
            case 'X' -> {   //lvl 100 = hp 6820
                setHp(5 + (int) (getLvl() * 1.25));
            }
            default -> {    //lvl 100 = 8100
                setHp(5 + (int) (getLvl() * 1.5));
            }
        }
        setHpNow(getHp());
    }

    private void newLvlAtq() {
        switch (this.claseP) {
            case 'M' -> {   //lvl 100 = 212 atq
                setAtq(1 + (int) (getLvl() * 0.25));
            }
            case 'P' -> {   //lvl 100 = 465 atq
                setAtq(5 + (int) (getLvl() * 0.33));
            }
            case 'A' -> {   //lvl 100 = 1482 atq
                setAtq(3 + (int) (getLvl() * 0.24));
            }
            case 'K' -> {   //lvl 100 = 990 atq
                setAtq((int) (getLvl() * 0.20));
            }
            case 'X' -> {   //lvl 100 = 717 atq
                setAtq((int) (getLvl() * 0.15));
            }
            default -> {    //lvl 100 = 917 atq
                setAtq(2 + (int) (getLvl() * 0.15));
            }
        }
    }

    private void newLvlSatq() {
        switch (this.claseP) {
            case 'M' -> {
                setSatq(3 + (int) (getLvl() * 0.24));
            }
            case 'P' -> {
                setSatq(5 + (int) (getLvl() * 0.33));
            }
            case 'A' -> {
                setSatq(1 + (int) (getLvl() * 0.25));
            }
            case 'K' -> {
                setSatq((int) (getLvl() * 0.20));
            }
            case 'X' -> {
                setSatq((int) (getLvl() * 0.15));
            }
            default -> {
                setSatq(1 + (int) (getLvl() * 0.25));
            }
        }
    }

    private void newLvlDef() {
        switch (this.claseP) {
            case 'M' -> {
                setDef(1 + (int) (getLvl() * 0.15));
            }
            case 'P' -> {
                setDef(1 + (int) (getLvl() * 0.20));
            }
            case 'A' -> {
                setDef(1 + (int) (getLvl() * 0.17));
            }
            case 'K' -> {
                setDef((int) (getLvl() * 0.20));
            }
            case 'X' -> {
                setDef((int) (getLvl() * 0.24));
            }
            default -> {
                setDef(5 + (int) (getLvl() * 0.30));
            }
        }
    }

    private void newLvlSdef() {
        switch (this.claseP) {
            case 'M' -> {
                setSdef(3 + (int) (getLvl() * 0.25));
            }
            case 'P' -> {
                setSdef(5 + (int) (getLvl() * 0.30));
            }
            case 'A' -> {
                setSdef(1 + (int) (getLvl() * 0.15));
            }
            case 'K' -> {
                setSdef((int) (getLvl() * 0.17));
            }
            case 'X' -> {
                setSdef((int) (getLvl() * 0.22));
            }
            default -> {
                setSdef(1 + (int) (getLvl() * 0.20));
            }
        }
    }

    @Override
    public char defaultStyle() {
        switch (claseP) {
            case 'M' -> {   //lvl 100 = 212 atq
                return 'M';
            }
            case 'P' -> {   //lvl 100 = 465 atq
                return 'M';
            }
            case 'A' -> {   //lvl 100 = 1482 atq
                return 'F';
            }
            case 'K' -> {   //lvl 100 = 990 atq
                return 'M';
            }
            case 'X' -> {   //lvl 100 = 717 atq
                return 'F';
            }
            default -> {    //lvl 100 = 917 atq
                return 'F';
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\n\nNivel: " + getLvl() + "\nxp :    " + getXp() + "/" + nextLvl + "\nRol: " + getClaseP(this.claseP) + "\n\n  Stats:\n    hp : " + getHpNow() + "/" + getHp() + "\n    Atqaque : " + getAtq() + "       Ataque Sp. : " + getSatq() + "\n    Defensa : " + getDef() + "        Defensa Sp. : " + getSdef() + "\n    Suerte : " + luck + "0%";
    }

}
