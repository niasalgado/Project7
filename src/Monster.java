import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Monster.java
 *******************************************/

public abstract class Monster {
    String name;
    int strength;
    String habitat;
    String health;
    ArrayList<Weapon> weapons = new ArrayList<>();

    public Monster(String name, String habitat, String health, int strength, ArrayList<Weapon> weapons) {
        this.name = name;
        this.habitat = habitat;
        this.health = health;
        this.strength = strength;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Monster [name=" + name + ", strength=" + strength + ", habitat=" + habitat + ", health=" + health
                + ", weapons=" + weapons + "]";
    }
}