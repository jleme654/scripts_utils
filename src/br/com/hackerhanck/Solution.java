package br.com.hackerhanck;

public class Solution {

	// Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
    	int count = 0;
        for(int i=0; i<a.length; i++){
            int num = a[i];
            for(int j= (a.length - 1); j >= 0; j--){
                int num2 = a[j];
                int result = Math.abs(num - num2);
                System.out.println(num + " " + num2 + " = " +result);
                if( result <= 1 )
                    count++;
            }
            break;
        }            
        return count;
    }
    public static void main(String[] args) {
		int[] a = {4, 6, 5, 3, 3, 1};
    	//int[] a = {1, 2, 2, 3, 1, 2};
 		System.out.println(pickingNumbers(a));
	}
}
