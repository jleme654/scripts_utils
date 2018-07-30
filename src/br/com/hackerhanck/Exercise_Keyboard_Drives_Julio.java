package br.com.hackerhanck;

public class Exercise_Keyboard_Drives_Julio {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int[] arr = new int[keyboards.length];
		for (int i = 0; i < keyboards.length; i++) {
			int num = keyboards[i];
			for (int j = 0; j < drives.length; j++) {
				int sum = num + drives[j];
				if (sum < b)
					arr[i] = sum;
			}
		}
		int major = arr[0];
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] > major)
				major = arr[k];
		}
		if(major == 0) return -1;
		return major;
	}

	public static void main(String[] args) {
		int[] keyboards = {4};//{3,1};
		int[] drives = {5};//{5,2,8};
		int b = 5;//10;
		System.out.println(getMoneySpent(keyboards, drives, b));
	}
}
