import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise7 {
public static void  main() throws FileNotFoundException{
    Scanner scan = new Scanner (new File("password.txt"));
    Scanner keyboard = new Scanner (System.in);
    String user = scan.nextLine();
    String pass = scan.nextLine(); // looks at selected file in scan

    String inpUser = keyboard.nextLine();
    String inpPass = keyboard.nextLine(); // gets input from user

    if (inpUser.equals(user) && inpPass.equals(pass)) {
        System.out.print("your login message");
    } else {
        System.out.print("your error message");
    }
}
} 