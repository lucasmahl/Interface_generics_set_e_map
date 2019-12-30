package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
		//vai dar false, pois ocupam lugares diferentes na memoria
		System.out.println(c1 == c2);

		System.out.println("/*********************************/");
		
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		//vai dar true pq s�o literais
		System.out.println(s1 == s2);

		
		System.out.println("/*********************************/");
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		System.out.println(s3 == s4);
	}

}
