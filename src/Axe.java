/******************************************
 *  Author : Nia Salgado   
 *  Created On : Sat Nov 25 2023
 *  File : Axe.java
 *******************************************/

public class Axe extends Weapon {
    String name = "axe";
    int power = 4;
    String ability = "to slice anyone or anything within 10 feet";
    String type = "cudgel";

    public Axe(String name, int power, String ability, String type) {
        super(name, power, ability, type);
    }
    
}