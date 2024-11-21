package org.example.view;


import org.example.DefaultController;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class UploadConfigView extends View {
    public UploadConfigView(DefaultController controller) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Upload a Configuration File:");
        JButton uploadButton = new JButton("Upload");
        JButton backButton = new JButton("Back");

        backButton.addActionListener(e -> controller.showCreateGameMenu());

        this.add(label);
        this.add(uploadButton);
        this.add(backButton);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent event) {
        // No properties to handle in this view.
    }
}

