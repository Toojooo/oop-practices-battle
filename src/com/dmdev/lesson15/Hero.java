package com.dmdev.lesson15;

public abstract class Hero  implements Mortal{
    private String name;
    private int health;
    private int damage;

    // Конструктор героя
    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    // Абстрактный метод атаки врага (реализуется в подклассах)
    public abstract void attackEnemy(Enemy enemy);

    // Метод получения урона
    public void takeDamage(int damage) {
        health -= Math.min(damage, health);
        if (health < 0) {
            health = 0; // чтобы здоровье не уходило в отрицательные значения
        }
        System.out.println(name + " получил урон на " + damage + ", осталось " + health);
        if (!isAlive()) {
            System.out.println(name + " скончался");
        }
    }

    // Метод для проверки, жив ли герой
    @Override
    public boolean isAlive() {
        return health > 0;
    }

    // Метод для восстановления здоровья (например, при использовании зелья)
    public void heal(int amount) {
        health += amount;
        System.out.println(name + " восстановил " + amount + " здоровья, теперь у него " + health + " здоровья.");
    }

    // Получить имя героя
    public String getName() {
        return name;
    }

    // Получить урон героя
    public int getDamage() {
        return damage;
    }

    // Получить текущее здоровье героя
    public int getHealth() {
        return health;
    }

    // Установить новое здоровье (возможна защита от отрицательных значений)
    public void setHealth(int health) {
        this.health = Math.max(health, 0); // здоровье не может быть меньше 0
    }
}
