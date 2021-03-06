package control;

import model.*;

public class FightController {
    private Warrior w;
    private enemy e;

    public FightController() {
        setEnemy();
    }
// reminder: add an if-methode so that you can´t use special attacks without the needed SP
    public void attack(int warrior, int attack) {
        //Die Methode attack(int warrior, int attack) prüft in Zahlen, je nachdem welcher Warrior ausgewählt wurde, welche
        //dazugehörige Kampfmethode ausgeführt wird. Danach wird die Kampfmethode ausgeführt.
        if (e.getHp() == 0) {
            e.setDead(true);
        }

        if (!e.isDead()) {
            if (attack == 0) {
                basicAttack();
            }
            if (w.getSP() > 0 ) {
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
            enemyAttack();
        }
    }

    public void basicAttack() {
        //Der Standard-Angriff ohne Parameter. Das Attribut damage wird mit dem attack des Warriors gleichgesetzt. Wenn isCriticalHit true ist,
        //wird damage verdoppelt. Danach wird der defense-Wert des Enemys von damage abgezogen.
        //Wenn die Hp-Werte des Enemys größer als 0 sind, wird damage von den Hp-Werten des Gegners abgezogen.
        int damage = w.getAttack();
        if (w.isCriticalHit() == true) {
            damage = damage * 2;
        }
        damage = damage - e.getDefense();
        if (e.getHp() > 0) {
            e.setHp(e.getHp() - damage);
        }
    }

        public void basicAttack(int damage){
            //Der Standard-Angriff mit Parameter. Der int damage-Wert wird übergeben. Wenn isCriticalHit true ist,
            //wird damage vervierfacht. Danach wird der defense-Wert des Enemys von damage abgezogen.
            //Wenn die Hp-Werte des Enemys größer als 0 sind, wird damage von den Hp-Werten des Gegners abgezogen.
            if (w.isCriticalHit() == true) {
                damage = damage * 4;
            }
            damage = damage - e.getDefense();
            if (e.getHp() > 0) {
                e.setHp(e.getHp() - damage);
            }
        }
    //hunter moveset
    public void doubleShot(){
        //Die Methode basicAttack() wird zweimal ausgeführt. Der SP-Wert des Warriors wird um 3 reduziert.
        basicAttack();
        basicAttack();
        w.setSP(w.getSP() - 3);
    }

    public void sniperShot(){
        // Das Attribut damage wird mit dem attack des Warriors gleichgesetzt. Die Methode basicAttack() wird
        //ausgeführt und der Parameter damage übergeben. Der SP-Wert des Warriors wird um 8 reduziert.
        int damage = w.getAttack();
        basicAttack(damage);
        w.setSP(w.getSP() - 8);
    }

    public void arrowStorm(){
        //Eine zuffällige Zahl z (3, 4 oder 5) wird gesetzt. Diese bestimmt die Wiederholungsanzahl der For-Schleife,
        //die die Methode basicAttack() aufruft. Der SP-Wert des Warriors wird um 15 reduziert.
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

    //enemy moveset

    private void enemyAttack() {
        int z = (int) (Math.random()* (3-0)+1);
        if (z == 0) {
            basicEnemyAttack();
        }
        if (z == 1) {
            basicEnemyAttack();
        }
        if (z == 2) {
            basicEnemyAttack();
        }
        if (z == 3) {
            basicEnemyAttack();
        }
    }

    public void basicEnemyAttack() {
        //Der Standard-Enemy-Angriff. Das Attribut damage wird mit dem attack-Wert des Enemys gleichgesetzt. Wenn isCriticalHit true ist,
        //wird damage verdoppelt. Danach wird der defense-Wert des Warriors von damage abgezogen.
        //Wenn die Hp-Werte des Warriors größer als 0 sind, wird damage von den Hp-Werten des Warriors abgezogen.
        int damage = e.getAttack();
        if (e.isCriticalHit() == true) {
            damage = damage * 2;
        }
        damage = damage - w.getDefense();
        if (w.getHp() > 0) {
            w.setHp(w.getHp() - damage);
        }
    }

    public void chosenWarrior(int warrior) {
        //Mit dem übergegebenen Parameter wird je nach Zahlenwert ein Warrior-Objekt erstellt.
        if (warrior == 1) {
            w = new Hunter("Hunter", 200, 10, 5, false, 20, 60, 20, 30, false);
        }
        if (warrior == 2) {
            w = new Guard("Guard", 250, 8, 12, false, 5, 40, 4, 14, false);
        }
    }

    //Setzt das Objekt Warrior auf null, damit es gelöscht wird. (Info-Fenster)
    public void deleteWarrior() {
        w = null;
    }

    public void setEnemy() {
        //Erzeugt mithilfe der Zuffalszahl z (1 oder 2) je nach Zahlenwert ein Enemy-Objekt.
        int z = (int) (Math.random()* (2-1)+1);
        if (z == 1) {
            e = new Mob("Mob",100,10,5,false, 15, false);
        }
        if (z == 2) {
            e = new Mob("Wob",180,15,5,false, 15, false);
        }
    }

    public void run(){
        //content follows
    }

    public String[] getAllImportantData() {
        //Alle wichtigen Werte des Warrior- und Enemy-Objektes werden in einem Array abgespeichert
        //und dieser zurückgegeben.
        String[] output = new String[10];
        output[0] = String.valueOf(w.getHp());
        output[1] = String.valueOf(w.getSP());
        output[2] = w.getName();
        output[3] = String.valueOf(e.getHp());
        output[4] = e.getName();
        output[5] = String.valueOf(w.getAttack());
        output[6] = String.valueOf(w.getDefense());
        output[7] = String.valueOf(w.getIsCriticalHitChance());
        output[8] = String.valueOf(w.getFleePower());
        output[9] = String.valueOf(w.getEvasion());
        return output;
    }

    public boolean getEnd() {
        return e.isDead();
    }
}
