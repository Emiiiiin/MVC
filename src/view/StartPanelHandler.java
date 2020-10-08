package view;

import control.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class StartPanelHandler {

    private MainController mainController;
    private JPanel panel;
    private JButton startButton;
    private JLabel label1;

    public StartPanelHandler(MainController mainController) {
        this.mainController = mainController;

        createButtons();
        updateGUI();
    }

    private void createButtons() {
        label1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                label1.setText("<html><body><font size=\"+3\">Willkommen beim fantastischsten,<br>atemberaubendsten und spannendsten Spiel.</font></body></html>");
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.switchToPanel(2);
            }
        });
    }

    private void updateGUI() {

    }

    public JPanel getPanel(){
        return panel;
    }
}
