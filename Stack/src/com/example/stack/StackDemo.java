package com.example.stack;

public class StackDemo {

	public static void main(String[] args) {
		//Demo
		Stack st = new Stack(5);
		/*for (int i = 0; i < 20; i++) {
			st.push(i);
		}
		st.getStackContent();
		for (int i = 0; i < 16; i++) {
			st.pop();
		}
		st.size();
		st.getStackContent();*/
		st.push(10);
		st.push(20);
		st.push(30);
		st.getStackContent();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
	}
}
