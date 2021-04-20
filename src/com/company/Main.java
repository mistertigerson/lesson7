package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        medic.setDamage(50);
        medic.setHealth(300);
        medic.superAbilityType = " чистый ";

        magic.setDamage(50);
        magic.setHealth(300);
        magic.superAbilityType = " чистый ";

        warrior.setDamage(50);
        warrior.setHealth(300);
        warrior.superAbilityType = " чистый ";
        Hero[] heroes = {magic, medic, warrior};

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getHealth() + " " + heroes[i].applySuperAbility(heroes[i].superAbilityType) + " " +
                    heroes[i].getDamage() + heroes[i].superAbilityType);

        }


    }
}
