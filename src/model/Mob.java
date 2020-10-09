package model;

public class Mob extends enemy{
    public Mob(String name, int hp, int attack, int defense, boolean isCriticalHit, int isCriticalHitChance,  boolean isDead) {
        super(name, hp, attack, defense, isCriticalHit, isCriticalHitChance,isDead);
    }
}
