import java.util.Scanner;
class Matrix
{
	static void rankOne(int[][] array)
	{
		System.out.print("\nMatrix will be checked for rank one\nIf one of the element is a non zero\nThe rank of the matrix will be one");
		for (int exitLoopOuter = 0; exitLoopOuter < array.length; exitLoopOuter++)
		{
			for (int exitLoopInner = 0; exitLoopInner < array[0].length; exitLoopInner++)
			{
				if (array[exitLoopOuter][exitLoopInner] != 0)
				{
					System.out.print("\n" + array[exitLoopOuter][exitLoopInner]  + "\nIts Rank is 1\n");
					return;
				}
			}
		}
		System.out.print("\nIts a Zero matrix\n");
	}
	static boolean rankTwo(int[][] array, boolean rankPass)
	{
		int northWest, northEast, southWest, southEast, upperZero = 0, upperOne = 1, lowerZero = 0, lowerOne = 1, lastElement;
		System.out.print("Matrix will be checked for rank Two\nIf one of the 2x2 determinant is a non zero\nThe rank of the matrix will be Two");
		if (array.length == array[0].length)
		{
			int rank = (array[0][0] * array[1][1]) - (array[0][1] * array[1][0]);
			System.out.print("\n" + array[0][0] + " " + array[0][1] + "\n" + array[1][0] + " " + array[1][1] + "\nIts determinant is: " + rank);
			if (rank != 0)
			{
				System.out.print("\nIts rank is Two\n");
			}
			else
			{
				if (rankPass)
				{
					rankOne(array);
				}
			}
		}
		else if (array.length < array[0].length)
		{
			lastElement = array[0].length - 1;
			while (true)
			{
				northWest = array[0][upperZero];
				northEast = array[0][upperOne];
				southWest = array[1][lowerZero];
				southEast = array[1][lowerOne];
				int rankTwoRows = ((northWest * southEast) - (northEast * southWest));
				System.out.print("\n" + northWest + " " + northEast + "\n" + southWest + " " + southEast + "\nIts determinant is: " + rankTwoRows);
				if (rankTwoRows != 0)
				{
					System.out.print("Its rank is Two\n");
					return true;
				}
				else if (upperOne == lastElement && lowerOne == lastElement)
				{
					upperZero = lastElement;
					upperOne = 0;
					lowerZero = lastElement;
					lowerOne = 0;
					northWest = array[0][upperZero];
					northEast = array[0][upperOne];
					southWest = array[1][lowerZero];
					southEast = array[1][lowerOne];
					rankTwoRows = ((northWest * southEast) - (northEast * southWest));
					System.out.print("\n" + northWest + " " + northEast + "\n" + southWest + " " + southEast + "\nIts determinant is: " + rankTwoRows);
					if (rankTwoRows != 0)
					{
						System.out.print("Its rank is Two\n");
						return true;
					}
				break;
				}
				else
				{
					upperZero = upperZero + 1;
					upperOne = upperOne + 1;
					lowerZero = lowerZero + 1;
					lowerOne = lowerOne + 1;
				}
			}
			if (rankPass)
			{
				rankOne(array);
			}
		}
		else
		{
			lastElement = array.length - 1;
			while (true) {
				northWest = array[upperZero][0];
				northEast = array[upperOne][0];
				southWest = array[lowerZero][1];
				southEast = array[lowerOne][1];
				int rankTwoColumns = ((northWest * southEast) - (northEast * southWest));
				System.out.print("\n" + northWest + " " + northEast + "\n" + southWest + " " + southEast + "\nIts determinant is: " + rankTwoColumns);
				if (rankTwoColumns != 0) {
					System.out.print("Its rank is Two\n");
					return true;
				} else if (lowerZero == array[lastElement][0] && lowerOne == array[lastElement][1]) {
					upperZero = lastElement;
					upperOne = lastElement;
					lowerZero = 0;
					lowerOne = 0;
					northWest = array[upperZero][0];
					northEast = array[upperOne][0];
					southWest = array[lowerZero][1];
					southEast = array[lowerOne][1];
					rankTwoColumns = ((northWest * southEast) - (northEast * southWest));
					System.out.print("\n" + northWest + " " + northEast + "\n" + southWest + " " + southEast + "\nIts determinant is: " + rankTwoColumns);
					if (rankTwoColumns != 0) {
						System.out.print("Its rank is Two\n");
						return true;
					}
					break;
				} else {
					upperZero = upperZero + 1;
					upperOne = upperOne + 1;
					lowerZero = lowerZero + 1;
					lowerOne = lowerOne + 1;
				}
			}
			if (rankPass) {
				rankOne(array);
			}
		}
		return false;
	}
	static void rankThree(int[][] array)
	{
		boolean rankNull = true;
		int northWest, north, northEast, east, southEast, south, southWest, west, center, upperZero = 0, upper = 1, upperOne = 2, zero = 0, main = 1, one = 2, lowerZero = 0, lower = 1, lowerOne = 2, lastElement;
		System.out.print("Matrix will be checked for rank Three\nIf one of the 3x3 determinant is a non zero\nThe rank of the matrix will be Three");
		if (array.length == array[0].length)
		{
			int rankThree = (array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2]))) - Math.abs(array[0][1] * ((array[1][0] * array[2][2]) - (array[2][0] * array[1][2]))) + (array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2])));
			System.out.println("\n" + array[0][0] + " " + array[0][1] + " " + array[0][2] + "\n" + array[1][0] + " " + array[1][1] + " " + array[1][2] + "\n" + array[2][0] + " " + array[2][1] + " " + array[2][2] + "\nIts determinant is: " + rankThree);
			if (rankThree != 0)
			{
				System.out.print("Its rank is Three\n");
			}
			else
			{
				rankThreeTwo(array);
			}
		}
		else if (array.length < array[0].length)
		{
			lastElement = array[0].length - 1;
			while (true)
			{
				northWest = array[0][upperZero];
				north = array[0][upper];
				northEast = array[0][upperOne];
				west = array[0][zero];
				center = array[0][main];
				east = array[0][one];
				southWest = array[0][lowerZero];
				south = array[0][lower];
				southEast = array[0][lowerOne];
				int rankThreeRows = (northWest * ((center * southEast) - (south * east) - Math.abs(north * ((west * southEast) - (southWest * east)) + (northEast * ((west * south) - (southWest * center))))));
				System.out.print("\n" + northWest + " " + north + " " + northEast + "\n" + west + " " + center + " " + east + "\n" + southWest + " " + south + " " + southEast + "\nIts determinant is: " + rankThreeRows);
				if (rankThreeRows != 0)
				{
					System.out.print("Its rank is Three\n");
					rankNull = false;
					break;
				}
				else if (lowerOne == lastElement)
				{
					upperZero = lastElement - 1;
					upper = lastElement;
					upperOne = 0;
					zero = lastElement - 1;
					main = lastElement;
					one = 0;
					lowerZero = lastElement - 1;
					lower = lastElement;
					lowerOne = 0;
					northWest = array[0][upperZero];
					north = array[0][upper];
					northEast = array[0][upperOne];
					west = array[0][zero];
					center = array[0][main];
					east = array[0][one];
					southWest = array[0][lowerZero];
					south = array[0][lower];
					southEast = array[0][lowerOne];
					rankThreeRows = (northWest * ((center * southEast) - (south * east) - Math.abs(north * ((west * southEast) - (southWest * east)) + (northEast * ((west * south) - (southWest * center))))));
					System.out.print("\n" + northWest + " " + north + " " + northEast + "\n" + west + " " + center + " " + east + "\n" + southWest + " " + south + " " + southEast + "\nIts determinant is: " + rankThreeRows);
					if (rankThreeRows != 0)
					{
						System.out.print("Its rank is Two\n");
						rankNull = false;
						break;
					}
					upperZero = lastElement;
					upper = 0;
					upperOne = 1;
					zero = lastElement;
					main = 0;
					one = 1;
					lowerZero = lastElement;
					lower = 0;
					lowerOne = 1;
					northWest = array[0][upperZero];
					north = array[0][upper];
					northEast = array[0][upperOne];
					west = array[0][zero];
					center = array[0][main];
					east = array[0][one];
					southWest = array[0][lowerZero];
					south = array[0][lower];
					southEast = array[0][lowerOne];
					rankThreeRows = (northWest * ((center * southEast) - (south * east) - Math.abs(north * ((west * southEast) - (southWest * east)) + (northEast * ((west * south) - (southWest * center))))));
					System.out.print("\n" + northWest + " " + north + " " + northEast + "\n" + west + " " + center + " " + east + "\n" + southWest + " " + south + " " + southEast + "\nIts determinant is: " + rankThreeRows);
					if (rankThreeRows != 0)
					{
						System.out.print("Its rank is Two\n");
						rankNull = false;
					}
					break;
				}
				else
				{
					upperZero = upperZero + 1;
					upper = upper + 1;
					upperOne = upperOne + 1;
					zero = zero + 1;
					main = main + 1;
					one = one + 1;
					lowerZero = lowerZero + 1;
					lower = lower + 1;
					lowerOne = lowerOne + 1;
				}
			}
			if (rankNull)
			{
				rankThreeTwo(array);
			}
		}
		else {
			lastElement = array.length - 1;
			while (true)
			{
				northWest = array[upperZero][0];
				north = array[upper][0];
				northEast = array[upperOne][0];
				west = array[zero][0];
				center = array[main][0];
				east = array[one][0];
				southWest = array[lowerZero][0];
				south = array[lower][0];
				southEast = array[lowerOne][0];
				int rankThreeRows = (northWest * ((center * southEast) - (south * east) - Math.abs(north * ((west * southEast) - (southWest * east)) + (northEast * ((west * south) - (southWest * center))))));
				System.out.print("\n" + northWest + " " + north + " " + northEast + "\n" + west + " " + center + " " + east + "\n" + southWest + " " + south + " " + southEast + "\nIts determinant is: " + rankThreeRows);
				if (rankThreeRows != 0)
				{
					System.out.print("Its rank is Three\n");
					rankNull = false;
					break;
				}
				else if (lowerOne == lastElement)
				{
					upperZero = lastElement - 1;
					upper = lastElement;
					upperOne = 0;
					zero = lastElement - 1;
					main = lastElement;
					one = 0;
					lowerZero = lastElement - 1;
					lower = lastElement;
					lowerOne = 0;
					northWest = array[upperZero][0];
					north = array[upper][0];
					northEast = array[upperOne][0];
					west = array[zero][0];
					center = array[main][0];
					east = array[one][0];
					southWest = array[lowerZero][0];
					south = array[lower][0];
					southEast = array[lowerOne][0];
					rankThreeRows = (northWest * ((center * southEast) - (south * east) - Math.abs(north * ((west * southEast) - (southWest * east)) + (northEast * ((west * south) - (southWest * center))))));
					System.out.print("\n" + northWest + " " + north + " " + northEast + "\n" + west + " " + center + " " + east + "\n" + southWest + " " + south + " " + southEast + "\nIts determinant is: " + rankThreeRows);
					if (rankThreeRows != 0)
					{
						System.out.print("Its rank is Two\n");
						rankNull = false;
						break;
					}
					upperZero = lastElement;
					upper = 0;
					upperOne = 1;
					zero = lastElement;
					main = 0;
					one = 1;
					lowerZero = lastElement;
					lower = 0;
					lowerOne = 1;
					northWest = array[upperZero][0];
					north = array[upper][0];
					northEast = array[upperOne][0];
					west = array[zero][0];
					center = array[main][0];
					east = array[one][0];
					southWest = array[lowerZero][0];
					south = array[lower][0];
					southEast = array[lowerOne][0];
					rankThreeRows = (northWest * ((center * southEast) - (south * east) - Math.abs(north * ((west * southEast) - (southWest * east)) + (northEast * ((west * south) - (southWest * center))))));
					System.out.print("\n" + northWest + " " + north + " " + northEast + "\n" + west + " " + center + " " + east + "\n" + southWest + " " + south + " " + southEast + "\nIts determinant is: " + rankThreeRows);
					if (rankThreeRows != 0)
					{
						System.out.print("Its rank is Two\n");
						rankNull = false;
					}
					break;
				}
				else
				{
					upperZero = upperZero + 1;
					upper = upper + 1;
					upperOne = upperOne + 1;
					zero = zero + 1;
					main = main + 1;
					one = one + 1;
					lowerZero = lowerZero + 1;
					lower = lower + 1;
					lowerOne = lowerOne + 1;
				}
			}
			if (rankNull)
			{
				rankThreeTwo(array);
			}
		}
	}
	static void rankThreeTwo(int[][] array)
	{
		boolean rankPass = false;
		int loopStart = 0, loopEnd = 2;
		int[][] arrayTemp = new int[2][array[0].length];
		while (true)
		{
			int exitLoopOuterTemp = 0;
			for (int exitLoopOuter = loopStart; exitLoopOuter < loopEnd; exitLoopOuter++)
			{
				int exitLoopInnerTemp = 0;
				for (int exitLoopInner = 0; exitLoopInner < array[0].length; exitLoopInner++)
				{
					arrayTemp[exitLoopOuterTemp][exitLoopInnerTemp] = array[exitLoopOuter][exitLoopInner];
					exitLoopInnerTemp++;
				}
				exitLoopOuterTemp++;
			}
			System.out.print("\n");
			printArray(arrayTemp);
			if (rankTwo(arrayTemp, false))
			{
				break;
			}
			if (loopStart == (array.length - 2))
			{
				rankPass = true;
				break;
			}
			loopStart++;
			loopEnd++;
		}
		if (rankPass)
		{
			rankOne(array);
		}
	}
	static void printRank(int[][] array, boolean rankPass)
	{
		if (array.length == 1 || array[0].length == 1)
		{
			rankOne(array);
		}
		else if (array.length == 2 || array[0].length == 2)
		{
			rankTwo(array, rankPass);
		}
		else if (array.length == 3 || array[0].length == 3)
		{
			rankThree(array);
		}
	}
	static void printArray(int[][] array)
	{
		for (int exitLoopOuter = 0; exitLoopOuter < array.length; exitLoopOuter++)
		{
			for (int exitLoopInner = 0; exitLoopInner < array[0].length; exitLoopInner++)
			{
				System.out.print(array[exitLoopOuter][exitLoopInner] + " ");
			}
		System.out.print("\n");
		}
	}
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("The total number of rows or columns must be 1, 2 or 3\n");
			System.out.print("Enter total number of rows    : ");
			int rows = input.nextInt();
			System.out.print("Enter total number of columns : ");
			int columns = input.nextInt();
			boolean rankPass = true;
			int[][] array = new int[rows][columns];
			for (int exitLoopOuter = 0; exitLoopOuter < array.length; exitLoopOuter++)
			{
				for (int exitLoopInner = 0; exitLoopInner < array[0].length; exitLoopInner++)
				{
					array[exitLoopOuter][exitLoopInner] = input.nextInt();
				}
			}
			System.out.print("Your matrix is\n");
			printArray(array);
			printRank(array, rankPass);
		}
	}
}
