import java.util.Scanner;
import core.*;

public class Operator {

    //  TODO whole thing again
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
            if (array.length == 1 || array[0].length == 1) {
                RankOne one = new RankOne();
                if (one.status(array)) {
                    System.out.println("Its Rank is One");
                }
            }
            else if (array.length == 2 || array[0].length == 2) {
                RankTwo two = new RankTwo();
                if (two.status(array)) {
                    System.out.println("Its Rank is Two");
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
