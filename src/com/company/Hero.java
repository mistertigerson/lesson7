package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    String superAbilityType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;
    }
}
