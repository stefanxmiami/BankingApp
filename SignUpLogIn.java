import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SignUpLogIn extends Bank{
    public boolean signUpLogIn(){
        BankAccount bankAccount = new BankAccount();
            //Random number range to 50000 for account number generator
            Random random = new Random();
        Scanner sc = new Scanner(System.in);
            String inputUserName = "";
            String inputPassword = "";

        boolean signInLogInMenuLoop = true;
        System.out.println("If you are a new user, you must sign up first!");
        System.out.println("After a new user signs up, they must log in again.");
        System.out.println("Enter 'Login' or 'SignUp'");
        String s = sc.next();

        do{
        switch (s.toLowerCase(Locale.ROOT).trim()) {

            case "sign up":
            case "signup":





                System.out.println("Enter Your First Name:");
                bankAccount.setClientFirstName(sc.next());
                System.out.println("Enter Your Last Name:");
                bankAccount.setClientLastName(sc.next());
                System.out.println("Enter Username:");
                bankAccount.setUsername(sc.next());
                System.out.println("Enter Password:");
                bankAccount.setPassword(sc.next());
                bankAccount.setClientAccNumber(random.nextInt(50000));
                return false;
                //signInLogInMenuLoop = false;



            case "login":
            case "log in":

                System.out.println("Enter Username:");
                inputUserName = sc.next();
                if(inputUserName.equals(bankAccount.getUsername())) {
                    System.out.println("Enter Password:");
                    inputPassword = sc.next();
                    if(inputPassword.equals(bankAccount.getPassword())){
                        System.out.println("Successful login!");
                        signInLogInMenuLoop = false;
                        return false;
                    }else System.out.println("Wrong Password!");
                }else System.out.println("Wrong Username!");

            default:
                System.out.println("Invalid choice!");

                 signInLogInMenuLoop = false;
                 return true;

        }
        }while(signInLogInMenuLoop);
    }
}
