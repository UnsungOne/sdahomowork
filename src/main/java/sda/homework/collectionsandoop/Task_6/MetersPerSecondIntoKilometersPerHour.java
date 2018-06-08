package sda.homework.collectionsandoop.Task_6;

public class MetersPerSecondIntoKilometersPerHour implements UnitConverter {
    public double convert(double value) {
        return value * 1000 / 3600;
    }
}
