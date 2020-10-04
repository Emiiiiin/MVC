package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionPanelHandler {
    private JPanel panel;
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
