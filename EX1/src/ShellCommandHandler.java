// ShellCommandHandler.java
package src;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * This class handles shell-like file system commands,
 * such as changing directories, listing contents, creating files and folders.
 */
public class ShellCommandHandler {

    // The current directory the user is working in
    private File currentDirectory;

    /**
     * Constructor that sets the current directory to the user's working directory.
     */
    public ShellCommandHandler() {
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    /**
     * Prints the absolute path of the current working directory.
     */
    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    /**
     * Lists all files and folders in the current directory.
     */
    public void listDirectory() {
        File[] files = currentDirectory.listFiles();
        if (files != null) {
            Arrays.stream(files).forEach(f -> System.out.println("[FILE] " + f.getName()));
        } else {
            System.out.println("Cannot read current directory.");
        }
    }

    /**
     * Changes the current directory to the specified folder name,
     * if it exists inside the current directory.
     *
     * @param name The name of the directory to change to.
     */
    public void changeDirectory(String name) {
        if (name.equals("..")) {
            currentDirectory = currentDirectory.getParentFile();
            return;
        }

        File newDir = new File(currentDirectory, name);
        if (newDir.exists() && newDir.isDirectory()) {
            currentDirectory = newDir;
        } else {
            System.out.println("Directory does not exist.");
        }
    }

    /**
     * Creates a new folder in the current directory.
     *
     * @param name The name of the new folder.
     */
    public void makeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
        if (!newDir.exists()) {
            if (newDir.mkdir()) {
                System.out.println("Directory created: " + name);
            } else {
                System.out.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }

    /**
     * Creates a new empty file in the current directory.
     *
     * @param name The name of the file to create.
     */
    public void createFile(String name) {
        File newFile = new File(currentDirectory, name);
        if (!newFile.exists()) {
            try {
                if (newFile.createNewFile()) {
                    System.out.println("File created: " + name);
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists.");
        }
    }

    /**
     * Displays the list of available commands and how to use them.
     */
    public void printHelp() {
        System.out.println("Supported commands:");
        System.out.println("pwd           - Show current directory path");
        System.out.println("ls            - List contents of the current directory");
        System.out.println("cd [dir]      - Change to directory (.. to go back)");
        System.out.println("mkdir [dir]   - Create a new directory");
        System.out.println("touch [file]  - Create a new file");
        System.out.println("help          - Show this help message");
        System.out.println("exit          - Exit the shell");
    }

    /**
     * Returns the current working directory.
     *
     * @return File object representing the current directory.
     */
    public File getCurrentDirectory() {
        return currentDirectory;
    }
}
