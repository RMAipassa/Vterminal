package org.example;


import org.example.view.*;

public class DefaultController extends Controller {

    public void displayMainView() {
        this.removeAllViews();
        View mainMenuView = new MainMenuView(this);
        this.addView(mainMenuView);
    }

    public void showCreateGameMenu() {
        this.removeAllViews();
        View createGameMenuView = new CreateGameMenuView(this);
        this.addView(createGameMenuView);
    }

    public void showSelectConfigMenu() {
        this.removeAllViews();
        View selectConfigView = new SelectConfigView(this);
        this.addView(selectConfigView);
    }

    public void showUploadConfigMenu() {
        this.removeAllViews();
        View uploadConfigMenu = new UploadConfigView(this);
        this.addView(uploadConfigMenu);
    }

    public void showJoinGameMenu() {
        this.removeAllViews();
        View joinGameMenu = new JoinGameView(this);
        this.addView(joinGameMenu);
    }
}
