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
        enemy.setHp(enemy.getHp()-w.getHp());
    }

    public Warrior chosenWarrior(int warrior){
        if(warrior == 1){
            w = new Hunter("Hunter", 100, 10,15);
            }
        //andere Warrior überprüfen
        return w;
    }
    public void run(){
        //content follows
    }

    public void setMainController(MainController mainController){
        this.mainController = mainController;
        createMainView();
    }

    public void createMainView() {
        MainView mainView = new MainView(mainController, "MVC-Textspiel",50,50,800,600);
        mainView.setMainView(mainView);
        this.mainView = mainView;
    }

    public void createInfoWindow() {
        if (mainInfoViewIsCreated == false) {
        mainInfoView = new MainView(mainController, "Information",50,50,400,200);
            mainInfoViewIsCreated = true;
        }
        mainInfoView.switchToPanel(3);
    }

    public void closeInfoWindow() {
        mainInfoView.setVisible(false);
    }

    public void switchToPanel(int panel) {
        mainView.switchToPanel(panel);
    }
}