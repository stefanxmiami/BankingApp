import java.util.List;
import java.util.ArrayList;

public class SavedUsers {
    BankAccount bankAccount = new BankAccount();
    static List<String> listFirstNames = new ArrayList<>();
    static List<String> listLastNames = new ArrayList<>();
    static List<String> listUserNames = new ArrayList<>();
    static List<String> listPasswords = new ArrayList<>();
    static List<Integer> listAccountNumbers = new ArrayList<Integer>();
    static List<Double> listBalance = new ArrayList<Double>();

    public void saveUserInfo(){
        //BankAccount bankAccount = new BankAccount();
        listFirstNames.add(bankAccount.getClientFirstName());
        listLastNames.add(bankAccount.getClientLastName());
        listUserNames.add(bankAccount.getUsername());
        listPasswords.add(bankAccount.getPassword());
        listAccountNumbers.add(bankAccount.getClientAccNumber());
        listBalance.add(bankAccount.getBalance());
    }
    public void parseUserInfoOnLogin(int accountNumber){
        //BankAccount bankAccount = new BankAccount();
        bankAccount.setUsername(listUserNames.get(accountNumber));
        bankAccount.setPassword(listPasswords.get(accountNumber));
        bankAccount.setClientFirstName(listFirstNames.get(accountNumber));
        bankAccount.setClientLastName(listLastNames.get(accountNumber));
        bankAccount.setBalance(listBalance.get(accountNumber));
        bankAccount.setClientAccNumber(accountNumber);
    }
    public void deletePreviousUserInfo(){
        bankAccount.setUsername(null);
        bankAccount.setPassword(null);
        bankAccount.setClientFirstName(null);
        bankAccount.setClientLastName(null);
        bankAccount.setBalance(0.0);
        bankAccount.setClientAccNumber(0);
    }
}