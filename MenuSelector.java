import java.util.Locale;
import java.util.Scanner;


public class MenuSelector extends Bank implements CurrencyGUI {
    static boolean optionActive = true;
    static boolean depositCurrencyMenuActive = true;
    static boolean withdrawCurrencyMenuActive = true;


    public void selectMenu(String mn) {
        BankAccount bankAccount = new BankAccount();
        SavedUsers savedUsers = new SavedUsers();
        Scanner sc = new Scanner(System.in);

        DepositSystem depositSystem = new DepositSystem();
        WithdrawalSystem withdrawalSystem = new WithdrawalSystem();
        BalanceSystem balanceSystem = new BalanceSystem();
        OptionsMenu optionsMenu = new OptionsMenu();
        CurrencyConverter currencyConverter = new CurrencyConverter();

        String passVerificator = "";

        switch (mn.toLowerCase(Locale.ROOT).trim()) {

            case "deposit":
            case "+":
                while (depositSystem.depositSystem());
                //depositSystem.depositSystem();
                break;

            case "withdraw":
            case "-":
                System.out.println("You Must Verify Your Password First!");
                passVerificator = sc.next();
                if (passVerificator.equals(bankAccount.getPassword())) {
                    System.out.println("Password Is Correct!");
                    while (withdrawalSystem.withdrawalSystem());
                } else {
                    System.out.println("Password is incorrect!");
                }
                break;

            case "balance":
            case "=":
                while (balanceSystem.balanceSystem());
                //balanceSystem.balanceSystem();
                break;


            case "convert":
            case "c":
                System.out.println("You Must Verify Your Password First!");
                passVerificator = sc.next();
                if (passVerificator.equals(bankAccount.getPassword())) {
                    System.out.println("Password Is Correct!");
                    currencyConverter.convert();
                } else {
                    System.out.println("Password is incorrect!");
                }
                break;

            case "sign out":
            case "signout":
            case "/":
                savedUsers.saveUserInfo();
                System.out.println("Signing out..");
                savedUsers.deletePreviousUserInfo();
                innerMenuLoop = false;
                break;

            case "options":
            case "o":
                optionsMenu.optionsMenu();
                break;

            case "turnoff":
                System.out.println("Shutting down..");
                System.exit(0);
                break;
            default:
                System.out.println("You have entered a wrong value!");
        }
    }
}
