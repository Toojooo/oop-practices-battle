package com.dmdev.lesson15;

import java.util.Random;

public class Zombie extends Enemy {
    private final Random random = new Random();
    private final int specialDamage = 25; // фиксированный урон 25

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            System.out.println(getName() + " получил урон на " + damage + ", осталось " + getHealth());

            // 50% шанс на ответный удар фиксированного урона (25)
            if (isAlive() && random.nextBoolean()) {
                System.out.println(getName() + " отвечает ударом на 25 урона!");
                hero.takeDamage(specialDamage); // Наносим фиксированный урон 25
            }

            if (!isAlive()) {
                System.out.println(getName() + " скончался");
            }
        }
    }

    @Override
    public void attackHeroes(Hero hero) {
        if (isAlive()) {
            System.out.println(getName() + " атакует " + hero.getName() + " и наносит " + getDamage() + " урона!");
            hero.takeDamage(getDamage());

            // 50% шанс нанести дополнительный фиксированный урон 25
            if (random.nextBoolean()) {
                System.out.println(getName() + " наносит дополнительный урон 25!");
                hero.takeDamage(specialDamage);
            }
        }
    }
}
