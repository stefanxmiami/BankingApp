import java.util.Locale;
import java.util.Scanner;

public class MenuSelector extends Bank {
    public void selectMenu(String mn) {
        BankAccount bankAccount = new BankAccount();
        SavedUsers savedUsers = new SavedUsers();
        Scanner sc = new Scanner(System.in);
        boolean optionActive = true;
        String passVerificator = bankAccount.getPassword();

        switch (mn.toLowerCase(Locale.ROOT).trim()) {

            case "deposit":
            case "+":
                System.out.println("Enter Deposit Amount:");
                bankAccount.depositBalance(sc.nextDouble());
                break;
            case "withdraw":
            case "-":
                System.out.println("Enter Withdraw Amount:");
                double temp = sc.nextDouble();
                if(temp> bankAccount.getBalance())
                    System.out.println("Insufficient funds!");
                else
                    bankAccount.withdrawBalance(temp);
                break;
            case "balance":
            case "=":
                System.out.println();
                System.out.println("-----------------------BALANCE-----------------------");
                System.out.println("Your Balance Is:\t\t" + "$" + bankAccount.getBalance());
                System.out.println("-----------------------BALANCE-----------------------");
                System.out.println();
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
                System.out.println("User: " + bankAccount.getUsername() + " || Account Number: " + bankAccount.getClientAccNumber());
                System.out.println("Enter 'change username' or 'cu' to change username'");
                System.out.println("Enter 'change password' or 'cp' to change password'");
                System.out.println("Enter 'back' or 'b' to go back to previous menu");
                String newOptionsMenu = sc.next();
                do {
                    switch (newOptionsMenu.toLowerCase(Locale.ROOT).trim().replaceAll(" ", "")) {
                        default:
                            System.out.println("Invalid choice!");
                            optionActive = false;
                            break;
                        case "back":
                        case "b":
                            optionActive = false;
                            break;

                        case "change username":
                        case "changeusername":
                        case "cu":
                            System.out.println("You Must Verify Your Password First!");
                            passVerificator = sc.next();
                            if (passVerificator.equals(bankAccount.getPassword())) {
                                System.out.println("Password Is Correct!");
                                System.out.println("Enter A New Username:");
                                bankAccount.setUsername(sc.next());
                                optionActive = false;
                                break;
                            } else {
                                System.out.println("Password is incorrect!");
                            }
                        case "change password":
                        case "changepassword":
                        case "cp":
                            System.out.println("You Must Verify Your Password First!");
                            passVerificator = sc.next();
                            if (passVerificator.equals(bankAccount.getPassword())) {
                                System.out.println("Password Is Correct!");
                                System.out.println("Enter A New Username:");
                                bankAccount.setPassword(sc.next());
                                optionActive = false;
                                break;
                            } else {
                                System.out.println("Password is incorrect!");
                            }
                    }}while (optionActive);
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
