package com.example.generatefour;
import java.util.*;

public class RandomGenerator {

	public static void main(String[] args) {
			for (int a : generateNumber()) {
				System.out.print(a);
			}
	}
	
	static int[] generateNumber() {
		Random rand = new Random(); 
		int first = rand.nextInt(9)+1;
		int second;
		int third;
		int fourth;
		do {
			second = rand.nextInt(9)+1;
		} while (first == second);
		do {
			third = rand.nextInt(9)+1;
		}
		while (third == first | third == second);	
		do {
			fourth = rand.nextInt(9)+1;
		}
		while (fourth == first | fourth == second | fourth == third);
		int[] arr = {first, second, third, fourth};
		return arr;
	}
}