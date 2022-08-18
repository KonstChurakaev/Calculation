
public class ArithmeticOperations {
    protected static int rez(int a, int b, String operation){

        try {
            switch (operation){

                case "+": return a+b;
                case "-": return a-b;
                case "*": return a*b;
                case "/": return a/b;
             }
        } catch (ArithmeticException | NullPointerException e){
            System.out.println(e);
        }
        return 0;
    }
}
