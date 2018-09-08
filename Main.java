import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String input = "Carlos\n" + "Paulina \n" + "jump\n" + "jump\n" + "jump\n" + "quit";
        Scanner reader = new Scanner(System.in);
        UserInterface start = new UserInterface(reader);
        start.start();
        //carlos made some changes
        
    }
}
