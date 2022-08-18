
public class Roman {

    protected static String changeRomanNumb(String enter) {

        enter = enter.toUpperCase();
        String[] temp = enter.split(" ");

            int a = Integer.parseInt(String.valueOf(RomanNamberEnum.valueOf(temp[0])));
            String operation = temp[1];
            int b = Integer.parseInt(String.valueOf(RomanNamberEnum.valueOf(temp[2])));

            if (ArithmeticOperations.rez(a,b,operation)<=0){
                return "throws Exception // in the Roman system there is no zero and negative numbers";
            }else {
                return  ConvertArabicToRoman.convertArabicToRoman(ArithmeticOperations.rez(a,b,operation));
            }

    }
}
