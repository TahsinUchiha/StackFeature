package com.infosys.testing.StackFeature;

import java.util.Stack;

public class StackFeature {
	
	private Stack stack = new Stack();
	
	public Object pop() {
		return stack.pop();
	}

	public void push(Object a) {
		stack.push(a);
	}
	
	public int size() {
		return stack.size();
	}
}
