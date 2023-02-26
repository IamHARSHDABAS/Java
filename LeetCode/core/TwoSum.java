// https://leetcode.com/problems/two-sum/

package core;

public class TwoSum{
	public int[] find(int[] array, int target){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] + array[j] == target) return new int[] {i, j};
			}
		}
		return new int[0];
	}
}
