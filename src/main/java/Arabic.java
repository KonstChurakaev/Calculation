
public class Arabic {

    protected static int changeArabikNumbA(String enter) {

        String[] temp=enter.split(" ");

        int a= Integer.parseInt(temp[0]);
        String operation=temp[1];
        int b= Integer.parseInt(temp[2]);

        return ArithmeticOperations.rez(a, b, operation);
    }
}
