//3.4 Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.

import java.util.*;
class Four_QueByTwoStacks {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(10);
		stack.push(11);
		stack.push(7);
		stack.push(8);

		//System.out.println(stack);
		System.out.println(sort_stack(stack));

	}

	private static Stack<Integer> sort_stack(Stack<Integer> stack) {
		// stack: 1, 10, 11, 7, 8
		// new:   1, 7, 8, 10, 11
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Stack<Integer> res = new Stack<>();
		while(!stack.isEmpty()) {
			pq.add(stack.pop());
		}

		while(!pq.isEmpty()) {
			res.push(pq.remove());
		}
		return res;
	}
}
