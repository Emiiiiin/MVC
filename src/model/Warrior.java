package model;

public abstract class Warrior extends FightingObject{
    public Warrior(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }
    public void attack(FightingObject enemy){
        enemy.setHp(enemy.getHp()-this.attack);
    }
}
