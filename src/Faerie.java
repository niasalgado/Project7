import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Faerie.java
 *******************************************/

public class Faerie extends Hero {
    double height;

    public Faerie(String name, int strength, String health, ArrayList<Weapon> weapons, double height)
            throws HeroStrengthException {
        super(name, strength, health, weapons);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}