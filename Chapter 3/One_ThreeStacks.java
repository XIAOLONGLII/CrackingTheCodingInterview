//3.1 Three in One: Describe how you could use a single array to implement three stacks. 
class One_ThreeStacks{

	public static void main(String[] args) {
		int[] arr = {1, 2, 3,10, 9 ,8, 8};
		generateStack(arr);
	}
	private static void generateStack(int[] arr) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();

		for(int i = 0; i < arr.length / 3; i++){
			stack1.push(arr[i]);
		}
		for(int i = arr.length / 3; i < 2* arr.length / 3; i++){
			stack2.push(arr[i]);
		}
		for(int i = 2* arr.length / 3; i < arr.length; i++){
			stack3.push(arr[i]);
		}

		System.out.println(stack1);
		System.out.println(stack2);
		System.out.println(stack3);
	}
