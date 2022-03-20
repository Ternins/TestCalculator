import java.util.Scanner;


public class Calculator {
    static int num;
    static char operation;
    static Scanner scanner = new Scanner(System.in);


    public static int getInt() {
        System.out.println("Введите число:");
        if(scanner.hasNextInt())
            num = scanner.nextInt();
        else {
            System.out.println("Ошибка ввода! Введите целове число!");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        if(scanner.hasNext())
            operation = scanner.next().charAt(0); //Считывает только 0 индекс строки
        else {
            System.out.println("Неверный символ! Введите знак операции");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int a, int b, char oper) {
        int result = 0;
        switch (oper){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default:
                System.out.println("Неверная операция! Проверьте корректность ввода");
                result = calc(a,b,getOperation());
            break;
        }
        return result;
    }
}
