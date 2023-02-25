package operator;

import java.util.Scanner;
import core.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The total number of rows or columns must be 1, 2 or 3\n");
        System.out.print("Enter total number of rows    : ");
        int rows = input.nextInt();
        System.out.print("Enter total number of columns : ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        input.close();
        int lengthRow = array.length;
        int lengthColum = array[0].length;
        if (lengthRow == 1 || lengthColum == 1)
            one(array);
        else if (lengthRow == 2 || lengthColum == 2)
            two(array);
        else
            three(array);
    }

    static void one(int[][] array) {
        RankOne one = new RankOne();
        if (one.rank(array) != 0)
            System.out.println("Its rank is one");
        else
            System.out.println("Its a zero matrix");
    }

    static void printRankTwo() {
        System.out.println("Its rank is two");
    }

    static void two(int[][] array) {
        RankTwo two = new RankTwo();
        int lengthRow = array.length;
        int lengthColum = array[0].length;
        if (lengthRow == lengthColum) {
            if (two.square(array) != 0)
                printRankTwo();
            else
                one(array);
        } else if (lengthRow > lengthColum) {
            if (two.row(array) != 0)
                printRankTwo();
            else
                one(array);
        } else {
            if (two.column(array) != 0)
                printRankTwo();
            else
                one(array);
        }
    }

    static void printRankThree() {
        System.out.println("Its rank is three");
    }

    static void three(int[][] array) {
        RankThree three = new RankThree();
        int lengthRow = array.length;
        int lengthColum = array[0].length;
        boolean rankPass = true;
        if (lengthRow == lengthColum) {
            if (three.square(array) != 0) {
                rankPass = false;
                printRankThree();
            }
        } else if (lengthRow > lengthColum) {
            if (three.row(array) != 0) {
                rankPass = false;
                printRankThree();
            }
        } else {
            if (three.column(array) != 0) {
                rankPass = false;
                printRankThree();
            }
        }
        if (rankPass)
            one(array);
    }

    static void threeToTwo(int[][] array) {
        int row = 0;
        boolean rankPass = false;
        RankTwo two = new RankTwo();
        int[][] arrayTemp = new int[2][array[0].length];
        while (true) {
            for (int i = row; i < 2; i++) {
                arrayTemp[i] = array[i];
            }
            if (row == array.length - 2) {
                rankPass = true;
                break;
            }
            if (two.column(arrayTemp) != 0) {
                printRankTwo();
                break;
            }
        }
        if (rankPass)
            one(arrayTemp);
    }

}