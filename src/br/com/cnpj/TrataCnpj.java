package br.com.cnpj;

public class TrataCnpj {
	
	public static void main(String[] args) {
		String s = "71.464.883/0001-39";
		s = s.replace(".", "").replace("/", "").replace("-", "");
		System.out.println(s.toString());
	}

}
