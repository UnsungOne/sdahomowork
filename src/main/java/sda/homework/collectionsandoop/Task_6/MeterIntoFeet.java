package sda.homework.collectionsandoop.Task_6;

public class MeterIntoFeet implements UnitConverter  {
    private static final double feetValue = 3.2808;
    public double convert(double value) {
        return value * feetValue;
    }
}
