import java.util.Scanner;
public class RomanToInteger
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Symbol	Value\nI	1\nV	5\nX	10\nL	50\nC	100\nD	500\nM	1000\nEnter roman number: ");
		String number = input.nextLine().trim().toUpperCase();
		String[] array = number.split("");
		int current = 0, previous = 0, sum = 0;
		for (int exitLoop = array.length; exitLoop > 0; exitLoop--)
		{
			switch (array[exitLoop - 1])
			{
				case "I" -> current = 1;
				case "V" -> current = 5;
				case "X" -> current = 10;
				case "L" -> current = 50;
				case "C" -> current = 100;
				case "D" -> current = 500;
				case "M" -> current = 1000;
			}
			if (previous > current)
			{
				sum = sum - current;
			}
			else
			{
				sum = sum + current;
			}
			previous = current;
		}
		System.out.println(sum);
	}
}
