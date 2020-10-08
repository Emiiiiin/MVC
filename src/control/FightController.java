package control;

import model.*;

public class FightController {
    private Warrior w;
    private enemy e;

    public FightController() {
        setEnemy();
    }

    public void attack(int warrior, int attack) {
        if (attack == 0) {
            basicAttack();
        }
        if (warrior == 1) {
            if (attack == 1) {
                doubleShot();
            }
            if (attack == 2) {
                sniperShot();
            }
            if (attack == 3) {
                arrowStorm();
            }
        }
        if (warrior == 2) {
            if (attack == 1) {
                mightySpearStab();
            }
            if (attack == 2) {
                bouquetOfSpears();
            }
            if (attack == 3) {
                shieldDash();
            }
        }

    }

    public void basicAttack(){
        int damage = w.getAttack();
        if (w.isCriticalHit() == true){
            damage = w.getAttack()*2;
        }
        damage = damage - e.getDefense();
        if (damage > 0){
            e.setHp(e.getHp() - damage);
        }
    }
    //hunter moveset
    public void doubleShot(){
        basicAttack();
        basicAttack();
        w.setSP(w.getSP() - 3);
    }

    public void sniperShot(){
        int damage = w.getAttack();
        if (w.isCriticalHit() == true){
            damage = w.getAttack()*4;
        }
        else {
            basicAttack();
        }
        w.setSP(w.getSP() - 8);
    }

    public void arrowStorm(){
        int z = (int) (Math.random()+(5-3)+1);
        for (int i = 0; i < z; i++) {
            basicAttack();
        }
        w.setSP(w.getSP() - 15);
    }

    //guard moveset
    public void mightySpearStab(){
        int damage = w.getAttack() + 20;
        if (w.isCriticalHit() == true){
            damage = w.getAttack()*2;
        }
        damage = damage - e.getDefense();
        if (damage > 0){
            e.setHp(e.getHp() - damage);
        }
        w.setSP(w.getSP() - 4);
    }
    public void bouquetOfSpears(){
        int z = (int) (Math.random()+(20-5)+1);
        for (int i = 0; i < z; i++) {
            int damage = w.getAttack() / 2;
            if (w.isCriticalHit() == true){
                damage = w.getAttack()*2;
            }
            damage = damage - e.getDefense();
            if (damage > 0){
                e.setHp(e.getHp() - damage);
            }
        }
        w.setSP(w.getSP() - 20);
    }

    public void shieldDash() {
        int damage = w.getDefense();
        if (w.isCriticalHit() == true) {
            damage = w.getDefense() * 2;
        }
        damage = damage - e.getDefense();
        if (damage > 0) {
            e.setHp(e.getHp() - damage);
        }
    }

    public Warrior chosenWarrior(int warrior) {
        if (warrior == 1) {
            w = new Hunter("Hunter", 100, 10, 5, true, 20, 30, 20, 30);
        }
        //andere Warrior überprüfen
        if (warrior == 2) {
            w = new Guard("Guard", 150, 8, 12, true, 5, 23, 4, 14);
        }
        return w;
    }

    public void setEnemy() {
        int z = (int) (Math.random()* (2-1)+1);
        if (z == 1) {
            e = new Mob("Mob",100,5,5,false, 15);
        }
        if (z == 2) {
            e = new Mob("Wob",100,5,5,false, 15);
        }
    }

    public void run(){
        //content follows
    }

    public String[] getWAndENameHPSP() {
        String[] output = new String[5];
        output[0] = String.valueOf(w.getHp());
        output[1] = String.valueOf(w.getSP());
        output[2] = w.getName();
        output[3] = String.valueOf(e.getHp());
        output[4] = e.getName();
        return output;
    }
}
