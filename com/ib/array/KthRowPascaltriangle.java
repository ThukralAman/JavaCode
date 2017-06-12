package com.ib.array;

import java.util.ArrayList;

public class KthRowPascaltriangle {
	public static void main(String args[]) {
		ArrayList<Integer> result = new KthRowPascaltriangle().getRow(5);
		for(int i=0; i<result.size(); i++) {
			System.out.println("val = " + result.get(i));
		}
	}

	public ArrayList<Integer> getRow(int a) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		if (a < 0) {
			ArrayList<Integer> emptyList = new ArrayList<Integer>();
			return emptyList;
		} else {
			if (a == 0) {
				arr1.add(1);
			} else {
				for (int i = 0; i <= a; i++) {
					arr1.add(0);
				}
				for (int row = 1; row <= a; row++) {
					for (int j = row; j >= 0; j--) {
						if (j == 0) {
							arr1.set(j, 1);
						} else if (j == row) {
							arr1.set(j, 1);
						} else {
							int val = arr1.get(j) + arr1.get(j - 1);
							arr1.set(j, val);
						}
					}
				}

			}

		}
		return arr1;
	}
}
