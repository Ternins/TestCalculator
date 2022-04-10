public class RomanConvertor {
    static int num = 0;
    static String romanNum;

    public static boolean isThisRomanNum(String input){
        boolean thatRoman;
        switch (input){
            case "I": thatRoman = true; break;
            case "II": thatRoman = true; break;
            case "III": thatRoman = true; break;
            case "IV": thatRoman = true; break;
            case "V": thatRoman = true; break;
            case "VI": thatRoman = true; break;
            case "VII": thatRoman = true; break;
            case "VIII": thatRoman = true; break;
            case "IX": thatRoman = true; break;
            case "X": thatRoman = true; break;
            default: thatRoman = false; break;
        }
        return thatRoman;
    }

    public static int getNum(String input) {
        switch (input){
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
            case 11: romanNum = "XI"; break;
            case 12: romanNum = "XII"; break;
            case 13: romanNum = "XIII"; break;
            case 14: romanNum = "XIV"; break;
            case 15: romanNum = "XV"; break;
            case 16: romanNum = "XVI"; break;
            case 17: romanNum = "XVII"; break;
            case 18: romanNum = "XVIII"; break;
            case 19: romanNum = "XIX"; break;
            case 20: romanNum = "XX"; break;
        }
        return romanNum;
    }
}
