package br.com.hackerhanck;

public class StrangeAdvertising {
	
	static int viralAdvertising(int num) {
		int people = 5;
        int sum = 0;
        
        for(int i = 0; i < num; i++){
            people = (int) Math.floor(people/2);
            sum += people;
            people *= 3;
        }
        return sum;
    }

	public static void main(String[] args) {
		System.out.println(viralAdvertising(5));
	}

}
