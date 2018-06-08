package sda.homework.collectionsandoop.Task_7;

import lombok.*;

import java.util.List;
@Setter
@Getter
@EqualsAndHashCode

public class CurrencyModel {
    private String currencyCode;
    private Rates rates;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***** Here are the current rates *****\n");
        sb.append("Code=" + getCurrencyCode() + "\n");
        sb.append("Rates=" + getRates() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }
}

