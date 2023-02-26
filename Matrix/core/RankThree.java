package core;

public class RankThree {
	static int rank(int northWest, int north, int northEast,
			int west, int center, int east,
			int southWest, int south, int southEast) {
		int left = (northWest * ((center * southEast) - (south * east)));
		int mid = Math.abs(north * ((west * southEast) - (southWest * east)));
		int right = (northEast * ((west * south) - (southWest * center)));
		return left - mid + right;
	}
	public int square(int[][] array) { return rank(
			array[0][0], array[0][1], array[0][2],
			array[1][0], array[1][1], array[1][2],
			array[2][0], array[2][1], array[2][2]
		);
	}
	public int row(int[][] array) {
		int rank;
		int northWest;
		int north;
		int northEast;
		int west;
		int center;
		int east;
		int southWest;
		int south;
		int southEast;
		boolean exit = false;
		for (int x = 1; !exit; x++) {
			if (x == array.length - 1) {
				northWest = array[x - 1][0];
				north = array[x][0];
				northEast = array[0][0];
				west = array[x - 1][1];
				center = array[x][1];
				east = array[0][1];
				southWest = array[x - 1][2];
				south = array[x][2];
				southEast = array[0][2];
			}
			else if (x == array.length) {
				northWest = array[x - 1][0];
				north = array[0][0];
				northEast = array[1][0];
				west = array[x - 1][1];
				center = array[0][1];
				east = array[1][1];
				southWest = array[x - 1][2];
				south = array[0][2];
				southEast = array[1][2];
				exit = true;
			}
			else {
				northWest = array[x - 1][0];
				north = array[x][0];
				northEast = array[x + 1][0];
				west = array[x - 1][1];
				center = array[x][1];
				east = array[x + 1][1];
				southWest = array[x - 1][2];
				south = array[x][2];
				southEast = array[x + 1][2];
			}
			rank = rank(northWest, north, northEast,
					west, center, east,
					southWest, south, southEast);
			if (rank != 0) return rank;
		}
		return 0;
	}
	public int column(int[][] array) {
		int rank;
		int northWest;
		int north;
		int northEast;
		int west;
		int center;
		int east;
		int southWest;
		int south;
		int southEast;
		boolean exit = false;
		for (int x = 1; !exit; x++) {
			if (x == array[0].length - 1) {
				northWest = array[0][x - 1];
				north = array[0][x];
				northEast = array[0][0];
				west = array[1][x - 1];
				center = array[1][x];
				east = array[1][0];
				southWest = array[2][x - 1];
				south = array[2][x];
				southEast = array[2][0];
			}
			else if (x == array[0].length) {
				northWest = array[0][x - 1];
				north = array[0][0];
				northEast = array[0][1];
				west = array[1][x - 1];
				center = array[1][0];
				east = array[1][1];
				southWest = array[2][x - 1];
				south = array[2][0];
				southEast = array[2][1];
				exit = true;
			}
			else {
				northWest = array[0][x - 1];
				north = array[0][x];
				northEast = array[0][x + 1];
				west = array[1][x - 1];
				center = array[1][x];
				east = array[1][x + 1];
				southWest = array[2][x - 1];
				south = array[2][x];
				southEast = array[2][x + 1];
			}
			rank = rank(northWest, north, northEast,
					west, center, east,
					southWest, south, southEast);
			if (rank != 0) return rank;
		}
		return 0;
	}
}
