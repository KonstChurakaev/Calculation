
public class Check {
    public static String validatingInput(String input) {

        String arabicNumerals = "12345678910";
        String romanNumerals = "IIIVIIIX";
        String operation = "+-*/";

        input = input.toUpperCase();
        String[] temp = input.split(" ");

        if (temp.length > 3) {
            return "throws Exception// the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)";
        }
        if (temp.length<3){
            return "throws Exception// string is not a mathematical operation";
        }
        if (!operation.contains(temp[1])) {
            return "Incorrectly entered operation";
        }
        if (temp[1].equals("/")&&temp[2].equals("0")){
            return "ArithmeticException// division by zero";
        }

        if (arabicNumerals.contains(temp[0])) {
            if (arabicNumerals.contains(temp[2])){
                return String.valueOf(Arabic.changeArabikNumbA(input));
            }
            if (romanNumerals.contains(temp[2])){
                System.out.println("different number systems are used at the same time");
            }

        }
        if (romanNumerals.contains(temp[0])) {
            if (romanNumerals.contains(temp[2])){
                return Roman.changeRomanNumb(input);
            }
            if (arabicNumerals.contains(temp[2])){
                System.out.println("different number systems are used at the same time");
            }
        }
return "Wrong data entry";
    }
}
