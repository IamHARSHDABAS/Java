import java.util.concurrent.TimeUnit;
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
	}
	static sleep(int seconds)
	{
		TimeUnit.SECONDS.sleep(seconds);
	}
}
