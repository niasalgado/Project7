import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Ogre.java
 *******************************************/

public class Ogre extends Monster {
    boolean hasScales;

    public Ogre(String name, String habitat, String health, int strength, ArrayList<Weapon> weapons,
            boolean hasScales) {
        super(name, habitat, health, strength, weapons);
        this.hasScales = hasScales;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    @Override
    public String toString() {
        return "Ogre [hasScales=" + hasScales + "]";
    }    
}