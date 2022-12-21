package ATM;

import java.util.Scanner;

public class AtmMenu extends ATM.Currency {

    public String GetInputFromUser() {
        Scanner input = new Scanner(System.in);
        String inputValue = input.next();
        input.close();
        inputValue = inputValue.toUpperCase();
        return inputValue;
    }
    public void MenuScreen() {

    }
    public void DepositMoney() {
        balance += 100;
    }
}
