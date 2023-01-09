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
			int minHeight = Math.min(leftHeight, rightHeight);
			area = Math.max(area, minHeight * (right - left));
			if (leftHeight < rightHeight) left++;
			else right--;
		}
		return area;
	}
}
