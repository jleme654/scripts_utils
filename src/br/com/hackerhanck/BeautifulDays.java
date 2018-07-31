package br.com.hackerhanck;

public class BeautifulDays {
	
	// Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0, result=0;
        for(int u = i; u <= j; u++){
            String m = String.valueOf(u), n="";
            for(int x=m.length()-1; x>=0 ; x--){
                n = n.concat(String.valueOf(m.charAt(x)));
            }
            int a = Integer.parseInt(m), b=Integer.parseInt(n); 
            result = ( a-b );
            System.out.println(m + " " + n + " = " + result + " / "+ k);
            if(Math.abs(result) % k == 0) 
                ++count;
        }
        return count;
    }

	public static void main(String[] args) {
		int i=20;
		int j=23;
		int k=6;
		System.out.println(beautifulDays(i, j, k));
	}
}
