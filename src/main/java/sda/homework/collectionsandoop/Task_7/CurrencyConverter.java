package sda.homework.collectionsandoop.Task_7;

public class CurrencyConverter {

    public static void main(String[] args) {
        CurrencyReader currencyReader = new CurrencyReader();
        System.out.println(currencyReader.readCurrenciesFromFile());
    }

}
