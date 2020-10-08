package view;

import control.MainController;

import javax.swing.*;
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
    private MainController mainController;

        public ActionPanelHandler(MainController mainController) {
            this.mainController = mainController;
            basicAttackButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainController.basicAttack();
                    updateGUI();
                }
            });
            doubleShotSPButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainController.doubleShot();
                    updateGUI();
                }
            });
            shotOfATrueButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainController.sniperShot();
                    updateGUI();
                }
            });
            arrowStormSPButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainController.arrowStorm();
                    updateGUI();
                }
            });
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
        }

        protected void updateGUI() {
            nameLabelPlayer.setText(mainController.getWAndENameHPSP()[2]);
            hpLabelPlayer.setText("HP: " + mainController.getWAndENameHPSP()[0]);
            spLabelPlayer.setText("SP: " + mainController.getWAndENameHPSP()[1]);
            nameLabelEnemy.setText(mainController.getWAndENameHPSP()[4]);
            hpLabelEnemy.setText("HP: " + mainController.getWAndENameHPSP()[3]);
        }

        public JPanel getPanel() {
            return panel;
        }

}
