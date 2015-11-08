package com.example.stack;

public class Stack {
	private int stackPointer = 0;
	private int[] stackArray;
	private static final int DEFAULT_STACK_SIZE = 10;
	
	Stack() {
		stackArray = new int[DEFAULT_STACK_SIZE];
	}
	
	Stack(int stackSize) {
		stackArray = new int[stackSize];
	}
		
	int pop() {
		if (stackPointer == 0) System.out.println("Stack is empty");
		if (stackPointer != 0) {
			stackPointer--;
			System.out.println(stackArray[stackPointer]);
			return stackArray[stackPointer];
		}
		if (stackPointer < (stackArray.length/3)*2) decreaseStackSize();
		return 0;
	}
	
	void push(int item){
		if (stackPointer > stackArray.length-1) {
			increaseStackSize();
			stackArray[stackPointer] = item;
			stackPointer++;
		} else {
			stackArray[stackPointer] = item;
			stackPointer++;
		}
	}
	
	private void increaseStackSize() {
		int[] increasedStack = new int[stackArray.length*2];
		for (int i = 0; i < stackArray.length; i++) {
			increasedStack[i] = stackArray[i];
		}
		stackArray = increasedStack;
		System.out.println("Stack initial size exceeded. Stack initial size was increased by 2 times and now it equals "+stackArray.length);
	}
	

	private void decreaseStackSize() {
		int[] decreasedStack = new int[(stackArray.length/3)*2];
		for (int i = 0; i < (stackArray.length/3)*2; i++) {
			decreasedStack[i] = stackArray[i];
		}
		stackArray = decreasedStack;
		System.out.println("Stack size was too big. Stack size was decreased by 1/3 times and now it equals "+stackArray.length);
	}
	
	void size() {
		System.out.println("Current stack size is: "+stackArray.length);
	}
	
	void getStackContent() {
		for (int i = 0; i < stackPointer; i++) {
			System.out.println(stackArray[i]);
		}
	}
}
