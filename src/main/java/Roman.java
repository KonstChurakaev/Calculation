

class Roman {

    protected static String changeRomanNumb(String numberOne, String numberTwo, String operation) {

        int romanNumberOne = Integer.parseInt(String.valueOf(RomanNamberEnum.valueOf(numberOne)));
        int romanNumberTwo = Integer.parseInt(String.valueOf(RomanNamberEnum.valueOf(numberTwo)));

        if (Integer.parseInt(ArithmeticOperations.rez(romanNumberOne, romanNumberTwo, operation)) <= 0) {
            return "throws Exception // in the Roman system there is no zero and negative numbers";
        } else {
            return ConvertArabicToRoman.convertArabicToRoman(Integer.parseInt(ArithmeticOperations.rez(romanNumberOne, romanNumberTwo, operation)));
        }
    }
}

