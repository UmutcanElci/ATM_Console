package ATM;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    public HashMap<String, Float> currency = new HashMap<String, Float>();
    public float balance = 100;

    public Currency() {
        currency.put("TL", 1f);
        currency.put("USD", 18.67f);
        currency.put("EUR", 19.82f);
    }
    
    public void PrintCurrencies() {
        for (String name : currency.keySet()) {
            System.out.println("Key: " + name + " | " + "Value: " + currency.get(name) + " TL");
        }
    }

    public void SearchCurrency(String targetCurrency) {
        if(currency.containsKey(targetCurrency))
            System.out.println("Currency: " + targetCurrency + " | " + "Current Value: " + currency.get(targetCurrency) + " TL");
        else
            System.out.println(targetCurrency + " does not exist.");
    }

    public float CurrencyConversion(String currencyA, String currencyB) {
        if(currency.containsKey(currencyA) && currency.containsKey(currencyB)) {
            float aValue = currency.get(currencyA);
            float bValue = currency.get(currencyB);
            float ratio = aValue/bValue;
            float result = balance * ratio;
            return result;
        }
        System.out.println("Currency not found!");
        return -1;
    }
}
