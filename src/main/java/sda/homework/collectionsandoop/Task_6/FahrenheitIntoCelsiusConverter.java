package sda.homework.collectionsandoop.Task_6;

public class FahrenheitIntoCelsiusConverter implements UnitConverter {
    public double convert(double value) {
        return (value - 32) * 5 / 9;
    }
}
