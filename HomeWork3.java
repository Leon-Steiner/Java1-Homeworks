import java.util.Arrays;

/**
* GB Java 1. Home work #3
*
* @author Leon Steiner
* @version 17.02.2022
*/
class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(arrayOutput(3, 5)));

    }
    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Task №1");
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Task №2");
        System.out.println(Arrays.toString(arr));
    }
    
    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Task №3");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillDiagonal() {
        int[][] arr = new int[3][3];
        System.out.println("Task №4");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr[i].length - 1 - i) {
                    arr[i][j] = 1;
                }
            }
        System.out.println(Arrays.toString(arr[i]));
        }
    }
    
    static int[] arrayOutput(int len, int initialValue) {
        int[] arr = new int[len];
        System.out.println("Task №5");
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}