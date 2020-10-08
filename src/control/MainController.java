package control;

import model.*;
import view.*;

public class MainController {
    private MainController mainController;
    private MainView mainView;
    private FightController fightController;
    private MainView mainInfoView = null;
    private boolean mainInfoViewIsCreated = false;
    private int w;


    public MainController() {
        fightController = new FightController();
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

    public void sendChosenWarrior(int w) {
        this.w = w;
        fightController.chosenWarrior(w);
    }

    public void sendAttack (int attack) {
        fightController.attack(w, attack);
    }

    public String[] getWAndENameHPSP() {
        return fightController.getWAndENameHPSP();
    }

}