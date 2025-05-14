// MiniShell.java
package src;

import java.util.Scanner;

/**
 * This class represents a simple command-line shell
 * that allows interaction with the file system.
 */

public class MiniShell {
    /**
     * The main entry point of the program.
     * Reads user input and delegates commands to ShellCommandHandler.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShellCommandHandler handler = new ShellCommandHandler();

        System.out.println("Welcome to MiniShell! Type 'help' for a list of commands.");

        while (true) {
            // Display the current directory as a prompt
            System.out.print(handler.getCurrentDirectory().getAbsolutePath() + " > ");
            String input = scanner.nextLine();
            String[] parts = input.trim().split("\\s+", 2); // ← هذا هو التصحيح
            String command = parts[0];
            String argument = parts.length > 1 ? parts[1] : null;


            // Handle user commands
            switch (command) {
                case "pwd":
                    handler.printWorkingDirectory();
                    break;
                case "ls":
                    handler.listDirectory();
                    break;
                case "cd":
                    if (argument != null) handler.changeDirectory(argument);
                    else System.out.println("Missing directory name.");
                    break;
                case "mkdir":
                    if (argument != null) handler.makeDirectory(argument);
                    else System.out.println("Missing directory name.");
                    break;
                case "touch":
                    if (argument != null) handler.createFile(argument);
                    else System.out.println("Missing file name.");
                    break;
                case "help":
                    handler.printHelp();
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Unknown command. Type 'help' to see available commands.");
            }
        }
    }
}

