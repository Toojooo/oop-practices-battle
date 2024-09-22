package com.dmdev.lesson15;

public abstract class Enemy implements Mortal {

    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    // Removed the Enemy hero parameter, as it's not needed
    public abstract void takeDamage(int damage, Hero hero);

    public abstract void attackHeroes(Hero hero);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
