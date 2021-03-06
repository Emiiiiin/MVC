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

    public PanelHandler(MainController mainController) {
        this.mainController = mainController;
        createButtons();
        setGUIData();
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
                mainController.sendChosenWarrior(warrior);
                mainController.switchToPanel(4);
            }
        });
        infoButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.createInfoWindow(1);
            }
        });
        infoButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.createInfoWindow(2);
            }
        });
    }

    private void setGUIData() {
        infoButton3.setVisible(false);
        infoButton4.setVisible(false);
        warrior3RadioButton.setVisible(false);
        warrior4RadioButton.setVisible(false);
    }

    public JPanel getPanel(){
        return panel;
    }
}
