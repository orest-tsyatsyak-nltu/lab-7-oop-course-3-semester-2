package org.example;

public class NewGameCommand implements Command {
    private ChessGame game;

    public NewGameCommand(ChessGame game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.newGame();
    }

}
