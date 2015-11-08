package com.example.bagcollection;

public class ObjectTest {

	int i = 10;

	public static void main(String[] args) {
		
		ObjectTest ot1 = new ObjectTest();
		Object o = new Object();
		Object[] oArr = {ot1, o};
		System.err.println("~~~~~~~~~~~~");
		System.out.println(((ObjectTest)(oArr[0])).i);
		
		System.out.println(ot1.equals(o));
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = s2.substring(0,5);
		System.out.println(s3);
		
	}

}
