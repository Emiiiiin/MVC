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

    public InfoHandler(MainController mainController) {
        this.mainController = mainController;

        createButtons();
        updateGUI();
    }

    private void createButtons() {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.closeInfoWindow();
            }
        });
    }

    private void updateGUI() {

    }

    public JPanel getPanel() {
        return panel;
    }
}
