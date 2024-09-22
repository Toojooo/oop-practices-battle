package com.dmdev.lesson15;

import com.dmdev.lesson18.Weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{

    public Archer(String name, int damage, int health) {
        super(name,damage,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует " + enemy.getName() + " и наносит " + getDamage() + " урона!");
        enemy.takeDamage(getDamage(), this);
    }

     class Wolf {

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }


    }

}
