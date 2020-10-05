package control;

import model.*;
import view.*;

public class MainController {
    private Warrior w;
    private enemy e;
    private MainController mainController;
    private MainView mainView;
    private MainView mainInfoView = null;
    private boolean mainInfoViewIsCreated = false;

    public MainController() {

    }
    public void basicAttack(){
        int damage = w.getAttack();
        if (isCriticalHit = true){
            damage = w.getAttack()*2;
        }
        damage = damage - e.getDefense();
        if (damage > 0){
            e.setHP() = e.get(HP) - damage;
        }
    }
    //hunter moveset
    public void doubleShot(){
        basicAttack();
        basicAttack();
        w.getSP() = w.getSP() - 3;
    }

    public void arrowStorm(){
        int z = (int) (Math.random()+(5-3)+1);
        for (int i = 0; i < z; i++) {
            basicAttack();
        }
        w.getSP() = w.getSP() - 15;
    }

    public void sniperShot(){
        int damage = w.getAttack();
        if (isCriticalHit = true){
            damage = w.getAttack()*4;
        }
        else(){
            basicAttack();
        }
        w.getSP() = w.getSP() - 8;
    }

    //guard moveset
    public void mightySpearStab(){
        int damage = w.getAttack() + 20;
        if (isCriticalHit = true){
            damage = w.getAttack()*2;
        }
        damage = damage - e.getDefense();
        if (damage > 0){
            e.setHP() = e.get(HP) - damage;
        }
        w.getSP() = w.getSP() - 4;
    }
    public void bouquetOfSpears(){
        int z = (int) (Math.random()+(20-5)+1);
        for (int i = 0; i < z; i++) {
            int damage = w.getAttack() / 2;
            if (isCriticalHit = true){
                damage = w.getAttack()*2;
            }
            damage = damage - e.getDefense();
            if (damage > 0){
                e.setHP() = e.get(HP) - damage;
            }
        }
        w.getSP() = w.getSP() - 20;
    }

    public void shieldDash(){
        int damage = w.getDefense();
        if (isCriticalHit = true){
            damage = w.getDefense()*2;
        }
        damage = damage - e.getDefense();
        if (damage > 0){
            e.setHP() = e.get(HP) - damage;
    }

    public Warrior chosenWarrior(int warrior){
        if(warrior == 1){
            w = new Hunter("Hunter", 100, 10,5,true ,20 ,30,20,30);
            }
        //andere Warrior überprüfen
        if (warrior == 2){
            w = new Guard("Guard", 150, 8,12,true ,5 ,23,4,14);
        }
        return w;
    }
    public void run(){
        //content follows
    }

    public void setEnemy() {
        int z = (int) (Math.random()* (4-1)+1);
        if (z == 1) {
            e = new Mob("Mob",100,5,5,false, 15);
        }
    }

    public void setMainController(MainController mainController){
        //Diese Methode wird nur nach Erzeugung aufgerufen. Die Referenz mainController wird gesetzt. Die Methode createMainView() wird aufgerufen.
        this.mainController = mainController;
        createMainView();
    }

    public void createMainView() {
        //Das Objekt mainView wird erstellt, an sich selbst übergeben und im mainController abgespeichert.
        MainView mainView = new MainView(mainController, "MVC-Textspiel",50,50,800,600);
        mainView.setMainView(mainView);
        this.mainView = mainView;
    }

    public void createInfoWindow() {
        //Das Info-Fenster wird erstellt, falls es nicht schon erstellt wurde. Das panel des infoHandlers wird eingesetzt und das Fenster wird sichtbar.
        if (mainInfoViewIsCreated == false) {
        mainInfoView = new MainView(mainController, "Information",50,50,400,200);
            mainInfoViewIsCreated = true;
        }
        mainInfoView.switchToPanel(3);
        mainInfoView.setVisible(true);
    }

    public void closeInfoWindow() {
        //Macht das Info-Fenster unsichtbar.
        mainInfoView.setVisible(false);
    }

    public void switchToPanel(int panel) {
        //Leitet an die mainView eine Zahl weiter, die ein Panel aufruft.
        mainView.switchToPanel(panel);
    }

}