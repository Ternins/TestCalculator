import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Это калькулятор арабских и римских цифр выберите режим работы калькулятора");
        System.out.println("1 - Арабский калькулятор");
        System.out.println("2 - Римский калькулятор");
        menu();
    }

    public static void menu() {
        int num = 0;
        System.out.println("Введите число:");
        if(scanner.hasNextInt())
            num = scanner.nextInt();
        else {
            System.out.println("Ошибка ввода! Введите целове число!");
            scanner.next();
            menu();
        }
        switch (num){
            case 1: standartCalc(); break;
            case 2: romanCalc(); break;
        }
    }

    public static void standartCalc(){
        //Стандартный калькулятор
        int a = 0;
        int b = 0;
        char operation;
        int result = 0;
        a = Calculator.getInt();
        b = Calculator.getInt();
        operation = Calculator.getOperation();
        result = Calculator.calc(a, b, operation);
        System.out.println("Ответ: " + result);
    }

    public static void romanCalc(){
        //Римский калькулятор
        int a = 0;
        int b = 0;
        char operation;
        int result = 0;
        String romanResult = null;
        a = RomanConvertor.getNum();
        b = RomanConvertor.getNum();
        operation = Calculator.getOperation();
        result = Calculator.calc(a,b, operation);
        if (result < 0)
            System.out.println("Ошибка!");
        else if (result < 10 && result > 0) {
            romanResult = RomanConvertor.getRomanNum(result);
            System.out.println("Ответ: " + romanResult);
        }
        else
            System.out.println("Ответ: " + result);
    }
}

