package com.dmdev.lesson15;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Мечник том", 15, 100);
        Hero archer = new Archer("Лучник евген", 12, 80);
        Hero mage = new Mage("Волшебнник висли", 22, 50);
        Enemy zombie = new Zombie("Zombie", 100, 25);

        // Начало атаки
        attackEnemy(new Hero[]{warrior, archer, mage}, zombie);
    }

    private static void attackEnemy(Hero[] heroes, Enemy enemy) {
        // Пока враг жив, продолжаем атаку
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    // Герой атакует зомби
                    hero.attackEnemy(enemy);

                    // Если зомби выжил после атаки, он атакует героя
                    if (enemy.isAlive()) {
                        enemy.attackHeroes(hero);
                    }
                } else {
                    System.out.println(enemy.getName() + " мертв.");
                    break;
                }
            }
        }
    }
}
