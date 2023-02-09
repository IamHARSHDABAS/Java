import java.util.Arrays;
import java.util.Scanner;

import temp.*;

public class Operator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("The total number of rows or columns must be 1, 2 or 3\n");
            System.out.print("Enter total number of rows    : ");
            int rows = input.nextInt();
            System.out.print("Enter total number of columns : ");
            int columns = input.nextInt();
            int[][] array = new int[rows][columns];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = input.nextInt();
                }
            }
            RankOne one = new RankOne();
            if (one.status(array)) System.out.println("Works");
            System.out.println(Arrays.toString(one.location(array)));
            System.out.println("Not works");
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
