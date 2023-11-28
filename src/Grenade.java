/******************************************
 *  Author : Nia Salgado   
 *  Created On : Sat Nov 25 2023
 *  File : Grenade.java
 *******************************************/

public class Grenade extends Weapon {
    String name = "grenade";
    int power = 9;
    String ability = "destorys everything within 25 feet of explosion site";
    String type = "explosive";
    
    public Grenade(String name, int power, String ability, String type) {
        super(name, power, ability, type);
    }
}