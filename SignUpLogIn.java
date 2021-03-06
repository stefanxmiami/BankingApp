import java.util.*;
public class SignUpLogIn extends Bank implements LogInSingUpGUI{

    static int accountNumberSetter=0;

    public boolean signUpLogIn(){
        SavedUsers savedUsers = new SavedUsers();
        BankAccount bankAccount = new BankAccount();

        Scanner sc = new Scanner(System.in);
            String inputUserName = "";
            String inputPassword = "";

        boolean signInLogInMenuLoop = true;
        System.out.println(LogInSingUpGUI.LSGUI);
        String s = sc.nextLine();

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
                bankAccount.setClientAccNumber(accountNumberSetter++);
                //savedUsers.saveUserInfo();
                return false;

            case "login":
            case "log in":
                System.out.println("Enter Username:");
                inputUserName=sc.next();
                if(savedUsers.listUserNames.contains(inputUserName)){
                    System.out.println("Enter Password:");
                    inputPassword = sc.next();
                    if(inputPassword.equals(savedUsers.listPasswords.get(savedUsers.listUserNames.indexOf(inputUserName)))){
                        System.out.println("Successful login!");
                        savedUsers.parseUserInfoOnLogin(savedUsers.listPasswords.indexOf(inputPassword));
                        return false;
                    }else{ System.out.println("Wrong Password!"); }
                }else{ System.out.println("Wrong Username!"); }

            default:
                System.out.println("Invalid choice!");

                 signInLogInMenuLoop = false;
                 return true;

        }
        }while(signInLogInMenuLoop);
    }
}
