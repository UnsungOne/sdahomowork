package sda.homework.collectionsandoop.Task_6;

public class Context {
    private UnitConverter unitConverter;

    public Context(UnitConverter unitConverter) {
        this.unitConverter = unitConverter;
    }
    public double runStrategy(double userDefinedData){
        return unitConverter.convert(userDefinedData);
    }
}
