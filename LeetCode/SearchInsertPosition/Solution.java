class Solution
{
	public int searchInsert(int[] array, int target)
	{
		int min = 0, mid, max = array.length - 1;
		while (min <= max)
		{
			mid = (min + max)/2;
			if (target > array[mid]) min = mid + 1;
			else if (target < array[mid]) max = mid - 1;
			else return mid;
		}
		return min;
	}
}
