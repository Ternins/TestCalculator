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
            case 31: romanNum = "XXXI"; break;
            case 32: romanNum = "XXXII"; break;
            case 33: romanNum = "XXXIII"; break;
            case 34: romanNum = "XXXIV"; break;
            case 35: romanNum = "XXXV"; break;
            case 36: romanNum = "XXXVI"; break;
            case 37: romanNum = "XXXVII"; break;
            case 38: romanNum = "XXXVIII"; break;
            case 39: romanNum = "XXXIX"; break;
            case 40: romanNum = "XL"; break;
            case 41: romanNum = "XLI"; break;
            case 42: romanNum = "XLII"; break;
            case 43: romanNum = "XLIII"; break;
            case 44: romanNum = "XLIV"; break;
            case 45: romanNum = "XLV"; break;
            case 46: romanNum = "XLVI"; break;
            case 47: romanNum = "XLVII"; break;
            case 48: romanNum = "XLVIII"; break;
            case 49: romanNum = "XLIX"; break;
            case 50: romanNum = "L"; break;
            case 51: romanNum = "LI"; break;
            case 52: romanNum = "LII"; break;
            case 53: romanNum = "LIII"; break;
            case 54: romanNum = "LIV"; break;
            case 55: romanNum = "LV"; break;
            case 56: romanNum = "LVI"; break;
            case 57: romanNum = "LVII"; break;
            case 58: romanNum = "LVIII"; break;
            case 59: romanNum = "LIX"; break;
            case 60: romanNum = "LX"; break;
            case 61: romanNum = "LXI"; break;
            case 62: romanNum = "LXII"; break;
            case 63: romanNum = "LXIII"; break;
            case 64: romanNum = "LXIV"; break;
            case 65: romanNum = "LXV"; break;
            case 66: romanNum = "LXVI"; break;
            case 67: romanNum = "LXVII"; break;
            case 68: romanNum = "LXVIII"; break;
            case 69: romanNum = "LXIX"; break;
            case 70: romanNum = "LXX"; break;
            case 71: romanNum = "LXXI"; break;
            case 72: romanNum = "LXXII"; break;
            case 73: romanNum = "LXXIII"; break;
            case 74: romanNum = "LXXIV"; break;
            case 75: romanNum = "LXXV"; break;
            case 76: romanNum = "LXXVI"; break;
            case 77: romanNum = "LXXVII"; break;
            case 78: romanNum = "LXXVIII"; break;
            case 79: romanNum = "LXXIX"; break;
            case 80: romanNum = "LXXX"; break;
            case 81: romanNum = "LXXXI"; break;
            case 82: romanNum = "LXXXII"; break;
            case 83: romanNum = "LXXXIII"; break;
            case 84: romanNum = "LXXXIV"; break;
            case 85: romanNum = "LXXXV"; break;
            case 86: romanNum = "LXXXVI"; break;
            case 87: romanNum = "LXXXVII"; break;
            case 88: romanNum = "LXXXVIII"; break;
            case 89: romanNum = "LXXXIX"; break;
            case 90: romanNum = "XC"; break;
            case 91: romanNum = "XCI"; break;
            case 92: romanNum = "XCII"; break;
            case 93: romanNum = "XCIII"; break;
            case 94: romanNum = "XCIV"; break;
            case 95: romanNum = "XCV"; break;
            case 96: romanNum = "XCVI"; break;
            case 97: romanNum = "XCVII"; break;
            case 98: romanNum = "XCVIII"; break;
            case 99: romanNum = "XCIX"; break;
            case 100: romanNum = "C"; break;
        }
        return romanNum;
    }
}
