package model;

public abstract class Warrior extends FightingObject{
    protected int specialattack;
    public Warrior(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }
    public int getSpecialattack(){
        return specialattack;
    }
}
