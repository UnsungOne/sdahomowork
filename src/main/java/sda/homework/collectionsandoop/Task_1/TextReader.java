package sda.homework.collectionsandoop.Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextReader {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter words: ");
        System.out.println(getUserText(scanner.nextLine()));
    }

    static List<String> getUserText(String userData) {
        List<String> stringList = new ArrayList<String>();
        stringList.add(userData);
        return stringList;
    }
}