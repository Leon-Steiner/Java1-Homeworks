/**
* GB Java 1. Home work #2
*
* @author Leon Steiner
* @version 16.02.2022
*/
class HomeWork2Rework {
    public static void main(String[] args) {
        boolean result = chechSumSign(15, 6);
        System.out.println("Task №1");
        System.out.println(result? "True" : "False");
        isPositiveOrNegative(0);
        System.out.println(isNegative(- 10));
        massivs("Hello, World!", 5);
    }

    static boolean chechSumSign(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    static void isPositiveOrNegative(int i) {
        System.out.println("Task №2");
        System.out.println((i >= 0)? "Positive" : "Negative");
    }

    static boolean isNegative(int num) {
        System.out.println("Task №3");
        return num < 0;
    }

    static void massivs(String s, int count) {
        System.out.println("Task №4");
        for (int i = 0; i < count; i++) {
        System.out.println(s);
        }
    }
}