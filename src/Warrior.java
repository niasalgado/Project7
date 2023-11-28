import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Warrior.java
 *******************************************/

public class Warrior extends Hero {
    boolean hasTransport;

    public Warrior(String name, int strength, String health, ArrayList<Weapon> weapons, boolean hasTransport) 
            throws HeroStrengthException {
        super(name, strength, health, weapons);
        this.hasTransport = hasTransport;
    }

    public boolean isHasTransport() {
        return hasTransport;
    }

    public void setHasTransport(boolean hasTransport) {
        this.hasTransport = hasTransport;
    }

    @Override
    public String toString() {
        return "Warrior [hasTransport=" + hasTransport + "]";
    }
}