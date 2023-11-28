/******************************************
 *  Author : Nia Salgado   
 *  Created On : Sat Nov 25 2023
 *  File : Bo.java
 *******************************************/

public class Bo extends Weapon {
    String name = "bo";
    int power = 3;
    String ability = "To bludgeon anyone or anything within 10 feet";
    String type = "staff";

    public Bo(String name, int power, String ability, String type) {
        super(name, power, ability, type);
    }
    
}