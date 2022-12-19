
import java.util.Scanner;
class Matrix
{
	static void rankOne(int array[][], int rows, int columns)
	{
		for (int exitLoopOuter = 0; exitLoopOuter < rows; exitLoopOuter++)
		{
			for (int exitLoopInner = 0; exitLoopInner < columns; exitLoopInner++)
			{
				if (array[exitLoopOuter][exitLoopInner] != 0)
				{
					System.out.print("Its Rank is 1\n");
					return;
				}
			}
		}
		System.out.print("Its a Zero matrix\n");
	}
	static boolean rankTwo(int array[][], int rows, int columns)
	{
		boolean rankNull = true;
		int northWest, northEast, southWest, southEast, upperZero = 0, upperOne = 1, lowerZero = 0, lowerOne = 1, lastElement;
		if (rows == columns)
		{
			int rank = (array[0][0] * array[1][1]) - (array[0][1] * array[1][0]);
			if (rank != 0)
			{
				System.out.print("Its rank is Two\n");
			}
			else
			{
				rankOne(array, rows, columns);
			}
		}
		else if (rows < columns)
		{
			lastElement = columns - 1;
			while (true)
			{
				northWest = array[0][upperZero];
				northEast = array[0][upperOne];
				southWest = array[1][lowerZero];
				southEast = array[1][lowerOne];
				int rankTwoRows = ((northWest * southEast) - (northEast * southWest));
				if (rankTwoRows != 0)
				{
					System.out.print("Its rank is Two\n");
					rankNull = false;
					break;
				}
				if (upperOne == array[0][lastElement] && lowerOne == array[1][lastElement])
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
					if (rankTwoRows != 0)
					{
						System.out.print("Its rank is Two\n");
						rankNull = false;
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
			if (rankNull)
			{
				rankOne(array, rows, columns);
			}
		}
		else if (rows > columns)
		{	
			lastElement = rows - 1;
			while (true)
			{
				northWest = array[upperZero][0];
				northEast = array[upperOne][0];
				southWest = array[lowerZero][1];
				southEast = array[lowerOne][1];
				int rankTwoColumns = ((northWest * southEast) - (northEast * southWest));
				if (rankTwoColumns != 0)
				{
					System.out.print("Its rank is Two\n");
					rankNull = false;
					break;
				}
				if (lowerZero == array[lastElement][0] && lowerOne == array[lastElement][1])
				{
					upperZero = lastElement;
					upperOne = lastElement;
					lowerZero = 0;
					lowerOne = 0;
					northWest = array[upperZero][0];
					northEast = array[upperOne][0];
					southWest = array[lowerZero][1];
					southEast = array[lowerOne][1];
					rankTwoColumns = ((northWest * southEast) - (northEast * southWest));
					if (rankTwoColumns != 0)
					{
						System.out.print("Its rank is Two\n");
						rankNull = false;
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
			if (rankNull)
			{
				rankOne(array, rows, columns);
			}
		}
		return rankNull;
	}
	static void rankThree(int array[][], int rows, int columns)
	{
		boolean rankNull = true;
		int northWest, north, northEast, east, southEast, south, southWest, west, center, upperZero = 0, upper = 1, upperOne = 2, zero = 0, main = 1, one = 2, lowerZero = 0, lower = 1, lowerOne = 2, lastElement;
		if (rows == columns)
		{
			int rankThree = (array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2]))) - Math.abs(array[0][1] * ((array[1][0] * array[2][2]) - (array[2][0] * array[1][2]))) + (array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2])));
			if (rankThree != 0)
			{
				System.out.print("Its rank is Three\n");
			}
			else
			{
				rankThreeTwo(array, rows, columns);
			}
		}
		else if (rows < columns)
		{
			lastElement = columns - 1;
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
				if (rankThreeRows != 0)
				{
					System.out.print("Its rank is Three\n");
					rankNull = false;
					break;
				}
				if (upperOne == array[0][lastElement] && one == array[0][lastElement] && lowerOne == array[0][lastElement])
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
				rankThreeTwo(array, rows, columns);
			}
		}
		else if (rows < columns)
		{
			lastElement = rows - 1;
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
				if (rankThreeRows != 0)
				{
					System.out.print("Its rank is Three\n");
					rankNull = false;
					break;
				}
				if (lowerZero == array[0][lastElement] && lower == array[0][lastElement] && lowerOne == array[0][lastElement])
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
		}
	}
	static void rankThreeTwo(int array[][], int rows, int columns)
	{
		int arrayTemp[][] = new int[2][columns];
		for (int exitLoop = 0; exitLoop < rows; exitLoop++)
		{
			arrayTemp[exitLoop] = array[exitLoop];
			arrayTemp[exitLoop + 1] = array[exitLoop + 1];
			if (rankTwo(arrayTemp, rows, columns))
			{
				break;
			}
		}
	}
	static void printRank(int array[][], int rows, int columns)
	{
		if (rows == 1 || columns == 1)
		{
			rankOne(array, rows, columns);
		}
		if (rows == 2 || columns == 2)
		{
			rankTwo(array, rows, columns);
		}
		if (rows == 3 || columns == 3)
		{
			rankThree(array, rows, columns);
		}
	}
	static void printArray(int array[][], int rows, int columns)
	{
		for (int exitLoopOuter = 0; exitLoopOuter < rows; exitLoopOuter++)
		{
			for (int exitLoopInner = 0; exitLoopInner < columns; exitLoopInner++)
			{
				System.out.print(array[exitLoopOuter][exitLoopInner] + " ");
			}
		System.out.print("\n");
		}
	}
	public static void main(String args[])
	{
		try (Scanner input = new Scanner(System.in))
		{
			System.out.print("DONT USE MATRIX ROWS OR COLUMNS GREATER THAN 3\nONE MUST BE 1, 2 OR 3\nNo 0 in rows and columns\nIT IS STILL UNFINISHED\n");
			System.out.print("Enter total number of rows    : ");
			int rows = input.nextInt();
			System.out.print("Enter total number of columns : ");
			int columns = input.nextInt();
			int array[][] = new int[rows][columns];
			for (int exitLoopOuter = 0; exitLoopOuter < rows; exitLoopOuter++)
			{
				for (int exitLoopInner = 0; exitLoopInner < columns; exitLoopInner++)
				{
					array[exitLoopOuter][exitLoopInner] = input.nextInt();
				}
			}
			System.out.print("Your matrix is\n");
			printArray(array, rows, columns);
			printRank(array, rows, columns);
		}
		catch (Exception inpuException)
		{
			System.out.print("Invalid input\n");
		}
	}
}
