import java.util.Scanner;
class Shooting
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Choose training type\nMatch\n[1] 10M\n[2] 25M\n[3] 50M\n[4] Custom\nEnter 1, 2, 3 or 4: ");
		int choice = input.nextInt();
		switch (choice)
		{
			case 1:
				match10();
				break;
			case 2:
				match25();
				break;
			case 3:
				match50();
				break;
			case 4:
				custom();
				break;
			default:
				System.out.println("INVALID INPUT");
		}
	}
	static void match10()
	{
	}
	static void match25()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Choose training type\nMatch\n[1] 10M\n[2] 25M\n[3] 50M\nCustom\n[4] 10M\n[5] 25M\n[6] 50M\nEnter 1, 2, 3, 4, 5 or 6: ");
		int choice = input.nextInt();
		switch (choice)
		{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("INVALID INPUT");
		}
	}
	static void match50()
	{
	}
}
