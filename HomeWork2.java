/**
* GB Java 1. Home work #2
*
* @author Leon Steiner
* @version 11.02.2022
*/
class HomeWork2 {
    public static void main(String[] args) {
        boolean result = chechSumSign(15, 6);
        System.out.println("Task №1");
        System.out.println(result? "True" : "False");
        isPositiveOrNegative(0);
        System.out.println(isNegative(-10));
        massivs();
    }

        static boolean chechSumSign(int a, int b) {
            return (10 <= a + b) && (a + b <= 20);
    }

        static void isPositiveOrNegative(int i) {
            System.out.println("Task №2");
        if (i >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

        static boolean isNegative(int x) {
            System.out.println("Task №3");
        if (x >= 0) {
            return false;
        }
        else {
            return true;
        }
    }

        static void massivs() {
            System.out.println("Task №4");
        for (int i = 0; i < 5; i++) {
            System.out.println("String - " + i);
        }
    }
}