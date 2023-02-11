package core;

public class RankTwo {

    public int square(int[][] array) {
        return (array[0][0] * array[1][1]) - (array[0][1] * array[1][0]);
    }

    public int row(int[][] array) {
        boolean exit = false;
        for (int x = 0; !exit; x++) {
            int northWest = array[x][0];
            int northEast = array[x][1];
            int southWest = array[x + 1][0];
            int southEast = array[x + 1][1];
            if (x + 1 == array.length - 1) {
                northWest = array[x + 1][0];
                northEast = array[x + 1][1];
                southWest = array[0][0];
                southEast = array[0][1];
                exit = true;
			}
            int rank = (northWest * southEast) - (northEast * southWest);
            if (rank != 0) return rank;
		}
        return 0;
    }

    public int column(int[][] array) {
        boolean exit = false;
        for (int x = 0; !exit; x++) {
			int northWest = array[0][x];
			int northEast = array[0][x + 1];
			int southWest = array[1][x];
			int southEast = array[1][x + 1];
            if (x + 1 == array[0].length - 1) {
                northWest = array[0][x + 1];
                northEast = array[0][0];
                southWest = array[1][x + 1];
                southEast = array[1][0];
                exit = true;
            }
            int rank = ((northWest * southEast) - (northEast * southWest));
            if (rank != 0) return rank;
        }
        return 0;
    }
}
