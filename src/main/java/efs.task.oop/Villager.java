package efs.task.oop;

public class Villager implements Fighter {
    public int health = 100;
    private String name;
    private int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return (int) ((100 - age * 0.5) / 10);
    }
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack(Fighter victim) {
        int damage = getDamage();
        victim.takeHit(damage);
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Villager has been defeated.");
        } else {
            System.out.println("Villager took " + damage + " damage. Health remaining: " + health);
        }
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }
}