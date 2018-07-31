package br.com.hackerhanck;

public class BeautifulDaysMaster {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int num, count = 0, gn;
		int quo, newNum = 0, x = 0;
		for (x = i; x <= j; x++) {
			num = x;
			newNum = 0;
			// For reversing no
			while (num != 0) {
				quo = num % 10;
				newNum = 10 * newNum + quo;
				num = num / 10;
			}
			gn = Math.abs(x - newNum);
			if (gn % k == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int i = 20;
		int j = 23;
		int k = 6;
		System.out.println(beautifulDays(i, j, k));
	}
}
