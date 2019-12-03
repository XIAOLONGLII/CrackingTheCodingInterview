/*8.1 Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time, implement a method to count how many possible ways the child can run up the
stairs
*/
class One_Stairs {
	public static void main(String[] args) {
		int stairs = 5;
		System.out.println(countWays(stairs));
		System.out.println(fib(stairs));
	}
  //fib 2^n O(n)
	private static int fib(int n) {
		if(n < 0) return 0;
		if( n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1) + fib(n - 3);
	}

  // O(n)
	private static int countWays(int stairs) {
	
		int[] memory = new int[stairs + 1];
		memory[0] = 1;
		memory[1] = 1;
		memory[2] = 2;
		for(int i = 3; i <= stairs; i++) {
			memory[i] = memory[i - 3] + memory[i - 2] + memory[i - 1];
		}
		return memory[stairs];
	}
}
/*
n = 4,
i = 3, m[3] = m[0] + m[1] + m[2] = 4
i = 4, m[4] = m[1] + m[2] + m[3] = 3 +4 = 7


*/
