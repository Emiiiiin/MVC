package view;

import control.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private JPanel panel;
    private JRadioButton warrior4RadioButton;
    private JRadioButton warrior3RadioButton;
    private JRadioButton archerRadioButton;
    private JRadioButton hunterRadioButton;
    private JButton infoButton1;
    private JButton infoButton2;
    private JButton infoButton3;
    private JButton infoButton4;
    private JButton button1;
    private MainController mainController;
    private MainView mainView;

    public PanelHandler(MainController mainController, MainView mainView) {
        this.mainController = mainController;
        this.mainView = mainView;
        createButtons();
        updateGUI();
    }

    private void createButtons() {

    }

    private void updateGUI() {

    }

    public JPanel getPanel(){
        return panel;
    }
}
