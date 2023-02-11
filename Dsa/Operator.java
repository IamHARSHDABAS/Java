import java.util.Scanner;
import Core.*;

public class Operator {
    public static void main(String[] args) {
        year();
    }

    static void year() {
        Scanner input = new Scanner(System.in);
        Year year = new Year();
        int userYear = input.nextInt();
        if (year.isLeap(userYear)) {
            System.out.println("IT is leap year");
        }
        else {
            System.out.println("Nah");
        }
    }
}