import java.math.*;
import java.util.*;

public class BalanceSystem extends MenuSelector{

    BankAccount bankAccount = new BankAccount();

    public boolean balanceSystem(){
        System.out.println("\n-----------------------BALANCE-----------------------");
        if(bankAccount.getBalanceDenar() > 0.01){
        System.out.printf("\t\t\t\t\t" + "  ден. " + "%.2f", bankAccount.getBalanceDenar());
        System.out.println();}
        if(bankAccount.getBalancePound() > 0.01){
        System.out.printf("\t\t\t\t\t" + "   £   "   + "%.2f", bankAccount.getBalancePound());
        System.out.println();}
        if(bankAccount.getBalanceEuro() > 0.01){
        System.out.printf("\t\t\t\t\t" + "   €   "   + "%.2f", bankAccount.getBalanceEuro());
        System.out.println();}
        if(bankAccount.getBalanceDollar() > 0.01){
        System.out.printf("\t\t\t\t\t" + "   $   "   + "%.2f", bankAccount.getBalanceDollar());
        System.out.println();}
        if(bankAccount.getBalanceYen() > 0.01){
        System.out.printf("\t\t\t\t\t" + "   ¥   "   + "%.2f", bankAccount.getBalanceYen());
        System.out.println();}
        if(bankAccount.getBalanceDenar() + bankAccount.getBalancePound() + bankAccount.getBalanceEuro() + bankAccount.getBalanceDollar() + bankAccount.getBalanceYen() <= 0.01)
        System.out.println("         Your account is currently empty!");
        System.out.println("-----------------------BALANCE-----------------------\n");
        return false;
    }
}
