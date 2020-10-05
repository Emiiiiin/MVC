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
    private JButton button4;
    private JButton button1;
    private JButton button2;
    private JButton button5;
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
