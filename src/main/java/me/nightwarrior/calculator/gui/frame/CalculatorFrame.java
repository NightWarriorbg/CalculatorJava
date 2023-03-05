package me.nightwarrior.calculator.gui.frame;

import lombok.Getter;
import lombok.Setter;
import me.nightwarrior.calculator.gui.panel.ButtonsPanel;
import me.nightwarrior.calculator.gui.panel.CalculationPanel;
import me.nightwarrior.calculator.gui.panel.MenuPanel;

import javax.swing.*;
import java.awt.*;

@Setter
@Getter
public class CalculatorFrame extends JFrame {
    private final String title;
    private int width;
    private int height;

    public CalculatorFrame(String title, int width, int height) {
        super(title);
        this.title = title;
        this.width = width;
        this.height = height;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(getWidth(), getHeight());
        initGUI();
    }

    private void initGUI() {
        JPanel window = new JPanel();
        window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));

        // Menu Panel
        MenuPanel menuPanel = new MenuPanel(this);
        menuPanel.setBackground(Color.RED);
        window.add(menuPanel);

        // Calculation Panel
        CalculationPanel calculationPanel = new CalculationPanel();
        calculationPanel.setBackground(Color.GREEN);
        window.add(calculationPanel);

        // Buttons Panel
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        buttonsPanel.setBackground(Color.BLUE);
        window.add(buttonsPanel);

        setVisible();
    }

    public void setVisible() {
        this.setVisible(true);
    }
}