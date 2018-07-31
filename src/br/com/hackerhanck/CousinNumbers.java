package br.com.hackerhanck;

public class CousinNumbers {

	public static void main(String[] args) {
		int num = 20;
		//System.out.println("Entre 1 e " + num  +" existem estes numeros primos:");
		verifyCousinNumber(num);
	}

	private static void verifyCousinNumber(int num) {
		for (int i = 1; i <= num; i++) {
			int count =0;
			for (int j = 1; j <= num; j++) 
				if (i%j == 0 && i%1 == 0) count++;
			if(count==2) System.out.println(i + " eh primo");
		}
	}

}
