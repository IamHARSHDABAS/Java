class FindFirstAndLastPositionOfElementInSortedArray
{
	public int[] searchRange(int[] array, int target)
	{
		boolean firstDone = false;
		int first = -1;
		int last = -1;
		for (int exitLoop = 0; exitLoop < array.length; exitLoop++)
		{
			if (array[exitLoop] == target)
			{
				if (!firstDone)
				{
					first = exitLoop;
					firstDone = true;
				}
				last = exitLoop;
			}
			else if (firstDone) break;
		}
		return new int[]{first, last};
	}
}
