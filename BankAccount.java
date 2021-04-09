public class BankAccount {
    private static String clientFirstName;
    private static String clientLastName;
    private static int clientAccNumber;
    private static String password;
    private static String username;
    private static double balanceDenar;
    private static double balancePound;
    private static double balanceEuro;
    private static double balanceDollar;
    private static double balanceYen;


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

    //Denar
        public double getBalanceDenar() {
        return balanceDenar;
    }

        public void depositBalanceDenar(double balanceDenar) {
        this.balanceDenar += balanceDenar;
    }

        public void withdrawBalanceDenar(double balanceDenar) {
        this.balanceDenar -= balanceDenar;
    }

        public void setBalanceDenar(double balance){this.balanceDenar = balance;}

    //Pound
        public double getBalancePound() {
        return balancePound;
    }

        public void depositBalancePound(double balancePound) {
        this.balancePound += balancePound;
    }

        public void withdrawBalancePound(double balancePound) {
        this.balancePound -= balancePound;
    }

        public void setBalancePound(double balancePound){this.balancePound = balancePound;}

    //Euro

        public double getBalanceEuro() {
        return balanceEuro;
    }

        public void depositBalanceEuro(double balanceEuro) {
        this.balanceEuro += balanceEuro;
    }

        public void withdrawBalanceEuro(double balanceEuro) {
        this.balanceEuro -= balanceEuro;
    }

        public void setBalanceEuro(double balanceEuro){this.balanceEuro = balanceEuro;}

    //Dollar

        public double getBalanceDollar() {
        return balanceDollar;
    }

        public void depositBalanceDollar(double balanceDollar) {
        this.balanceDollar += balanceDollar;
    }

        public void withdrawBalanceDollar(double balanceDollar) {
        this.balanceDollar -= balanceDollar;
    }

        public void setBalanceDollar(double balanceDollar){this.balanceDollar = balanceDollar;}

    //Yen

        public double getBalanceYen() {
        return balanceYen;
    }

        public void depositBalanceYen(double balanceYen) {
        this.balanceYen += balanceYen;
    }

        public void withdrawBalanceYen(double balanceYen) {
        this.balanceYen -= balanceYen;
    }

        public void setBalanceYen(double balanceYen){this.balanceYen = balanceYen;}

}
