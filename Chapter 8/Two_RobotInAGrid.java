/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

/*
import java.util.*;
class RobotInAGrid{
	public static void main(String[] args) {
		int row = 5;
		int col = 4;
		System.out.println(UniquePath(row, col));
		System.out.println(UniquePath2(row, col));
		System.out.println(UniquePath3(row, col));
	}
	private static int UniquePath(int row, int col) {
		/*
	1. When (n==0||m==0) the function always returns 1 
	   since the robot can't go left or up.
	2. For all other cells. The result = uniquePaths(m-1,n) + uniquePaths(m,n-1)
		*/

		/*
		--------->
		|	1 1 1 1
		|	1 2 3 4
		>	1 3 6 10
			1 4 10 20


		*/
		Integer[][] map = new Integer[row][col];
		for(int i = 0; i < row; i++) {
			map[i][0] = 1;
		}

		for(int i = 0; i < col; i++) {
			map[0][i] = 1;
		}

		for(int i = 1; i < row; i++) {
			for(int j = 1; j < col; j++) {
				map[i][j] = map[i -1][j] + map[i][j - 1];
			}
		}

		return map[row -1][col - 1];
	}

	private static int UniquePath2(int row, int col) {

		if(row == 0 || col == 0) return 0;
		if(row == 1 || col == 1) return 1;

		int[] cache = new int[col];
		for(int i = 0; i < col; i++) {
			cache[i] = 1;
		}

		for(int i = 1; i < row; i++) {
			for(int j = 1; j < col; j++){
				cache[j] = cache[j] + cache[j - 1];
			}
		}
		return cache[col - 1];
	}

	private static int UniquePath3(int row, int col) {

		if(row == 0 || col == 0) return 0;
		if(row == 1 || col == 1) return 1;

		int[] cache = new int[col];
		Arrays.fill(cache, 1);

		for(int i = 1; i < row; i++) {
			for(int j = 1; j < col; j++){
				cache[j] = cache[j] + cache[j - 1];
			}
		}
		return cache[col - 1];
	}


}
