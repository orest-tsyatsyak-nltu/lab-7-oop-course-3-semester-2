package org.example;

public class UndoCommand implements Command {
    private ChessGame game;

    public UndoCommand(ChessGame game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.undoMove();
    }

}
