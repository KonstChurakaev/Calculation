
class Arabic {

    protected static String changeArabikNumbA(String numberOne, String numberTwo, String operation) {

        int arabicNumberOne = Integer.parseInt(numberOne);
        int arabicNumberTwo = Integer.parseInt(numberTwo);

        return ArithmeticOperations.rez(arabicNumberOne, arabicNumberTwo, operation);
    }
}

