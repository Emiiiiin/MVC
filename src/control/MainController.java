package control;

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

    public void createInfoWindow(int w) {
        //Das Info-Fenster wird erstellt, falls es nicht schon erstellt wurde. Der Parameter w wird an die Methode sendChosenWarrior() geleitet.
        // (Damit wir von einem Warrior Informationen abrufen können.)
        //Das panel des infoHandlers wird eingesetzt und das Fenster wird sichtbar.
        if (mainInfoViewIsCreated == false) {
        mainInfoView = new MainView(mainController, "Information",50,50,400,200);
            mainInfoViewIsCreated = true;
        }
        sendChosenWarrior(w);
        mainInfoView.switchToPanel(3);
        mainInfoView.setVisible(true);
    }

    public void closeInfoWindow() {
        //Macht das Info-Fenster unsichtbar. Die Methode deleteWarrior() im fightController wird ausgeführt.
        mainInfoView.setVisible(false);
        fightController.deleteWarrior();
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

    public String[] getAllImportantData() {
        return fightController.getAllImportantData();
    }

    public void end() {
         if (fightController.getEnd())
        mainView.switchToPanel(5);
    }

}