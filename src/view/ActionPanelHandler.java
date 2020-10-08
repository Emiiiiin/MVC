package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ActionPanelHandler {
    private JPanel panel;
    private JButton basicAttackButton;
    private JButton defenseButton;
    private JButton arrowStormSPButton;
    private JButton doubleShotSPButton;
    private JButton shotOfATrueButton;
    private JButton dodgeButton;
    private JButton runButton;
    private JButton wrathOfTheGodsButton;
    private JLabel hpLabelPlayer;
    private JLabel spLabelPlayer;
    private JLabel hpLabelEnemy;
    private JLabel nameLabelEnemy;
    private JLabel nameLabelPlayer;
    private JPanel lightPanel;
    private Timer timer;
    private MainController mainController;

        public ActionPanelHandler(MainController mainController) {
            this.mainController = mainController;
        }

        protected void createButtons() {
            ComponentAdapter listener = new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                }
            };
            spLabelPlayer.addComponentListener(listener);
            hpLabelEnemy.addComponentListener(listener);
            nameLabelEnemy.addComponentListener(listener);
            hpLabelPlayer.addComponentListener(listener);
            nameLabelPlayer.addComponentListener(listener);
            defenseButton.setVisible(false);
            dodgeButton.setVisible(false);
            runButton.setVisible(false);
            wrathOfTheGodsButton.setVisible(false);
            basicAttackButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lightPanel.setBackground(Color.red);
                    mainController.sendAttack(0);
                    updatePlayerGUI();
                    updateEnemyGUI();
                }
            });
            doubleShotSPButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lightPanel.setBackground(Color.red);
                    mainController.sendAttack(1);
                    updatePlayerGUI();
                    updateEnemyGUI();
                }
            });
            shotOfATrueButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lightPanel.setBackground(Color.red);
                    mainController.sendAttack(2);
                    updatePlayerGUI();
                    updateEnemyGUI();
                }
            });
            arrowStormSPButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lightPanel.setBackground(Color.red);
                    mainController.sendAttack(3);
                    updatePlayerGUI();
                    updateEnemyGUI();
                }
            });
            lightPanel.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                    lightPanel.setBackground(Color.green);
                }
            });
        }

        protected void updatePlayerGUI() {
            nameLabelPlayer.setText(mainController.getAllImportantData()[2]);
            hpLabelPlayer.setText("HP: " + mainController.getAllImportantData()[0]);
            spLabelPlayer.setText("SP: " + mainController.getAllImportantData()[1]);
        }

        protected void updateEnemyGUI() {
            nameLabelEnemy.setText(mainController.getAllImportantData()[4]);
            hpLabelEnemy.setText("HP: " + mainController.getAllImportantData()[3]);
            lightPanel.setBackground(Color.green);
        }

        public JPanel getPanel() {
            return panel;
        }

}
