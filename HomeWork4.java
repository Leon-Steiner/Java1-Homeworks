import java.util.Random;
import java.util.Scanner;
/**
* GB Java 1. Home work #4
*
* @author Leon Steiner
* @version 17.02.2022
*/
class HomeWork4 {
    
    Random random;
    Scanner scanner;
    char[][] table;
    
    public static void main(String[] args) {
        new HomeWork4().game();
    }
    
    HomeWork4() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('o')) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...!");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }
    
    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }
    
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return table[x][y] == '.';
    }
    
    /*boolean checkWin(char ch) {
        //
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //
        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        //
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }*/
    
    boolean checkWin(char dot) {
    for (int i = 0; i < 3; i++)
        if ((table[i][0] == dot && table[i][1] == dot &&
                         table[i][2] == dot) ||
                (table[0][i] == dot && table[1][i] == dot &&
                                  table[2][i] == dot))
            return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                  table[2][2] == dot) ||
                    (table[2][0] == dot && table[1][1] == dot &&
                      table[0][2] == dot))
            return true;
    return false;
    }
    
    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}