package sda.homework.collectionsandoop.Task_4;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class CollectionChecker {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Add numbers: ");
            } catch (InputMismatchException e) {
                System.out.println("Invalid type!");
                scanner.nextLine();
            }
        }
    }

    }
