import java.util.ArrayList;

/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : Mage.java
 *******************************************/

public class Mage extends Hero implements Armable {
    int age;

    public Mage(String name, int strength, String health, ArrayList<Weapon> weapons, int age) 
            throws HeroStrengthException, MageAgeException {
        super(name, strength, health, weapons);
        this.age = age;

        if (age < 1) {
            throw new MageAgeException();
        }
    }
       
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mage [age=" + age + "]";
    }

    @Override
    public String wieldWeapon() {
        return "spell";
    }
}