import java.util.Scanner;
public class Bank implements GUI{
    //truth values for looping the menus
    public static boolean innerMenuLoop = true;
    public static boolean outerMenuLoop = true;

    public static void main(String[] args) {
        do {
            SignUpLogIn signUpLogIn = new SignUpLogIn();

            //sign up and log in menu
            while(signUpLogIn.signUpLogIn());


            do {
                //Print the GUI
                System.out.println(graphicalUserInterface);
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
