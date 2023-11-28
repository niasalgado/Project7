/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Weapon.java
 *******************************************/

public class Weapon {
    private String name;
    private String ability;
    private String type; // {spell, explosive, staff, cudgel, throwing-device}
    private int power;
    
    public Weapon(String name, int power, String ability, String type) {
        this.name = name;
        this.power = power;
        this.ability = ability;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weapon: " + name;
    }
}