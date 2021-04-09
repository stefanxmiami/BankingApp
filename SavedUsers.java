import java.util.List;
import java.util.ArrayList;

public class SavedUsers {
    BankAccount bankAccount = new BankAccount();
    static List<String> listFirstNames = new ArrayList<>();
    static List<String> listLastNames = new ArrayList<>();
    static List<String> listUserNames = new ArrayList<>();
    static List<String> listPasswords = new ArrayList<>();
    static List<Integer> listAccountNumbers = new ArrayList<>();
    static List<Double> listBalance = new ArrayList<>();
    static List<Double> listBalanceDenar = new ArrayList<>();
    static List<Double> listBalancePound = new ArrayList<>();
    static List<Double> listBalanceEuro = new ArrayList<>();
    static List<Double> listBalanceDollar = new ArrayList<>();
    static List<Double> listBalanceYen = new ArrayList<>();

    public void saveUserInfo(){
        listFirstNames.add(bankAccount.getClientFirstName());
        listLastNames.add(bankAccount.getClientLastName());
        listUserNames.add(bankAccount.getUsername());
        listPasswords.add(bankAccount.getPassword());
        listAccountNumbers.add(bankAccount.getClientAccNumber());
        //Currencies
        listBalanceDenar.add(bankAccount.getBalanceDenar());
        listBalancePound.add(bankAccount.getBalancePound());
        listBalanceEuro.add(bankAccount.getBalanceEuro());
        listBalanceDollar.add(bankAccount.getBalanceDollar());
        listBalanceYen.add(bankAccount.getBalanceYen());
    }
    public void parseUserInfoOnLogin(int accountNumber){
        bankAccount.setUsername(listUserNames.get(accountNumber));
        bankAccount.setPassword(listPasswords.get(accountNumber));
        bankAccount.setClientFirstName(listFirstNames.get(accountNumber));
        bankAccount.setClientLastName(listLastNames.get(accountNumber));
        bankAccount.setClientAccNumber(accountNumber);
        bankAccount.setBalanceDenar (listBalanceDenar.get (accountNumber));
        bankAccount.setBalancePound (listBalancePound.get (accountNumber));
        bankAccount.setBalanceEuro  (listBalanceEuro.get  (accountNumber));
        bankAccount.setBalanceDollar(listBalanceDollar.get(accountNumber));
        bankAccount.setBalanceYen   (listBalanceYen.get   (accountNumber));
    }
    public void deletePreviousUserInfo(){
        bankAccount.setUsername(null);
        bankAccount.setPassword(null);
        bankAccount.setClientFirstName(null);
        bankAccount.setClientLastName(null);
        bankAccount.setClientAccNumber(0);
        bankAccount.setBalanceDenar(0.0);
        bankAccount.setBalancePound(0.0);
        bankAccount.setBalanceEuro(0.0);
        bankAccount.setBalanceDollar(0.0);
        bankAccount.setBalanceYen(0.0);
    }
}
