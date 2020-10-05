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
    private MainController mainController;

        public ActionPanelHandler(MainController mainController) {
            this.mainController = mainController;

            createButtons();
            updateGUI();
        }

        private void createButtons() {

        }

        private void updateGUI() {

        }

        public JPanel getPanel() {
            return panel;
        }

}
