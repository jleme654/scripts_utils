package br.com.hackerhanck;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionMaster {
	// Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
    	 int[] count=new int[a.length-1];
         Arrays.sort(a);
         for(int i=0;i<a.length-1;i++){
         	ArrayList<Integer> arr = new ArrayList<Integer>();
             arr.add(a[i]);
             for(int j=i+1;j<a.length;j++){
                 if(Math.abs(a[i]-a[j])==0||Math.abs(a[i]-a[j])==1){
                     arr.add(a[j]);                    
                 }
                 
             }
             count[i]=arr.size();
         }
         Arrays.sort(count);
         return count[count.length-1];
    }
    public static void main(String[] args) {
		int[] a = {4, 6, 5, 3, 3, 1};
    	//int[] a = {1, 2, 2, 3, 1, 2};
 		System.out.println(pickingNumbers(a));
	}

}
