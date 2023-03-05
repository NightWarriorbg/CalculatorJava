package me.nightwarrior.calculator.gui.panel;

import me.nightwarrior.calculator.Constants;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    private JFrame frame;

    public MenuPanel(JFrame frame) {
        this.frame = frame;
        initGUI();
    }

    public void initGUI() {
        this.setPreferredSize(new Dimension(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT / 4));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu  = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        JMenuItem settingsMenuItem = new JMenuItem("Settings");
        fileMenu.add(settingsMenuItem);

        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.setVisible(true);
    }

}
