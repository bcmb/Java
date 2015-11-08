package com.example.mergearrays;

public class MergeArrays {
	public static void main(String[] args) {
		System.out.println("Demo #1");
		int[] arr1 = {0,1,2,5,6};
		int[] arr2 = {3,4,7,8,9};
		for (int i : mergeTwoArrays(arr1, arr2)) {
			System.out.println(i);
		}
		System.out.println("Demo #2");
		int[] arr3 = {0,4,6,7,9};
		int[] arr4 = {1,2,3,5,8};
		for (int i : mergeTwoArrays(arr3, arr4)) {
			System.out.println(i);
		}
		System.out.println("Demo #3");
		int[] arr5 = {1,2,3,5,8};
		int[] arr6 = {0,4,6,7,9};
		for (int i : mergeTwoArrays(arr5, arr6)) {
			System.out.println(i);
		}
	}
	public static int[] mergeTwoArrays(int[] first, int[] second){
	int[] result = new int[first.length+second.length];
	int indexOfFirst = 0;
	int indexOfSecond = 0;
		for (int i = 0; i < result.length; i++) {
			if(indexOfSecond != second.length) {
				if(indexOfFirst != first.length && first[indexOfFirst] < second[indexOfSecond]) {
					result[i] = first[indexOfFirst];
					indexOfFirst++;
				} else if (indexOfSecond != second.length) {
					result[i] = second[indexOfSecond];;
					indexOfSecond++;
				}
			} else if (indexOfFirst != first.length) {
				result[i] = first[indexOfFirst];;
				indexOfSecond++;
			}
		}
	return result;
	}
}
