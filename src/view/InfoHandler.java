package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class InfoHandler {

    private MainController mainController;
    private JPanel panel;
    private JButton closeButton;
    private JLabel nameLabel;
    private JLabel hpLabel;
    private JLabel spLabel;
    private JLabel attackLabel;
    private JLabel defenseLabel;
    private JLabel criticalHitChance;
    private JLabel fleePowerLabel;
    private JLabel evasionLabel;

    public InfoHandler(MainController mainController) {
        this.mainController = mainController;

        createButtons();
        setGUIData();
    }

    private void createButtons() {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.closeInfoWindow();
            }
        });
        ComponentAdapter listener = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        };
        defenseLabel.addComponentListener(listener);
        hpLabel.addComponentListener(listener);
        nameLabel.addComponentListener(listener);
        attackLabel.addComponentListener(listener);
        spLabel.addComponentListener(listener);
        criticalHitChance.addComponentListener(listener);
        fleePowerLabel.addComponentListener(listener);
        evasionLabel.addComponentListener(listener);
    }

    public void setGUIData() {
        nameLabel.setText("name: " + mainController.getAllImportantData()[2]);
        hpLabel.setText("hp: " + mainController.getAllImportantData()[0]);
        spLabel.setText("sp: " + mainController.getAllImportantData()[1]);
        attackLabel.setText("attack: " + mainController.getAllImportantData()[5]);
        defenseLabel.setText("defense: " + mainController.getAllImportantData()[6]);
        criticalHitChance.setText("critical hit chance: " + mainController.getAllImportantData()[0]);
        fleePowerLabel.setVisible(false);
        evasionLabel.setVisible(false);
    }

    public JPanel getPanel() {
        return panel;
    }
}
