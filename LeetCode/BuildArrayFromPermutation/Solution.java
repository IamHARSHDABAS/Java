class Solution
{
	public int[] buildArray(int[] array)
	{
		int[] arrayTemp = new int[array.length];
		for (int exitLoop: array)
		{
			arrayTemp[exitLoop] = array[array[exitLoop]];
		}
		return arrayTemp;
	}
}
