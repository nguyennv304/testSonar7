/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201_he182568_lab7_binarysearchtree;

/**
 *
 * @author VAN NGUYEN
 */

    import java.util.Scanner;

public class Manager {
    private StudentTree tree;
    private Scanner scanner;

    public Manager() {
        tree = new StudentTree();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Student");
            System.out.println("2. Find Student by Score");
            System.out.println("3. Find Highest Score");
            System.out.println("4. Delete Student by Score");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Validate.checkIntegerLimit(1,5);
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = Validate.checkString();
                    System.out.print("Enter student score: ");
                    int score = Validate.checkInteger();
                    tree.setRoot(tree.insert(tree.getRoot(), name, score));
                    break;
                case 2:
                    System.out.print("Enter score to find: ");
                    score = Validate.checkInteger();
                    StudentNode found = tree.findStudentByScore(tree.getRoot(), score);
                    if (found != null) {
                        System.out.println("Found: " + found.name + " with score " + found.score);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    StudentNode highest = tree.findHighestScore(tree.getRoot());
                    if (highest != null) {
                        System.out.println("Highest Score: " + highest.name + " with score " + highest.score);
                    } else {
                        System.out.println("No students in the tree.");
                    }
                    break;
                case 4:
                    System.out.print("Enter score to delete: ");
                    score = Validate.checkInteger();
                    tree.setRoot(tree.deleteNode(tree.getRoot(), score));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
