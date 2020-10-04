package view;

import control.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private int warrior = 0;
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
        hunterRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                archerRadioButton.setSelected(false);
                warrior3RadioButton.setSelected(false);
                warrior4RadioButton.setSelected(false);
                warrior = 1;
            }
        });
        archerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hunterRadioButton.setSelected(false);
                warrior3RadioButton.setSelected(false);
                warrior4RadioButton.setSelected(false);
                warrior = 2;
            }
        });
        warrior3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hunterRadioButton.setSelected(false);
                archerRadioButton.setSelected(false);
                warrior4RadioButton.setSelected(false);
                warrior = 3;
            }
        });
        warrior4RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hunterRadioButton.setSelected(false);
                archerRadioButton.setSelected(false);
                warrior3RadioButton.setSelected(false);
                warrior = 4;
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.chosenWarrior(warrior);
            }
        });
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        };
        infoButton1.addActionListener(listener1);
        infoButton2.addActionListener(listener1);
        infoButton3.addActionListener(listener1);
        infoButton4.addActionListener(listener1);
    }

    private void updateGUI() {

    }

    public JPanel getPanel(){
        return panel;
    }
}
