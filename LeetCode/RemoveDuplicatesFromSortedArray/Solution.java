class Solution
{
	public int removeDuplicates(int[] number)
	{
		// TODO convert -6969 to clean version
		int current,  last = -6969, pointer = 0;
		for (int exitLoop : number)
		{
			current = exitLoop;
			if (last != current)
			{
				number[pointer] = exitLoop;
				pointer++;
			}
			last = current;
		}
		for (int exitLoop = pointer; exitLoop < number.length; exitLoop++)
		{
			number[exitLoop] = 0;
		}
		return pointer;
	}
}
