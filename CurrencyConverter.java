import java.util.Locale;
import java.util.Scanner;

    //Be aware that the conversion rates are not live, they are from 8/4/2021

public class CurrencyConverter extends OptionsMenu implements CurrencyGUI{

    Scanner sc = new Scanner(System.in);

    public boolean convert(){
        System.out.println("Every conversion will cost you $1 from the currency you are converting from.");

        if(bankAccount.getBalanceDenar() + bankAccount.getBalancePound() + bankAccount.getBalanceEuro() + bankAccount.getBalanceDollar() + bankAccount.getBalanceYen() == 0.0)
            System.out.println("Your account is currently empty!");
        else {
            System.out.println("Currencies available for converting:");
            if (bankAccount.getBalanceDenar() >= 51.92)
                System.out.println("Denar");
            if (bankAccount.getBalancePound() >= 0.72)
                System.out.println("Pound");
            if (bankAccount.getBalanceEuro() >= 0.84)
                System.out.println("Euro");
            if (bankAccount.getBalanceDollar() >= 1.0)
                System.out.println("Dollar");
            if (bankAccount.getBalanceYen() >= 109.25)
                System.out.println("Yen");
            switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                case "back":
                case "b":
                    break;
                case "denar":
                    System.out.println("Convert to:");
                    System.out.println("Pound\nEuro\nDollar\nYen\nPress 'b' to go back");
                    switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                        case "b":
                            break;
                        case "pound":
                            bankAccount.withdrawBalanceDenar(51.92);    //12300-51.92
                            bankAccount.depositBalancePound(bankAccount.getBalanceDenar() * 0.014);   //0
                            bankAccount.withdrawBalanceDenar(bankAccount.getBalanceDenar());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "euro":
                            bankAccount.withdrawBalanceDenar(51.92);
                            bankAccount.depositBalanceEuro(bankAccount.getBalanceDenar() * 0.016);
                            bankAccount.withdrawBalanceDenar(bankAccount.getBalanceDenar());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "dollar":
                            bankAccount.withdrawBalanceDenar(51.92);
                            bankAccount.depositBalanceDollar(bankAccount.getBalanceDenar() * 0.019);
                            bankAccount.withdrawBalanceDenar(bankAccount.getBalanceDenar());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "yen":
                            bankAccount.withdrawBalanceDenar(51.92);
                            bankAccount.depositBalanceYen(bankAccount.getBalanceDenar() * 2.11);
                            bankAccount.withdrawBalanceDenar(bankAccount.getBalanceDenar());
                            System.out.println("Conversion Successful!");
                            return false;
                        default:
                            System.out.println("Please select a valid option!");
                            return true;
                    }
                case "pound":
                    System.out.println("Convert to:");
                    System.out.println("Denar\nEuro\nDollar\nYen\nPress 'b' to go back");
                    switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                        case "b":
                            break;
                        case "denar":
                            bankAccount.withdrawBalancePound(0.72);
                            bankAccount.depositBalanceDenar(bankAccount.getBalancePound() * 71.33);
                            bankAccount.withdrawBalancePound(bankAccount.getBalancePound());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "euro":
                            bankAccount.withdrawBalancePound(0.72);
                            bankAccount.depositBalanceEuro(bankAccount.getBalancePound() * 1.15);
                            bankAccount.withdrawBalancePound(bankAccount.getBalancePound());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "dollar":
                            bankAccount.withdrawBalancePound(0.72);
                            bankAccount.depositBalanceDollar(bankAccount.getBalancePound() * 1.37);
                            bankAccount.withdrawBalancePound(bankAccount.getBalancePound());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "yen":
                            bankAccount.withdrawBalancePound(0.72);
                            bankAccount.depositBalanceYen(bankAccount.getBalancePound() * 150.14);
                            bankAccount.withdrawBalancePound(bankAccount.getBalancePound());
                            System.out.println("Conversion Successful!");
                            return false;
                        default:
                            System.out.println("Please select a valid option!");
                            return true;
                    }
                case "euro":
                    System.out.println("Convert to:");
                    System.out.println("Denar\nPound\nDollar\nYen\nPress 'b' to go back");
                    switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                        case "b":
                            break;
                        case "denar":
                            bankAccount.withdrawBalanceEuro(0.84);
                            bankAccount.depositBalanceDenar(bankAccount.getBalanceEuro() * 61.86);
                            bankAccount.withdrawBalanceEuro(bankAccount.getBalanceEuro());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "pound":
                            bankAccount.withdrawBalanceEuro(0.84);
                            bankAccount.depositBalancePound(bankAccount.getBalanceEuro() * 0.87);
                            bankAccount.withdrawBalanceEuro(bankAccount.getBalanceEuro());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "dollar":
                            bankAccount.withdrawBalanceEuro(0.84);
                            bankAccount.depositBalanceDollar(bankAccount.getBalanceEuro() * 1.19);
                            bankAccount.withdrawBalanceEuro(bankAccount.getBalanceEuro());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "yen":
                            bankAccount.withdrawBalanceEuro(0.84);
                            bankAccount.depositBalanceYen(bankAccount.getBalanceEuro() * 130.21);
                            bankAccount.withdrawBalanceEuro(bankAccount.getBalanceEuro());
                            System.out.println("Conversion Successful!");
                            return false;
                        default:
                            System.out.println("Please select a valid option!");
                            return true;
                    }
                case "dollar":
                    System.out.println("Convert to:");
                    System.out.println("Denar\nPound\nEuro\nYen\nPress 'b' to go back");
                    switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                        case "b":
                            break;
                        case "denar":
                            bankAccount.withdrawBalanceDollar(1);
                            bankAccount.depositBalanceDenar(bankAccount.getBalanceDollar() * 51.92);
                            bankAccount.withdrawBalanceDollar(bankAccount.getBalanceDollar());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "pound":
                            bankAccount.withdrawBalanceDollar(1);
                            bankAccount.depositBalancePound(bankAccount.getBalanceDollar() * 0.73);
                            bankAccount.withdrawBalanceDollar(bankAccount.getBalanceDollar());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "euro":
                            bankAccount.withdrawBalanceDollar(1);
                            bankAccount.depositBalanceEuro(bankAccount.getBalanceDollar() * 0.84);
                            bankAccount.withdrawBalanceDollar(bankAccount.getBalanceDollar());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "yen":
                            bankAccount.withdrawBalanceDollar(1);
                            bankAccount.depositBalanceYen(bankAccount.getBalanceDollar() * 109.25);
                            bankAccount.withdrawBalanceDollar(bankAccount.getBalanceDollar());
                            System.out.println("Conversion Successful!");
                            return false;
                        default:
                            System.out.println("Please select a valid option!");
                            return true;
                    }
                case "yen":
                    System.out.println("Convert to:");
                    System.out.println("Denar\nPound\nEuro\nDollar\nPress 'b' to go back");
                    switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                        case "b":
                            break;
                        case "denar":
                            bankAccount.withdrawBalanceYen(109.25);
                            bankAccount.setBalanceDenar(bankAccount.getBalanceYen() * 0.48);
                            bankAccount.withdrawBalanceYen(bankAccount.getBalanceYen());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "pound":
                            bankAccount.withdrawBalanceYen(109.25);
                            bankAccount.setBalancePound(bankAccount.getBalanceYen() * 0.0067);
                            bankAccount.withdrawBalanceYen(bankAccount.getBalanceYen());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "euro":
                            bankAccount.withdrawBalanceYen(109.25);
                            bankAccount.setBalanceEuro(bankAccount.getBalanceYen() * 0.0077);
                            bankAccount.withdrawBalanceYen(bankAccount.getBalanceYen());
                            System.out.println("Conversion Successful!");
                            return false;
                        case "dollar":
                            bankAccount.withdrawBalanceYen(109.25);
                            bankAccount.setBalanceDollar(bankAccount.getBalanceYen() * 0.0091);
                            bankAccount.withdrawBalanceYen(bankAccount.getBalanceYen());
                            System.out.println("Conversion Successful!");
                            return false;
                        default:
                            System.out.println("Please select a valid option!");
                            return true;
                    }
            }
        }
        return true;
        }
}
