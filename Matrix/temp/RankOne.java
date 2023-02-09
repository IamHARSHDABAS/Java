package temp;

import java.util.Arrays;

public class RankOne {

    static int[] one(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) return new int[]{i, j};                
            }
        }
        return null;
    }

    public boolean status(int[][] array) {
        System.out.println(Arrays.toString(array));
        return one(array) != null;
    }

    public int[] location(int[][] array) {
        if (one(array) != null) return one(array);
        return null;
    }

}