package ATM;

public class AtmFucntions extends Currency{
    public void currencyConvert(String currency1,String currency2){
       int a =  searchCurrency(currency1);
       int b = searchCurrency(currency2);
        System.out.println(a+b);
    }
}
