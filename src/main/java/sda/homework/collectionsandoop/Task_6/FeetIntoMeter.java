package sda.homework.collectionsandoop.Task_6;

public class FeetIntoMeter implements UnitConverter {
    private static final double feetValue = 0.3048;
    public double convert(double value) {
        return value * feetValue;
    }
}
