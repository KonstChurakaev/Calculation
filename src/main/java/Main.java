
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = "";

        System.out.println("CALCULATOR");
        System.out.println("enter values or Stop to complete");
        while (!input.equals("STOP")) {

            input = s.nextLine().toUpperCase(Locale.ROOT).trim();

            if (!input.equals("STOP")) {
                System.out.println(calc(input));
                System.out.println("enter values");
            } else {
                System.out.println("Goodbye ");
            }
        }
    }

    public static String calc(String input) {

        String operation = "+-*/";
        int count = 0;

        char[] tempCars = input.toCharArray();

        for (int i = 0; i < tempCars.length; i++) {
            if (operation.contains(String.valueOf(tempCars[i]))) {
                operation = String.valueOf(tempCars[i]);
                count++;
            }
        }
        if (count == 0) {
            return "throws Exception //because string is not a mathematical operation";
        } else {
            try {
                String[] tempString = input.split("[+-/*]");

                String numberOne = tempString[0].trim();
                String numberTwo = tempString[1].trim();

                System.out.println("count=" + count);

                if (count == 0) {

                    return "throws Exception //because string is not a mathematical operation";
                } else {
                    if (tempString.length != 2) {
                        return "throws Exception// the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)";
                    } else {
                        if (count > 1) {
                            return "incorrect input of a mathematical operation";
                        } else {
                            if (numberOne.equals("")) {
                                System.out.println("No input numberOne");
                            } else {
                                return Check.validatingInput(numberOne, numberTwo, operation);
                            }
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("throws Exception// no input numberTwo");
            }
        }
        return "";
    }
}
