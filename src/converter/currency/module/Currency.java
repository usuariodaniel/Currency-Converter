package converter.currency.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Currency {
    public double ConvertertoBrl(double newConverter){

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(newConverter);

        return newConverter;
    }
}
