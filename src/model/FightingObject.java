package model;
//Alle Objekte die kämpfen können ,sowohl der Spieler als auch die Gegner, erben von der Klasse FightingObjekt
//Die können alle miteineander kämpfen
public abstract class FightingObject {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected boolean isdran;
    protected boolean isCriticalHit;
    protected int isCriticalHitChance;

    public FightingObject(String name, int hp, int attack, int defense, boolean isCriticalHit, int isCriticalHitChance) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.isCriticalHit = isCriticalHit;
        this.isCriticalHitChance = isCriticalHitChance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp(){
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isIsdran() {
        return isdran;
    }

    public void setIsdran(boolean isdran) {
        this.isdran = isdran;
    }

    public boolean isCriticalHit() {
        return isCriticalHit;
    }

    public void setCriticalHit(boolean criticalHit) {
        isCriticalHit = criticalHit;
    }

    public int getIsCriticalHitChance() {
        return isCriticalHitChance;
    }

    public void setIsCriticalHitChance(int isCriticalHitChance) {
        this.isCriticalHitChance = isCriticalHitChance;
    }

}
