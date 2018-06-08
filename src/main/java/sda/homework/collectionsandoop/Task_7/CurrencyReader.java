package sda.homework.collectionsandoop.Task_7;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CurrencyReader {

    private static final String CURRENCY_FILENAME = "currencies.json";
    static Gson gson = new Gson();

    public List<CurrencyModel> readCurrenciesFromFile() {
        try {
            String json = FileUtils.readFileToString(new File(CURRENCY_FILENAME), "UTF-8");
            Type type = new TypeToken<List<CurrencyModel>>() {
            }.getType();
            List<CurrencyModel> temp = gson.fromJson(json, type);
            return temp != null ? temp : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Failed to read from file: " + e.getLocalizedMessage());
            return new ArrayList<>();
        }
    }
}
