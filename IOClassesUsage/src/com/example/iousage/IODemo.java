package com.example.iousage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) throws IOException {
		FileInputStream finput = null;
		FileOutputStream fout = null;
		int i;
		
		try {
			finput = new FileInputStream("D:/text.txt");
			fout = new FileOutputStream("D:/text_copy.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			do {
				i = finput.read();
				if (i != -1) fout.write(i);;
			} while (i != -1);
			System.out.println("Copy is ready");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			finput.close();
			fout.close();
		}
		String s = "Hello world";
		char[] charSeq = s.toCharArray();
		fout = new FileOutputStream("D:/char_array.txt");
		for (int j = 0; j < charSeq.length; j++) {
			fout.write(charSeq[j]);
		}
		fout.close();
	}
}
