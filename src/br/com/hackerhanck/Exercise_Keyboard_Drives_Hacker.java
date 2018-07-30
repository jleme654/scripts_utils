package br.com.hackerhanck;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_Keyboard_Drives_Hacker {

	/*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(Integer[] keyboards, Integer[] pendrives, Integer b) {
        Arrays.sort(keyboards, Collections.reverseOrder());// Descending order
        Arrays.sort(pendrives);// Ascending order

        int max = -1;
        for (int i = 0, j = 0; i < keyboards.length; i++) {
            for (; j < pendrives.length; j++) {
                if (keyboards[i] + pendrives[j] > b)
                    break; // This prevents j from incrementing
                if (keyboards[i] + pendrives[j] > max)
                    max = keyboards[i] + pendrives[j];
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

   /* public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        Integer b = Integer.parseInt(bnm[0]);

        Integer n = Integer.parseInt(bnm[1]);

        Integer m = Integer.parseInt(bnm[2]);

        Integer[] keyboards = new Integer[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        Integer[] drives = new Integer[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }*/

	public static void main(String[] args) {
		Integer[] keyboards = { 4 };// {3,1};
		Integer[] drives = { 5 };// {5,2,8};
		int b = 5;// 10;
		System.out.println(getMoneySpent(keyboards, drives, b));
	}
}
