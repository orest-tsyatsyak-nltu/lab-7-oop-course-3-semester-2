package org.example;


public class MoveCommand implements Command {
    private ChessGame game;
    private String move;

    public MoveCommand(ChessGame game, String move) {
        this.game = game;
        this.move = move;
    }

    @Override
    public void execute() {
        game.makeMove(move);
    }

}
