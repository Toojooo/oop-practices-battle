package com.dmdev.lesson15;

public class Archer extends Hero{

    public Archer(String name, int damage, int health) {
        super(name,damage,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует " + enemy.getName() + " и наносит " + getDamage() + " урона!");
        enemy.takeDamage(getDamage(), this);
    }
}
