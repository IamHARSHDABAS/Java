class Solution
{
	public int maxArea(int[] height)
	{
		int left = 0;
		int right = height.length - 1;
		int area = 0;
		while (left < right)
		{
			int leftHeight = height[left];
			int rightHeight = height[right];
			if (leftHeight < rightHeight)
			{
				int minHeight = Math.min(leftHeight, rightHeight);
				area = Math.max(area, minHeight * (right - left));
				left++;
			}
			else
			{
				int minHeight = Math.min(leftHeight, rightHeight);
				area = Math.max(area, minHeight * (right - left));
				right--;
			}
		}
		return area;
	}
}