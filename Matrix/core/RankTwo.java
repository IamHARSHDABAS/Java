package core;

public class RankTwo {

    public int square(int[][] array) {
        return (array[0][0] * array[1][1]) - (array[0][1] * array[1][0]);
    }

    public int row(int[][] array) {
        int northWest;
        int northEast;
        int southWest;
        int southEast;
        boolean exit = false;
        for (int x = 0; !exit; x++) {
            if (x == array.length - 1) {
                northWest = array[x][0];
                northEast = array[x][1];
                southWest = array[0][0];
                southEast = array[0][1];
                exit = true;
            }
            else {
                northWest = array[x][0];
                northEast = array[x][1];
                southWest = array[x + 1][0];
                southEast = array[x + 1][1];
            }
            int rank = (northWest * southEast) - (northEast * southWest);
            if (rank != 0) return rank;
        }
        return 0;
    }

    public int column(int[][] array) {
        boolean exit = false;
            int northWest;
            int northEast;
            int southWest;
            int southEast;
            for (int x = 0; !exit; x++) {
            if (x == array[0].length - 1) {
                northWest = array[0][x];
                northEast = array[0][0];
                southWest = array[1][x];
                southEast = array[1][0];
                exit = true;
            }
            else {
                northWest = array[0][x];
                northEast = array[0][x + 1];
                southWest = array[1][x];
                southEast = array[1][x + 1];
            }
            int rank = (northWest * southEast) - (northEast * southWest);
            if (rank != 0) return rank;
        }
        return 0;
    }
}
