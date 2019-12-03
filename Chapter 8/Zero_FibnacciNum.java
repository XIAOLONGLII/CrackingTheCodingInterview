// Let's walk through an approach to compute the nth Fibonacci number. 
class Zero_FibnacciNum {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(fib(num));
		System.out.println(fib2(num));
	}
	// num = 5, fib(4) + fib(3) =  fib(3) + fib(2) + fib(2) + fib(1)= fib(2) + fib(1) + fib(2) + fib(2) + fib(1)= 8
	private static int fib(int num) {
		// 1, 2, 3, 5, 8, 13
		if( num <= 1) return num;
		if(num == 2) return 2;
		return fib(num - 1) + fib(num - 2);
	}

	private static int fib2(int num) {

		int[] cache = new int[num + 1];
		cache[1] = 1;
		cache[2] = 2;
		for(int i = 3; i <= num; i++){
			cache[i] = cache[i - 1] + cache[i - 2];
		}
		return cache[num];
	}
	//num = 5 cache = [0,0,0,0,0,0]
	// cache[1] = 1, cache[2] = 2;
	// i = 3, i<= 5
	// cache[3] = cache[2] + cache[1] = 3
	// i = 4
	// cache[4] = cache[3] + cache[2] = 3 + 2 = 5
	// cache[5] = cache[4] + cache[3] = 5 + 3 = 8;
}
