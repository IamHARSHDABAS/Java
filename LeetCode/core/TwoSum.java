// https://leetcode.com/problems/two-sum/

package core;

public class TwoSum{

    public int[] find(int[] array, int target){
        for (int i: array) {
            for (int j: array) {
                if (array[i] + array[j] == target) return new int[] {i, j};
            }
        }
        return new int[0];
    }

}