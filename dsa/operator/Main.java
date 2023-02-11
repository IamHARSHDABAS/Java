package operator;

import java.util.Scanner;
import core.*;

public class Main {
    public static void main(String[] args) {
        year();
    }

    static void year() {
        Scanner input = new Scanner(System.in);
        Year year = new Year();
        int userYear = input.nextInt();
        input.close();
        if (year.isLeap(userYear)) {
            System.out.println("IT is leap year");
        }
        else {
            System.out.println("Nah");
        }
    }

}