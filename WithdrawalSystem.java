import java.util.Locale;
import java.util.Scanner;

public class WithdrawalSystem extends MenuSelector{

    BankAccount bankAccount = new BankAccount();
    Scanner sc = new Scanner(System.in);

    public boolean withdrawalSystem(){

        if(bankAccount.getBalanceDenar() > 0.01)
            System.out.println("Denar");
        if(bankAccount.getBalancePound() > 0.01)
            System.out.println("Pound");
        if(bankAccount.getBalanceEuro() > 0.01)
            System.out.println("Euro");
        if(bankAccount.getBalanceDollar() > 0.01)
            System.out.println("Dollar");
        if(bankAccount.getBalanceYen() > 0.01)
            System.out.println("Yen");
        if(bankAccount.getBalanceDenar() + bankAccount.getBalancePound() + bankAccount.getBalanceEuro() + bankAccount.getBalanceDollar() + bankAccount.getBalanceYen() <= 0.01)
            System.out.println("Your account is currently empty!");

        while (withdrawCurrencyMenuActive) {
            switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                case "back":
                case "b":
                    return false;

                case "denar":
                    System.out.println("Enter Amount:\n");
                    double tempDen = sc.nextDouble();
                    if(tempDen > bankAccount.getBalanceDenar()) {
                        System.out.println(
                                "Insufficient funds in this currency!");
                        break;
                    }
                    else
                        bankAccount.withdrawBalanceDenar(tempDen);
                    return false;

                /////////////////////////////////////////////////


                case "pound":
                    System.out.println("Enter Amount:\n");
                    double tempPnd = sc.nextDouble();
                    if(tempPnd > bankAccount.getBalancePound()) {
                        System.out.println(
                                "Insufficient funds in this currency!");
                    }
                    else
                        bankAccount.withdrawBalancePound(tempPnd);
                    return false;

                /////////////////////////////////////////////////

                case "euro":
                    System.out.println("Enter Amount:\n");
                    double tempEur = sc.nextDouble();
                    if(tempEur > bankAccount.getBalanceEuro()) {
                        System.out.println(
                                "Insufficient funds in this currency!");
                    }
                    else
                        bankAccount.withdrawBalanceEuro(tempEur);
                    return false;

                //////////////////////////////////////////////////

                case "dollar":
                    System.out.println("Enter Amount:\n");
                    double tempDol = sc.nextDouble();
                    if(tempDol > bankAccount.getBalanceDollar()) {
                        System.out.println(
                                "Insufficient funds in this currency!");
                    }
                    else
                        bankAccount.withdrawBalanceDollar(tempDol);
                    return false;

                ////////////////////////////////////////////////////

                case "yen":
                    System.out.println("Enter Amount:\n");
                    double tempYen = sc.nextDouble();
                    if(tempYen > bankAccount.getBalanceYen()) {
                        System.out.println(
                                "Insufficient funds in this currency!");
                    }
                    else
                        bankAccount.withdrawBalanceYen(tempYen);
                    return false;

                default:
                    System.out.println("Please select a currency again!");
                    withdrawCurrencyMenuActive=true;
                    break;
            }
            withdrawCurrencyMenuActive=true;
        }

        return true;
    }
}
