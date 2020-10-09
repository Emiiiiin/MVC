package model;

public class Hunter extends Warrior{
    public Hunter(String name, int hp, int attack, int defense, boolean isCriticalHit, int isCriticalHitChance, int SP, int fleePower, int evasion, boolean isDead) {
        super(name, hp, attack, defense,isCriticalHit,isCriticalHitChance,SP,fleePower,evasion,isDead);
    }
    /*
    "your name is chase. you are a hunter, currently living in the davelion woods. you are a skilled archer wich comes in handy because you are horrible at sneaking up on your prey. you ares tracking down a monster."

    damage calculation:
    attackDamage = damage;
    if (criticalHit = true){
    attackDamage = attackDamage*2;
    }
    attackDamage = attack Damage - enemysDef;
    // to not heal the enemy if the defense is to high
    if (attackDamage > 0){
    enemysHp = enemysHp - attackDamage;
    }

    Attacks:
    basic attack / arrowStrike (damage = attack + 5(stand in for weapon attribute))
    Special attack:
    //for all enemies
    stormOfArrows (damage = (zufallsZahl von 3 bis 5)*(attack + 5))
    doubleShot (damage = (attack + 5)*2)
    sniperShot ( if (criticalHit = true){
    damage = (attack + 5)*4;
    else{
    damage = attack + 5}
    }
     */


    /*
    if (){
    enemiesHP = enmiesHP -damage;
    }

    public void attack() {
        attackdamage = attack;

        damage = damage - enemiesDefense;
    }
     */


}
