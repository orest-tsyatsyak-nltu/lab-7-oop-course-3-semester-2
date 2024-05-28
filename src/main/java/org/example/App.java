package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ChessGame game = new ChessGame();

        Command undoCommand = new UndoCommand(game);
        Command newGameCommand = new NewGameCommand(game);
        Scanner consoleInput = new Scanner(System.in);
        String enteredCommand = "";
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Enter command [new game, make move, undo, print made moves, end]:");
            enteredCommand = consoleInput.nextLine();
            switch (enteredCommand) {
                case "new game":
                    newGameCommand.execute();
                    System.out.println("New game started.");
                    break;
                case "make move":
                    System.out.println("Enter move in format: {grid} to {grid}");
                    String move = consoleInput.nextLine();
                    new MoveCommand(game, move).execute();
                    System.out.println("Move made: " + move);
                    break;
                case "undo":
                    try{
                        undoCommand.execute();
                        System.out.println("Last move undone");
                    } catch (IllegalStateException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "print made moves":
                    game.printMoves();
                    break;
                case "end":
                    isRunning = false;
                    break;
                default:
                    System.out.println("There is no such command: " + enteredCommand);
            }
        }
    }
}
