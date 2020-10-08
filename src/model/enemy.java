package model;

public abstract class enemy extends FightingObject{

    public enemy(String name, int hp, int attack, int defense, boolean isCriticalHit, int isCriticalHitChance) {
        super(name, hp, attack, defense, isCriticalHit, isCriticalHitChance);
    }
}
//reminder: make boolean type for when the monster is dead
