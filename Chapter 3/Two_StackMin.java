/*
3.2 Stack Min: How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum eiement? Push, pop and min should ail operate in 0(1 ) time. 
*/

public class StackwithMin extends Stack<NodeWithMin> {
		public void push(int value) {
			int newMin = Math.min(value, min());
			super.push(new NodeWithMin(value, newMin));
		}
		public int min(){
			if(this.isEmpty()){
				return Integer.MAX_VALUE;
			}
			else {
				return peek().min;
			}
		}
	}
	
	class NodeWithMin{
	public int value;
	public int min;
	public NodeWithMin(int value, int min) {
		this.value = value;
		this.min = min;
	}
}


// how to implement a stack

class Stack {
	StackNode root;
	
	static class StackNode {
		int data;
		StackNode next;
		StackNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if(root == null) {
			root = newNode;
		}
		else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " pushed to stack"); 
	}
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("stack is empty");
		}
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}
	public int peek() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(5);
		stack.push(1);
		System.out.println("Stack popped : "+stack.pop());
		System.out.println("Stack top value is : "+stack.peek());

	}


}
