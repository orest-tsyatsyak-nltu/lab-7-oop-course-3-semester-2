package org.example;


import java.util.Stack;

public class ChessGame {
    private Stack<String> moves = new Stack<>();

    public void newGame() {
        moves.clear();
    }

    public void makeMove(String move) {
        moves.push(move);
    }

    public void undoMove() {
        if (!moves.isEmpty()) {
            moves.pop();
        } else {
            throw new IllegalStateException("No moves to undo.");
        }
    }

    public void printMoves() {
        System.out.println("Current moves: " + moves);
    }
}
