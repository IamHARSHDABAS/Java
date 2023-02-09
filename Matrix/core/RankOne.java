package core;

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
        return one(array) != null;
    }

}