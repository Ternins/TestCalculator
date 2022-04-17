import java.util.Scanner;

public class Calculator {
    static int num1;
    static int num2;
    static int resultInt;
    static char operation;
    static boolean check1;
    static boolean check2;
    static String expression;
    static String delimeter = " ";
    static String globalResult;
    static String[] subString;

    public static String getExpression() {
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        expression = scan.nextLine();
        subString = expression.split(delimeter);
        if(subString.length > 3 || subString.length < 2){
            System.out.println("throws Exception");
            Calculator.getExpression();
        }
        check1 = RomanConvertor.isThisRomanNum(subString[0]);
        check2 = RomanConvertor.isThisRomanNum(subString[2]);
        char[] res = subString[1].toCharArray();
        operation = res[0];
        if(Calculator.check(check1,check2) == true){
            num1 = RomanConvertor.getNum(subString[0]);
            num2 = RomanConvertor.getNum(subString[2]);
        } else {
            num1 = Integer.parseInt(subString[0]);
            if (num1 > 10)
            {
                System.out.println("throws Exception");
                Calculator.getExpression();
            }
            num2 = Integer.parseInt(subString[2]);
            if (num2 > 10)
            {
                System.out.println("throws Exception");
                Calculator.getExpression();
            }
        }
        resultInt = Calculator.calc(num1, num2, operation);
        if(Calculator.check(check1,check2) == true && resultInt < 0){
            System.out.println("throws Exception");
            Calculator.getExpression();
        } else if (Calculator.check(check1,check2) == true){
            globalResult = RomanConvertor.getRomanNum((resultInt));
        } else globalResult = Integer.toString(resultInt);
        return globalResult;
    }

    public static int calc(int a, int b, char oper) {
        int result = 0;
        switch (oper){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: getExpression(); break;
        }
        return result;
    }

    public static boolean check(boolean flag1, boolean flag2){
        boolean flag3 = false;
        if (flag1 == false && flag2 == true) {
            System.out.println("throws Exception");
            Calculator.getExpression();
        } else if (flag1 == true  && flag2 == false) {
            System.out.println("throws Exception");
            Calculator.getExpression();
        } else if ((flag1 && flag2) == true){
            flag3 = true;
        } else if ((flag1 && flag2) == false) {
            flag3 = false;
        }
        return flag3;
    }
}
