import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Hero.java
 *******************************************/

public abstract class Hero implements Comparable<Hero> {
    String name;
    int strength;
    String health;
    ArrayList<Weapon> weapons = new ArrayList<>();

    public Hero(String name, int strength, String health, ArrayList<Weapon> weapons) 
        throws HeroStrengthException 
    {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.weapons = weapons;

        if (strength < 1) {
            throw new HeroStrengthException();
        }
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
    public int compareTo(Hero o) {
        if (this.getStrength() > o.getStrength()) {
            return 1;
        } else if (this.getStrength() == o.getStrength()) {
            return 0;
        } else 
            return -1;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", strength=" + strength + ", health=" + health + ", weapons=" + weapons + "]";
    }
}