import java.util.Locale;
import java.util.Scanner;

public class DepositSystem extends MenuSelector {

    BankAccount bankAccount = new BankAccount();
    Scanner sc = new Scanner(System.in);

    public boolean depositSystem(){
        System.out.println(currencyGUI);
        do {
            switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                case "back":
                case "b":
                    return false;
                case "denar":
                    System.out.println("Enter Amount:\n");
                    bankAccount.depositBalanceDenar(sc.nextDouble());
                    return false;
                case "pound":
                    System.out.println("Enter Amount:\n");
                    bankAccount.depositBalancePound(sc.nextDouble());
                    return false;
                case "euro":
                    System.out.println("Enter Amount:\n");
                    bankAccount.depositBalanceEuro(sc.nextDouble());
                    return false;
                case "dollar":
                    System.out.println("Enter Amount:\n");
                    bankAccount.depositBalanceDollar(sc.nextDouble());
                    return false;
                case "yen":
                    System.out.println("Enter Amount:\n");
                    bankAccount.depositBalanceYen(sc.nextDouble());
                    return false;
                default:
                    System.out.println("Please select a valid currency!");
                    break;
            }
        } while (depositCurrencyMenuActive);

        return true;
    }
}
