package core;

public class RankOne {

    public int rank(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                if (j != 0) return j;
            }
        }
        return 0;
    }

}