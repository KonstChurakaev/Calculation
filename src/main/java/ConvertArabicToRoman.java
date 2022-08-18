public class ConvertArabicToRoman {
    protected static String convertArabicToRoman(int arabicNum) {
        String romanNumb = "";
        if (arabicNum == 100) System.out.println("C");
        else {
            switch (arabicNum / 10) {
                case 1:
                    romanNumb = "X";
                    break;
                case 2:
                    romanNumb = "XX";
                    break;
                case 3:
                    romanNumb="XXX";
                    break;
                case 4:
                    romanNumb="XL";
                    break;
                case 5:
                    romanNumb="L";
                    break;
                case 6:
                    romanNumb="LX";
                    break;
                case 7:
                    romanNumb="LXX";
                    break;
                case 8:
                    romanNumb="LXXX";
                    break;
                case 9:
                    romanNumb="XC";
                    break;
            }
            switch (arabicNum % 10) {
                case 1:
                    romanNumb+="I";
                    break;
                case 2:
                    romanNumb+="II";
                    break;
                case 3:
                    romanNumb+="III";
                    break;
                case 4:
                    romanNumb+="IV";
                    break;
                case 5:
                    romanNumb+="V";
                    break;
                case 6:
                    romanNumb+="VI";
                    break;
                case 7:
                    romanNumb+="VII";
                    break;
                case 8:
                    romanNumb+="VIII";
                    break;
                case 9:
                    romanNumb+="IX";
                    break;
            }
        }
        return romanNumb;
    }
}
