package org.example.view;

import org.example.DefaultController;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class SelectConfigView extends View {
    public SelectConfigView(DefaultController controller) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Select a Configuration:");
        String[] configs = {"Config1", "Config2", "Config3"};

        // Create a button group to allow only one selection
        ButtonGroup buttonGroup = new ButtonGroup();

        // Add radio buttons for each configuration
        for (String config : configs) {
            JRadioButton radioButton = new JRadioButton(config);
            buttonGroup.add(radioButton);
            this.add(radioButton);
        }

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> controller.showCreateGameMenu());

        this.add(Box.createVerticalStrut(10)); // Spacer
        this.add(backButton);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent event) {
        // No properties to handle in this view.
    }
}
