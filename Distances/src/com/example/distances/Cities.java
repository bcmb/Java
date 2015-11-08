package com.example.distances;

public class Cities {

	public static void main(String[] args) {
		System.out.println(getDistance(0, 6));
		System.out.println(getDistanceOptimized(0, 6));
	}
	public static int getDistance(int a, int b) {
		int p = 0;
		int[] distances = {17, 6, 19, 7, 5, 3};
		for (;a < b; a++) {
			p += distances[a];
		}
		
		return p;
	}
	public static int getDistanceOptimized(int a, int b) {
		int[] distances = {17, 6, 19, 7, 5, 3};
		int[] distancesOptimized = new int[distances.length+1];
		for (int i = 1; i < distancesOptimized.length; i++) {
			if (i == 1) { distancesOptimized[i] = distances[i-1];
			} else {
			distancesOptimized[i] = distancesOptimized[i-1] + distances[i-1];
			}
		
		}
		return distancesOptimized[b] - distancesOptimized[a];
	}
}
