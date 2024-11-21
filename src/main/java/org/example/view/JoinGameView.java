package org.example.view;

import org.example.DefaultController;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class JoinGameView extends View {
    private JRadioButton selectedRadioButton;

    public JoinGameView(DefaultController controller) {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Available Games:");
        String[] games = {"Game1", "Game2", "Game3"};

        // Create a button group to allow only one selection
        ButtonGroup buttonGroup = new ButtonGroup();

        // Add radio buttons for each game
        for (String game : games) {
            JRadioButton radioButton = new JRadioButton(game);
            buttonGroup.add(radioButton);
            radioButton.addActionListener(e -> selectedRadioButton = radioButton);
            this.add(radioButton);
        }

        JButton joinButton = new JButton("Join");
        joinButton.addActionListener(e -> {
            if (selectedRadioButton != null) {
                String selectedGame = selectedRadioButton.getText();
                connectToGame(selectedGame); // Placeholder method
            } else {
                JOptionPane.showMessageDialog(this, "Please select a game to join.", "No Selection", JOptionPane.WARNING_MESSAGE);
            }
        });

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> controller.displayMainView());

        this.add(Box.createVerticalStrut(10)); // Spacer
        this.add(joinButton);
        this.add(backButton);
    }

    private void connectToGame(String game) {
        // Placeholder method for connecting to the selected game
        System.out.println("Connecting to game: " + game);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent event) {
        // No properties to handle in this view.
    }
}

