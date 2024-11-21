package org.example.view;


import org.example.DefaultController;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class MainMenuView extends View {
    public MainMenuView(DefaultController controller) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton createGameButton = new JButton("Create Game");
        JButton joinGameButton = new JButton("Join Game");
        JButton exitButton = new JButton("Exit Game");

        createGameButton.addActionListener(e -> controller.showCreateGameMenu());
        joinGameButton.addActionListener(e -> controller.showJoinGameMenu());
        exitButton.addActionListener(e -> System.exit(0));

        this.add(createGameButton);
        this.add(joinGameButton);
        this.add(exitButton);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent event) {
        // No properties to handle in this view.
    }
}
