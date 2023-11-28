import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Faerie.java
 *******************************************/

public class Faerie extends Hero {
    int height;

    public Faerie(String name, int strength, String health, ArrayList<Weapon> weapons, int height)
            throws HeroStrengthException {
        super(name, strength, health, weapons);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}