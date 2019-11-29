/*
1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place? 

*/
class Seven_RotateMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3}, 
						{4,5,6}, 
						{7,8,9}};

		int[][] LEFT = RotateLEFT(arr1);
		int[][] RIGHT = RotateRIGHT(arr1);

	}
	private static int[][] RotateLEFT(int[][] arr) {
		int[][] res = new int[arr.length][arr.length]; 

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				res[i][j] = arr[j][arr.length - i - 1];

				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		return res;
	}
	
	private static int[][] RotateRIGHT(int[][] arr) {
		int[][] res = new int[arr.length][arr.length]; 

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				res[i][j] = arr[arr.length - j - 1][i];

				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		return res;
	}

}
