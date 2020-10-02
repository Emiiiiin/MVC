package view;

import control.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class StartPanelHandler {

    private MainController mainController;
    private MainView mainView;
    private PanelHandler panelHandler;
    private JPanel panel;
    private JButton startButton;
    private JLabel label1;

    public StartPanelHandler(MainController mainController, MainView mainView, PanelHandler panelHandler) {
        this.mainController = mainController;
        this.panelHandler = panelHandler;
        this.mainView = mainView;

        createButtons();
        updateGUI();
        label1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                label1.setText("<html><body><font size=\"+3\">Willkommen beim fantastischsten,<br>atemberaubendsten und spannendsten Spiel.</font></body></html>");
            }
        });

    }

    private void createButtons() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.switchToPanel(panelHandler.getPanel());
            }
        });
    }

    private void updateGUI() {

    }

    public JPanel getPanel(){
        return panel;
    }
}
