package core;

public class RankThree {

    public int three(int[][] array) {
        if (array.length == array[0].length) {
            return rank(
                array[0][0], array[0][1], array[0][2],
                array[1][0], array[1][1], array[1][2],
                array[2][0], array[2][1], array[2][2]
                );
        }
        if (array.length > array[0].length) return 1;
        else return 0;
    }

    static int rank(int northWest, int north, int northEast, int west, int center, int east, int southEast, int south, int southWest) {
        int left  =         (northWest * ((center * southEast) - (south     * east  )));
        int mid   = Math.abs(north     * ((west   * southEast) - (southWest * east  )));
        int right =         (northEast * ((west   * south)     - (southWest * center)));
        return left - mid + right;
    }

    static int row(int[][] array) {
        int northWest, north, northEast, east, southEast, south, southWest, west, center;
        int upperZero = 0, upper = 1, upperOne = 2, zero = 0, main = 1, one = 2, lowerZero = 0, lower = 1, lowerOne = 2;
        while (true) {
            northWest = array[0][upperZero];
            north     = array[0][upper];
            northEast = array[0][upperOne];
            west      = array[1][zero];
            center    = array[1][main];
            east      = array[1][one];
            southWest = array[2][lowerZero];
            south     = array[2][lower];
            southEast = array[2][lowerOne];
            if (lowerOne == array.length - 1) {
                northWest = array[0][array[0].length - 2];
                north     = array[0][array[0].length - 1];
                northEast = array[0][0];
                west      = array[1][array[0].length - 2];
                center    = array[1][array[0].length - 1];
                east      = array[1][0];
                southWest = array[2][array[0].length - 2];
                south     = array[2][array[0].length - 1];
                southEast = array[2][0];
                if (rank(northWest, north, northEast, west, center, east, southEast, south, southWest) != 0) {
                    return rank(northWest, north, northEast, west, center, east, southEast, south, southWest);
                }
                northWest = array[0][array[0].length - 1];
                north     = array[0][0];
                northEast = array[0][1];
                west      = array[0][array[0].length - 1];
                center    = array[0][0];
                east      = array[0][1];
                southWest = array[0][array[0].length - 1];
                south     = array[0][0];
                southEast = array[0][1];
                if (rank(northWest, north, northEast, west, center, east, southEast, south, southWest) != 0) {
                    return rank(northWest, north, northEast, west, center, east, southEast, south, southWest);
                }
            }          
            upperZero++; upper++; upperOne++;
            zero++;      main++;  one++;
            lowerZero++; lower++; lowerOne++;
            return 0;
        }
    }

    static int column(int[][] array) {
        int northWest, north, northEast, east, southEast, south, southWest, west, center;
        int upperZero = 0, upper = 1, upperOne = 2, zero = 0, main = 1, one = 2, lowerZero = 0, lower = 1, lowerOne = 2;
        while (true) {
				northWest = array[upperZero][0];
				north = array[upper][0];
				northEast = array[upperOne][0];
				west = array[zero][0];
				center = array[main][0];
				east = array[one][0];
				southWest = array[lowerZero][0];
				south = array[lower][0];
				southEast = array[lowerOne][0];
				if (lowerOne == array.length - 1)
				{
					northWest = array[array.length - 2][0];
					north     = array[array.length - 1][0];
					northEast = array[0][0];
					west      = array[array.length - 2][1];
					center    = array[array.length - 1][1];
					east      = array[0][1];
					southWest = array[array.length - 2][2];
					south     = array[array.length - 1][2];
					southEast = array[0][2];
                    if (rank(northWest, north, northEast, west, center, east, southEast, south, southWest) != 0) {
                        return rank(northWest, north, northEast, west, center, east, southEast, south, southWest);
                    }
					northWest = array[array.length][0];
					north = array[upper][0];
					northEast = array[upperOne][0];
					west = array[zero][0];
					center = array[main][0];
					east = array[one][0];
					southWest = array[lowerZero][0];
					south = array[lower][0];
					southEast = array[lowerOne][0];
                    if (rank(northWest, north, northEast, west, center, east, southEast, south, southWest) != 0) {
                        return rank(northWest, north, northEast, west, center, east, southEast, south, southWest);
                    }
				upperZero = upperZero + 1;
				upper = upper + 1;
				upperOne = upperOne + 1;
				zero = zero + 1;
				main = main + 1;
				one = one + 1;
				lowerZero = lowerZero + 1;
				lower = lower + 1;
				lowerOne = lowerOne + 1;
			}
            return 0;
        }
    }

    public boolean status(int[][] array) {
        return three(array) != 0;
    }

}  