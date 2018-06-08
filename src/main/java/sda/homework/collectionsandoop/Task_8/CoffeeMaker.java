package sda.homework.collectionsandoop.Task_8;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CoffeeMaker {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getProductsById(scanner.nextInt()));

    }

    @NonNull
    private static Drink getProductsById(int drinkID) {
        System.out.println("Select drink: ");
        while (true) {

            try {
                List<Drink> drinkList = new ArrayList<Drink>();
                drinkList.add(new Drink(1, "Americano", 25));
                drinkList.add(new Drink(2, "Cappucino", 25));
                drinkList.add(new Drink(3, "Espresso", 25));
                drinkList.add(new Drink(4, "Latte", 25));
                drinkList.add(new Drink(5, "Mocha", 25));
                drinkList.add(new Drink(6, "Machiato", 25));
                drinkID = scanner.nextInt();
                for (Drink drink : drinkList) {
                    if (drinkID == drink.getID()) {
                        return drinkList.get(drinkID - 1);
                    } else {
                        throw new NumberFormatException("There is no coffee you provided");
                    }
                }
                return drinkList.get(drinkID);

            } catch (InputMismatchException e) {
                System.out.println("Wrong type!");
                scanner.nextLine();
            }
        }

    }

}