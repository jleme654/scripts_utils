package br.com.hackerhanck;

public class TaumAndBDay {
	
	static long taumBday(int b, int w, int bc, int wc, int z) {
		//long x = bc, y=wc;
//		x = x>y? ((x-y>z)? y+z : x) : x;
//        y = y>x? ((y-x>z)? x+z : y) : y;
//        return (b*bc) + (w*wc);
        
//        long priceB = Math.min(x, y + z); // conversion price
//        long priceW = Math.min(x, y + z); // conversion price
		int total = 0, result = 0;
		if ((wc > z) && (wc > bc))
			total = (b * bc) + ((bc + z) * w);
		else 
			total = (b * bc) + (w * wc);
	    result=total;
	    return result;
        
       // return (b * priceB) + (w * priceW);
//        System.out.println(B * priceB + W * priceW);
    }
	
	public static void main(String[] args) {
		/**
		 * b = black
		 * w = white
		 * bc = black cost
		 * wc = whit cost
		 * 
		 */
		int b = 3, w = 3, bc=1, wc=9, z=2;
		System.out.println(taumBday(b, w, bc, wc, z));
	}

}
