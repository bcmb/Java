package com.example.generatefour;
import java.util.*;

public class Random1 {

	public static void main(String[] args) {
		
		}
	
	static int generateSingleRandomNumber() {
		 Random rand = new Random(); 
		 int one = rand.nextInt(9)+1;
		 System.out.print(one);
		 int two = 0;
		 int three = 0;
		 int four = 0;
		 for (int i = 0; i < 4; i++) {
			two = rand.nextInt(9)+1;
		 }
		 int randomNum = rand.nextInt(9)+1;
		 return randomNum;
		
	}

}