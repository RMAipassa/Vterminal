package org.example.view;


import org.example.DefaultController;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class CreateGameMenuView extends View {
    public CreateGameMenuView(DefaultController controller) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton selectConfigButton = new JButton("Select Configuration");
        JButton createConfigButton = new JButton("Create Configuration");
        JButton backButton = new JButton("Back");

        selectConfigButton.addActionListener(e -> controller.showSelectConfigMenu());
        createConfigButton.addActionListener(e -> controller.showUploadConfigMenu());
        backButton.addActionListener(e -> controller.displayMainView());

        this.add(selectConfigButton);
        this.add(createConfigButton);
        this.add(backButton);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent event) {
        // No properties to handle in this view.
    }
}

