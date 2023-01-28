class BuildArrayFromPermutation
{
	public int[] buildArray(int[] array)
	{
		int[] arrayTemp = new int[array.length];
		for (int exitLoop = 0; exitLoop < array.length; exitLoop++) arrayTemp[exitLoop] = array[array[exitLoop]];
		return arrayTemp;
	}
}