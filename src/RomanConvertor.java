import java.util.Scanner;


public class RomanConvertor {
    static int num = 0;
    static String romanNum;
    static Scanner scanner = new Scanner(System.in);

    public static int getNum() {
        System.out.println("Введите число:");
        if(scanner.hasNext())
            romanNum = scanner.nextLine();
        switch (romanNum){
            case "I": num = 1; break;
            case "II": num = 2; break;
            case "III": num = 3; break;
            case "IV": num = 4; break;
            case "V": num = 5; break;
            case "VI": num = 6; break;
            case "VII": num = 7; break;
            case "VIII": num = 8; break;
            case "IX": num = 9; break;
            case "X": num = 10; break;
            default: System.out.println("Неверный символ! Введите римское число!"); getNum(); break;
        }
        return num;
    }

    public static String getRomanNum(int exoNum) {
        switch (exoNum){
            case 1: romanNum = "I"; break;
            case 2: romanNum = "II"; break;
            case 3: romanNum = "III"; break;
            case 4: romanNum = "IV"; break;
            case 5: romanNum = "V"; break;
            case 6: romanNum = "VI"; break;
            case 7: romanNum = "VII"; break;
            case 8: romanNum = "VIII"; break;
            case 9: romanNum = "IX"; break;
            case 10: romanNum = "X"; break;
            default: System.out.println("Ошибка"); getRomanNum(exoNum); break;
        }
        return romanNum;
    }
}

