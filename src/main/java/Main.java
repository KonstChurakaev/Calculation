
import java.util.Locale;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = "";
        System.out.println("CALCULATOR");
        System.out.println("enter values or Stop to complete");
        while (!input.equals("STOP")){
            input = s.nextLine().toUpperCase(Locale.ROOT);
            if (!input.equals("STOP")){
                System.out.println("result = " + Check.validatingInput(input));
                System.out.println("enter values");
            }else {
                System.out.println("Goodbye ");
            }
        }
    }
}
