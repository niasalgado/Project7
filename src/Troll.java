import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Troll.java
 *******************************************/

public class Troll extends Monster {
    double height;

    public Troll(String name, String habitat, String health, int strength, ArrayList<Weapon> weapons, double height) {
        super(name, habitat, health, strength, weapons);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Troll [height=" + height + "]";
    }
}