package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage = Math.max(other.attack - armor, 1);
        life = Math.max(life - damage, 0);
    }

    public String status() {
        if (life > 0) {
            return name + ": " + life + " de vida";
        } else {
            return name + ": 0 de vida (morreu)";
        }
    }
}
