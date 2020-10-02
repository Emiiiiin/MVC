package control;

import model.*;
import view.*;

public class MainController {
    private Warrior w;
    private MainView mainView;

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
}