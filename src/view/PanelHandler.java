package view;

import control.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private JPanel panel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
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
