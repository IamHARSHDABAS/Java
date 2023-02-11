package core;

public class RankOne {

    public int rank(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) return array[i][j];                
            }
        }
        return 0;
    }

}