public class Solution
{
	public int[] twoSum(int[] number, int target)
	{
		for (int exitLoopOuter = 0; exitLoopOuter < number.length; exitLoopOuter++)
		{
			for (int exitLoopInner = exitLoopOuter + 1; exitLoopInner < number.length; exitLoopInner++)
			{
				if (number[exitLoopOuter] + number[exitLoopInner] == target)
				{
					return new int[] {exitLoopOuter, exitLoopInner};
				}
			}
		}
	return null;
	}
}
