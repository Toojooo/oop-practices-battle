package com.dmdev.lesson15;


import com.dmdev.lesson18.Weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует " + enemy.getName() + " и наносит " + getDamage() + " урона!");
        enemy.takeDamage(getDamage(), this);
    }
}
