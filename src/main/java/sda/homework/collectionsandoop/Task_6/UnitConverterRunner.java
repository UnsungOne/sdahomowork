package sda.homework.collectionsandoop.Task_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnitConverterRunner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double myValue;

        while (true) {
            System.out.println(
                    "Select converter: " +
                            "\n 1 - Fehrenheit into Celsius" +
                            "\n 2 - Celsius into Fehrenheit" +
                            "\n 3 - Meter into Feet" +
                            "\n 4 - Feet into Meter" +
                            "\n 5 - Km/h into m/s" +
                            "\n 6 - M/s into km/h" +
                            "\n -----------------------");
            int choices;
            choices = scanner.nextInt();
            scanner.nextLine();
            switch (choices) {
                case 1:
                    try {
                        Context context = new Context(new FahrenheitIntoCelsiusConverter());
                        myValue = scanner.nextDouble();
                        System.out.println(myValue + " into Celsius equals: " + context.runStrategy(myValue));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid type");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    try {
                        Context context = new Context(new CelsiusIntoFahrenheitConverter());
                        myValue = scanner.nextDouble();
                        System.out.println(myValue + " into Fehrenheit equals: " + context.runStrategy(myValue));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid type");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    try {
                        Context context = new Context(new MeterIntoFeet());
                        myValue = scanner.nextDouble();
                        System.out.println(myValue + " into Feet equals: " + context.runStrategy(myValue));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid type");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    try {
                        Context context = new Context(new FeetIntoMeter());
                        myValue = scanner.nextDouble();
                        System.out.println(myValue + " into Meter equals: " + context.runStrategy(myValue));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid type");
                        scanner.nextLine();
                    }
                    break;
                case 5:
                    try {
                        Context context = new Context(new KilometersPerHourIntoMetersPerSecond());
                        myValue = scanner.nextDouble();
                        System.out.println(myValue + " into m/s equals: " + context.runStrategy(myValue));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid type");
                        scanner.nextLine();
                    }
                case 6:
                    try {
                        Context context = new Context(new MetersPerSecondIntoKilometersPerHour());
                        myValue = scanner.nextDouble();
                        System.out.println(myValue + " into m/s equals: " + context.runStrategy(myValue));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid type");
                        scanner.nextLine();
                    }

                default:
                    return;
            }

        }
    }
}