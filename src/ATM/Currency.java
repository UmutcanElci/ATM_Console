package ATM;

import java.util.HashMap;

public abstract class Currency {
    private HashMap<String,Integer> currency = new HashMap<>();

    public Currency() {
        currency.put("TR",1);
        currency.put("USD",18);
        currency.put("EU",1);
    }

    public HashMap<String, Integer> getCurrency() {
        System.out.println(currency+ " ");
        return currency;
    }
    public void searchCurrency(String currencyName){
       String a = currencyName.toUpperCase();
        System.out.println(currency.get(a));
    }

    public void addCurrency(String currencyName,Integer currencyValue) {
        currency.put(currencyName,currencyValue);
    }
}
