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
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        };
        warrior4RadioButton.addActionListener(listener);
        warrior3RadioButton.addActionListener(listener);
        archerRadioButton.addActionListener(listener);
        hunterRadioButton.addActionListener(listener);
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        };
        infoButton1.addActionListener(listener1);
        infoButton2.addActionListener(listener1);
        infoButton3.addActionListener(listener1);
        infoButton4.addActionListener(listener1);
        button1.addActionListener(listener1);
    }

    private void updateGUI() {

    }

    public JPanel getPanel(){
        return panel;
    }
}
