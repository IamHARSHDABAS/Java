package core;

public class RankTwo {
        
    static int two(int[][] array) {
        if (array.length == array[0].length) {
            return (array[0][0] * array[1][1]) - (array[0][1] * array[1][0]);
        }
        if (array.length > array[0].length) return row(array);
        else return column(array);
    }

    static int row(int[][] array) {
        int rank, northWest, northEast, southWest, southEast;
        int upperZero = 0, upperOne = 1, lowerZero = 0, lowerOne = 1;
        boolean last = false;
		while (true) {
			northWest = array[0][upperZero];
			northEast = array[0][upperOne];
			southWest = array[1][lowerZero];
			southEast = array[1][lowerOne];
            if (lowerOne == array.length - 1) {
				northWest = array[0][array.length - 1];
				northEast = array[0][0];
				southWest = array[1][array.length - 1];
				southEast = array[1][0];
                last = true;
			}
            rank = (northWest * southEast) - (northEast * southWest);
            if (rank != 0) return rank;
            else if (last) return 0;
			upperZero = upperZero + 1;
			upperOne  = upperOne + 1;
			lowerZero = lowerZero + 1;
			lowerOne  = lowerOne + 1;
		}
    }

    static int column(int[][] array) {
        int rank, northWest, northEast, southWest, southEast;
        int upperZero = 0, upperOne = 1, lowerZero = 0, lowerOne = 1;
        boolean last = false;
        while (true) {
            northWest = array[upperZero][0];
            northEast = array[upperOne][0];
            southWest = array[lowerZero][1];
            southEast = array[lowerOne][1];
            if (lowerOne == array[0].length - 1) {
                northWest = array[array[0].length - 1][0];
                northEast = array[array[0].length - 1][0];
                southWest = array[0][1];
                southEast = array[0][1];
                last = true;
            }
            rank = ((northWest * southEast) - (northEast * southWest));
            if (rank != 0) return rank;
            else if (last) return 0;
            upperZero++; upperOne++;
            lowerZero++; lowerOne++;
        }
    }

    public boolean status(int[][] array) {
        return two(array) != 0;
    }

}
