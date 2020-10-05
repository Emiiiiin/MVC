package control;

import model.*;
import view.*;

public class MainController {
    private Warrior w;
    private MainController mainController;
    private MainView mainView;
    private MainView mainInfoView = null;
    private boolean mainInfoViewIsCreated = false;

    public MainController() {

    }
    public void attack(FightingObject enemy){
        int damage;
        if (criticalHit = true){
            damage = w.getAttack()*2;
        }
    }

    public Warrior chosenWarrior(int warrior){
        if(warrior == 1){
            w = new Hunter("Hunter", 100, 10,15, 30,20,30);
            }
        //andere Warrior überprüfen
        return w;
    }
    public void run(){
        //content follows
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