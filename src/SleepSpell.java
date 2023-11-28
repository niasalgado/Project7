/******************************************
 *  Author : Nia Salgado   
 *  Created On : Sat Nov 25 2023
 *  File : SleepSpell.java
 *******************************************/

public class SleepSpell extends Weapon {
    String name = "sleepSpell";
    int power = 4;
    String ability = "Puts named person to sleep, must be within 20 feet of initiator.";
    String type = "spell";

    public SleepSpell(String name, int power, String ability, String type) {
        super(name, power, ability, type);
        //TODO Auto-generated constructor stub
    }
    
}