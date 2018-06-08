package sda.homework.collectionsandoop.Task_6;

public class CelsiusIntoFahrenheitConverter implements UnitConverter {
    public double convert(double value) {
        return value * 9/5 + 32;
    }
}
