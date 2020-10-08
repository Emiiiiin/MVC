package view;

import control.*;
import javax.swing.*;

/**
 * Created by Ambrosius on 11.09.2020.
 */
public class MainView extends JFrame {

    // Attribute

    // Referenzen
    private MainController mainController;
    private PanelHandler panelHandler;
    private StartPanelHandler startPanelHandler;
    private InfoHandler infoHandler;
    private ActionPanelHandler actionPanelHandler;
    private EndPanelHandler endPanelHandler;
    private MainView mainView;
    private boolean infoHandlerIsCreated = false;


    /**
     * Konstruktor
     * @param name Der Titel des Fensters
     * @param x Die obere linke x-Koordinate des Fensters bzgl. des Bildschirms
     * @param y Die obere linke y-Koordinaite des Fensters bzgl. des Bildschirms
     * @param width Die Breite des Fensters
     * @param height Die Höhe des Fensters
     */
    public MainView(MainController mainController, String name, int x, int y, int width, int height) {
        this.mainController = mainController;

        this.setLocation(x,y);
        this.setSize(width,height);
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setVisible(true);
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
        createPanels();
    }

    public void createPanels() {
        this.panelHandler = new PanelHandler(mainController);
        this.startPanelHandler = new StartPanelHandler(mainController);
        this.actionPanelHandler = new ActionPanelHandler(mainController);
        this.endPanelHandler = new EndPanelHandler(mainController);

        this.switchToPanel(startPanelHandler.getPanel());
    }

    public void createinfoPanel() {
        if (!infoHandlerIsCreated) {
            this.infoHandler = new InfoHandler(mainController);
            infoHandlerIsCreated = true;
        }
    }

    /**
     * Mithilfe dieser Methode wird das übergebene JPanel-Objekt im Fenster angezeigt. Hierzu wird das aktuell vorhandene JPanel-Objekt zunächst entfernt.
     * @param panel Das JPanel-Obejkt, das angezeigt werden soll.
     */
    public void switchToPanel(JPanel panel){
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
        this.validate();
        this.repaint();
    }

    public void switchToPanel(int panelNumber){
        JPanel panel = null;
        if (panelNumber == 1) {
            panel = startPanelHandler.getPanel();
        }
        if (panelNumber == 2) {
            panel = panelHandler.getPanel();
        }
        if (panelNumber == 3) {
            createinfoPanel();
            panel = infoHandler.getPanel();
            infoHandler.setGUIData();
        }
        if (panelNumber == 4) {
            panel = actionPanelHandler.getPanel();
            actionPanelHandler.createButtons();
            actionPanelHandler.updatePlayerGUI();
            actionPanelHandler.updateEnemyGUI();
        }
        if (panelNumber == 5) {
            panel = endPanelHandler.getPanel();
        }

        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
        this.validate();
        this.repaint();
    }

}
