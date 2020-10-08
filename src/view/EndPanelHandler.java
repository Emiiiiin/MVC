package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class EndPanelHandler {
    private MainController mainController;
    private JLabel endLabel;
    private JPanel panel;

    public EndPanelHandler(MainController mainController) {
        this.mainController = mainController;
        createButtons();
        updateGUI();
    }

    private void createButtons() {
            endLabel.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                endLabel.setText("The most fantastic Game has end. Close the Window");
                }
            });
        }
    private void updateGUI() {

    }

    public JPanel getPanel(){
        return panel;
    }
}
