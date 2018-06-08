package sda.homework.collectionsandoop.Task_3;

import java.util.*;

public class NumberReader {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Double> doubleList = new ArrayList<Double>();

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Add numbers: ");
                getUserNumbers(scanner.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Invalid type!");
                scanner.nextLine();
            }
        }
    }

    static List<Double> getUserNumbers(double userNumbers) {
        List<Double> myList = new ArrayList<Double>();
        ListIterator<Double> iterator = myList.listIterator();
        while (iterator.hasNext()) {
            for (Double myDouble : myList) {
                if (myDouble == -1)
                    iterator.add(userNumbers);
            }

        }
        return myList;
    }
}