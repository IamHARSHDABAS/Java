class RemoveElement
{
	public int removeElement(int[] number, int target)
	{
		int pointer = 0;
		for (int exitLoop = 0; exitLoop < number.length; exitLoop++)
		{
			if (number[exitLoop] != target)
			{
				number[pointer] = number[exitLoop];
				pointer++;
			}
		}
		return pointer;
	}
}