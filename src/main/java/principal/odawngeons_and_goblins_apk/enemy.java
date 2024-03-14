package principal.odawngeons_and_goblins_apk;

import java.util.Random;

public class enemy extends characters {

    private static final String[] nombres = {"Electroll", "Vientroll", "Trollama", "Watroll", "Mujearth"};
    private static final String[] descripciones = {"Troll eléctrico capaz de generar potentes descargas que paralizan a sus víctimas.", "Troll capaz de exhalar vientos anales muy intensos.", "Troll sexy caliente como una llama, quema al contacto.", "Troll húmedo, tiene una curiosa e incluso científica similitud con un Pokémon que es un perro azul...", "¡Es una mujer, corre por tu vida!"};

    private final Random rnd = new Random();
    private String descripcion;
    private boolean stateDef = false;

    public enemy() {
    }

    public enemy(int id, int lvl) {
        setName(enemyName(id));
        this.descripcion = enemyDescripcion(id);
        setHp(enemyHp(lvl));
        setHpNow(enemyHp(lvl));
        setAtq(enemyAtq(lvl));
        setSatq(enemySatq(lvl));
        setDef(enemyDef(lvl));
        setSdef(enemySdef(lvl));
    }

    private String enemyName(int id) {
        if (id >= nombres.length || id < 0) {
            return nombres[0];
        } else {
            return nombres[id];
        }
    }

    private String enemyDescripcion(int id) {
        if (id >= descripciones.length || id < 0) {
            return descripcion = descripciones[0];
        } else {
            return descripcion = descripciones[id];
        }
    }

    private int enemyHp(int lvl) {
        switch (this.getName()) {
            case "Electroll" -> {
                return 20 + lvl;
            }
            case "Vientroll" -> {
                return 20 + lvl;
            }
            case "Trollama" -> {
                return 20 + lvl;
            }
            case "Watroll" -> {
                return 20 + lvl;
            }
            case "Mujearth" -> {
                return 50 + lvl * 2;
            }
            default -> {
                return 50 + lvl * 2;
            }
        }
    }

    private int enemyAtq(int lvl) {
        switch (this.getName()) {
            case "Electroll" -> {
                return 10 + lvl;
            }
            case "Vientroll" -> {
                return 5 + lvl;
            }
            case "Trollama" -> {
                return 12 + lvl;
            }
            case "Watroll" -> {
                return 7 + lvl;
            }
            case "Mujearth" -> {
                return 15 + lvl * 2;
            }
            default -> {
                return 15 + lvl * 2;
            }
        }
    }

    private int enemySatq(int lvl) {
        switch (this.getName()) {
            case "Electroll" -> {
                return 8 + lvl;
            }
            case "Vientroll" -> {
                return 12 + lvl;
            }
            case "Trollama" -> {
                return 7 + lvl;
            }
            case "Watroll" -> {
                return 7 + lvl;
            }
            case "Mujearth" -> {
                return 20 + lvl * 2;
            }
            default -> {
                return 20 + lvl * 2;
            }
        }
    }

    private int enemyDef(int lvl) {
        switch (this.getName()) {
            case "Electroll" -> {
                return 7 + lvl;
            }
            case "Vientroll" -> {
                return 7 + lvl;
            }
            case "Trollama" -> {
                return 5 + lvl;
            }
            case "Watroll" -> {
                return 5 + lvl;
            }
            case "Mujearth" -> {
                return 15 + lvl * 2;
            }
            default -> {
                return 15 + lvl * 2;
            }
        }
    }

    private int enemySdef(int lvl) {
        switch (this.getName()) {
            case "Electroll" -> {
                return 10 + lvl;
            }
            case "Vientroll" -> {
                return 8 + lvl;
            }
            case "Trollama" -> {
                return 10 + lvl;
            }
            case "Watroll" -> {
                return 20 + lvl;
            }
            case "Mujearth" -> {
                return 25 + lvl * 2;
            }
            default -> {
                return 25 + lvl * 2;
            }
        }
    }

    //Setters
    //En principio no interesan
    //Getters
    public String getDescripcion() {
        return descripcion;
    }

    public boolean getStateDef() {
        return stateDef;
    }

    //funciones
    public enemy randomEnemy(int pLvl) {
        enemy e1 = new enemy(rnd.nextInt(6), pLvl);
        return e1;
    }

    public boolean stateDef() {
        switch (this.getName()) {
            case "Electroll" -> {
                stateDef = Math.random() > 0.85;
            }
            case "Vientroll" -> {
                stateDef = Math.random() > 0.80;
            }
            case "Trollama" -> {
                stateDef = Math.random() > 0.90;
            }
            case "Watroll" -> {
                stateDef = Math.random() > 0.65;
            }
            case "Mujearth" -> {
                stateDef = Math.random() > 0.69;
            }
            default -> {
                stateDef = Math.random() > 0.75;
            }
        }
        return stateDef;
    }

    //pendiente de editar
    @Override
    public String toString() {
        return "enemy{" + "name=" + getName() + ", descripcion=" + descripcion + ", lvl=" + getLvl() + ", xp=" + getXp() + ", hp=" + getHp() + ", hpNow=" + getHpNow() + ", atq=" + getAtq() + ", Satq=" + getSatq() + ", def=" + getDef() + ", Sdef=" + getSdef() + "}";
    }

    @Override
    public char defaultStyle() {
        switch (this.getName()) {
            case "Electroll" -> {
                return 'F';
            }
            case "Vientroll" -> {
                return 'M';
            }
            case "Trollama" -> {
                return 'M';
            }
            case "Watroll" -> {
                return 'F';
            }
            case "Mujearth" -> {
                return 'M';
            }
            default -> {
                return 'F';
            }
        }
    }

}
