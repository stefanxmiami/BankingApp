import java.util.Scanner;


/*
    This is a single user intended program.
    You can sign up and login after you sign out and your data will be saved,
    however if another person wants to sign up, the old data still stays from the last person.
    Also, for some reason on startup, you can't enter "sign up" or "log in" with a space in the middle.
    I can't figure out a way for it to remove the space character.
*/



public class Bank {
    //truth values for looping the menus
    public static boolean innerMenuLoop = true;
    public static boolean outerMenuLoop = true;

    public static void main(String[] args) {
    do {
        BankAccount bankAccount = new BankAccount();
        SignUpLogIn sili = new SignUpLogIn();
        Scanner sc1 = new Scanner(System.in);

        while(sili.signUpLogIn())
        sili.signUpLogIn();

        do {
            //Print GUI
            System.out.println("-------------------------MENU------------------------");
            System.out.println("Enter 'Deposit'  or '+' to deposit money");
            System.out.println("Enter 'Withdraw' or '-' to withdraw money");
            System.out.println("Enter 'Balance'  or '=' to check balance");
            System.out.println("Enter 'SignOut'  or '/' to sign out of your account");
            System.out.println("Enter 'Options'  or 'o' to change username or password");
            System.out.println("Enter 'turnoff' to shut down the system");
            System.out.println("-------------------------MENU------------------------");
            innerMenuLoop = true;
            //Select menu
            Scanner sc = new Scanner(System.in);
            String inputMenu = sc.next();
            MenuSelector menuSelector = new MenuSelector();
            menuSelector.selectMenu(inputMenu);
        } while (innerMenuLoop);
    }while (outerMenuLoop);
    }
}
