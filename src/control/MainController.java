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
        this.mainView=mainView;
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

    public void setMainController(MainController mainContoller){
        this.mainController = mainContoller;
    }

    public void createInfoWindow() {
        if (mainInfoViewIsCreated == false) {
        mainInfoView = new MainView(mainController, "Information",50,50,400,200);
            mainInfoViewIsCreated = true;
        }
        mainInfoView.switchToPanel(3);
    }
}