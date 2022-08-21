class Check {
    public static String validatingInput(String numberOne, String numberTwo, String operation) {

        String arabicNumerals = "12345678910";
        String romanNumerals = "IIIVIIIX";

        if (arabicNumerals.contains(numberOne)) {
            if (arabicNumerals.contains(numberTwo)) {
                return Arabic.changeArabikNumbA(numberOne, numberTwo, operation);
            }
            if (romanNumerals.contains(numberTwo)) {
                System.out.println("different number systems are used at the same time");
            }
        }
        if (romanNumerals.contains(numberOne)) {
            if (romanNumerals.contains(numberTwo)) {
                return Roman.changeRomanNumb(numberOne, numberTwo, operation);
            }
            if (arabicNumerals.contains(numberTwo)) {
                System.out.println("different number systems are used at the same time");
            }
        }
        return "Wrong data entry";
    }
}
