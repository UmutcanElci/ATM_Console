import ATM.AtmMenu;
import ATM.Currency;

public class Main {
    public static void main(String[] args) {
        AtmMenu menu = new AtmMenu();
        Currency currency = new Currency();
        //currency.PrintCurrencies();
        currency.SearchCurrency(menu.GetInputFromUser());
        menu.DepositMoney();
        System.out.println(currency.CurrencyConversion("TL", "EUR"));
    }
}