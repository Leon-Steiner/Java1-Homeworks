class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Task №2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -4, b = 10;
            System.out.println("Task №3");
            System.out.println(a + b >= 0? "The sum is positive" : "The sum is negative");
    }

    static void printColor() {
        int value = 5;
            System.out.println("Task №4");
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value >= 1 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 7, b = 8;
            System.out.println("Task №5");
            System.out.println(a >= b? "a >=b " : "a < b");
    }
}


