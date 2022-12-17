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
	static void rankTwo(int array[][], int rows, int columns)
	{
		boolean rankNull = true;
		int northWest, northEast, southWest, southEast, upperZero = 0, upperOne = 1, lowerZero = 0, lowerOne = 1, lastElement;
		if (rows == 2 && columns == 2)
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
		else if (rows == 2)
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
		else if (columns == 2)
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
	}
	static void rankThree(int array[][], int rows, int columns)
	{
		if (rows == 3 && columns == 3)
		{
			int rank = (array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2]))) - Math.abs(array[0][1] * ((array[1][0] * array[2][2]) - (array[2][0] * array[1][2]))) + (array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2])));
			if (rank != 0)
			{
				System.out.print("Its rank is Three\n");
			}
			else
			{
				// WTF is this !!!
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
		Scanner input = new Scanner(System.in);
		System.out.print("DONT USE MATRIX ROWS OR COLUMNS GREATER THAN 2\nONE MUST BE 1 OR 2\nNO 0 OK\nIT IS STILL UNFINISHED\n");
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
}
