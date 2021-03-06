public class BankAccount {
    private static String clientFirstName;
    private static String clientLastName;
    private static int clientAccNumber;
    private static String password;
    private static String username;
    private static double balance;

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public int getClientAccNumber() {
        return clientAccNumber;
    }

    public void setClientAccNumber(int clientAccNumber) {
        this.clientAccNumber = clientAccNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void depositBalance(double balance) {
        this.balance += balance;
    }

    public void withdrawBalance(double balance) {
        this.balance -= balance;
    }

    public void setBalance(double balance){this.balance = balance;}
}
