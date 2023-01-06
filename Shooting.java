import java.util.Scanner;
class Shooting
{
	public static void main(String[] args)
	{
		int choiceOuter, choiceInner;
		char sighter, status;
		Scanner input = new Scanner(System.in);
		System.out.print("Choose training type\n[1] 10M\n[2] 25M\n[3] 50M\n[4] Custom\nEnter 1, 2, 3 or 4: ");
		choiceOuter = input.nextInt();
		switch (choiceOuter)
		{
			case 1:
				System.out.print("Do you want sighter time ?\n[y/n]: ");
				sighter = input.next().charAt(0);
				System.out.print("Are you issf ?\n[y/n]: ");
				status = input.next().charAt(0);
				air(sighter, status);
				break;
			case 2:
				System.out.print("[1] center\n[2] sports\n[3] standard\n[4] rapid\nEnter 1, 2, 3 or 4: ");
				choiceInner = input.nextInt();
				System.out.print("Do you want sighter time ?\n[y/n]: ");
				sighter = input.next().charAt(0);
				System.out.print("Are you issf ?\n[y/n]: ");
				status = input.next().charAt(0);
				switch (choiceInner)
				{
					case 1:
						center(sighter, status);
						break;
					case 2:
						sports(sighter, status);
						break;
					case 3:
						standard(sighter, status);
						break;
					case 4:
						rapid(sighter, status);
						break;
				}
				break;
			case 3:
				System.out.print("Do you want sighter time ?\n[y/n]: ");
				sighter = input.next().charAt(0);
				System.out.print("Are you issf ?\n[y/n]: ");
				status = input.next().charAt(0);
				free(sighter, status);
				break;
			case 4:
				custom();
				break;
		}
	}
	static void air(char sighter, char status)
	{
		if (sighter == "Y" || sighter == "y")
		{
			// TODO
		}
		if (status == "Y" || status == "y")
		{
			// TODO
		}
		else
		{
			// TODO
		}
	}
	static void center(char sighter, char status)
	{
		if (sighter == "Y" || sighter == "y")
		{
			// TODO
		}
		if (status == "Y" || status == "y")
		{
			// TODO
		}
		else
		{
			// TODO
		}
	}
	static void sports(char sighter, char status)
	{
		if (sighter == "Y" || sighter == "y")
		{
			// TODO
		}
		if (status == "Y" || status == "y")
		{
			// TODO
		}
		else
		{
			// TODO
		}
	}
	static void standard(char sighter, char status)
	{
		if (sighter == "Y" || sighter == "y")
		{
			// TODO
		}
		if (status == "Y" || status == "y")
		{
			// TODO
		}
		else
		{
			// TODO
		}
	}
	static void rapid(char sighter, char status)
	{
		if (sighter == "Y" || sighter == "y")
		{
			// TODO
		}
		if (status == "Y" || status == "y")
		{
			// TODO
		}
		else
		{
			// TODO
		}
	}
	static void free(char sighter, char status)
	{
		if (sighter == "Y" || sighter == "y")
		{
			// TODO
		}
		if (status == "Y" || status == "y")
		{
			// TODO
		}
		else
		{
			// TODO
		}
	}
}
