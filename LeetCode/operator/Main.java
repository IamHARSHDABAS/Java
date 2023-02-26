package operator;

import core.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] array1D() {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}
	static int[][] array2D() {
		Scanner input = new Scanner(System.in);
		int[][] array = new int[10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = input.nextInt();
			}
		}
		input.close();
		return array;
	}
	public static void main(String[] args) {
		// twoSum(array1D());
	}
	/*static void twoSum(int[] array) {
		TwoSum twoSum = new TwoSum();
		System.out.println(Arrays.toString(twoSum.find(array, 8)));
	}*/
}
