package com.goit.module6;

public class HeroTest {
    public static void main(String[] args) {

        Hero hero = new Hero("Stranger", 50);

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());

    }
}
class Hero{
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Hero() {
        this.name = "Paratrooper";
        this.hp = 100;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
}
