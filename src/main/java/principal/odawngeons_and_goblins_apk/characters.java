package principal.odawngeons_and_goblins_apk;

public class characters {

    private String name;
    private int lvl = 1;
    private int xp = 0;
    //clase
    private char claseP;
    //atributos
    private int hp;
    private int hpNow;
    private int atq;
    private int Satq;
    private int def;
    private int Sdef;

    public void setName(String name) {
        this.name = name;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setClaseP(char claseP) {
        this.claseP = claseP;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setHpNow(int hpNow) {
        this.hpNow = hpNow;
    }

    public void setAtq(int atq) {
        this.atq = atq;
    }

    public void setSatq(int Satq) {
        this.Satq = Satq;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setSdef(int Sdef) {
        this.Sdef = Sdef;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getXp() {
        return xp;
    }

    public char getClaseP() {
        return claseP;
    }

    public int getHp() {
        return hp;
    }

    public int getHpNow() {
        return hpNow;
    }

    public int getAtq() {
        return atq;
    }

    public int getSatq() {
        return Satq;
    }

    public int getDef() {
        return def;
    }

    public int getSdef() {
        return Sdef;
    }

    //funciones
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

    public int golpeBasico() {
        if (this.defaultStyle() == 'F') {
            return this.atq;
        } else {
            return this.Satq;
        }
    }

    public int defensa(char damageInType) {
        if (damageInType == 'F') {
            return this.def;
        } else {
            return this.Sdef;
        }
    }

    public int takeDamage(int entrada, char type, boolean defensivo) {
        if (defensivo) {
            return entrada - defensa(type) * 3 / 4;
        } else {
            return entrada - defensa(type) / 2;
        }
    }

}
