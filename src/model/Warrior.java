package model;

public abstract class Warrior extends FightingObject{
    protected int specialattack;
    public Warrior(String name, int hp, int attack, int defense, boolean isCriticalHit, int isCriticalHitChance, int SP, int fleePower, int evasion, boolean isDead) {
        super(name, hp, attack, defense,isCriticalHit,isCriticalHitChance,isDead);
        this.SP = SP;
        this.fleePower = fleePower;
        this.evasion = evasion;
    }
    public int getSpecialattack(){
        return specialattack;
    }
    protected int SP;
    protected int fleePower;
    protected int evasion;

    public int getSP() {
        return SP;
    }

    public int getFleePower() {
        return fleePower;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    /*
    SP is needed for performing special attacks
    after performing a special attack a specific amount of SP is removed
    all or some Characters regain some SP at the end of the round

    fleePower is used to escape the battle (not boss fights)
    methode run
    your chance for escape increases temporarily after every (failed try)

    evasion is the chance for the player to dodge an attack
    methode doge (increases evasion greatly for one or two rounds)

    method defense (increases Def)

     */
}
