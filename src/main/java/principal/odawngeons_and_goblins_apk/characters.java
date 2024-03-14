package principal.odawngeons_and_goblins_apk;

public abstract class characters {

    private String name;
    private int lvl = 1;
    private int xp = 0;
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

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setHpNow(int hpNow) {
        if (hpNow > 0) {
            this.hpNow = hpNow;
        } else {
            this.hpNow = 0;
        }
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

    public abstract char getClaseP();

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
    public abstract char defaultStyle();

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
            this.setHpNow(getHpNow() - (entrada - defensa(type) * 3 / 4));
            return entrada - defensa(type) * 3 / 4;
        } else {
            this.setHpNow(getHpNow() - (entrada - defensa(type) / 2));
            return entrada - defensa(type) / 2;
        }
    }

}
