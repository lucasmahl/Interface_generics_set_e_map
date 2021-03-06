package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		//treemap, neste caso, ordena pela chave
		Map<String, String> cookies = new TreeMap<String, String>(); 

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "999999999");
		
		cookies.remove("email");
		
		//ir� sobrescrever
		cookies.put("phone", "988888888");
		
		System.out.println("Cont�m fone? "+cookies.containsKey("phone"));
		System.out.println("N�mero de telefone: "+ cookies.get("phone"));
		System.out.println("Email: "+ cookies.get("email"));				
		
		System.out.println("All cookies: ");
		
		//keyset retorna um set com as chaves do map
		for (String k : cookies.keySet()) {
			System.out.println(k+": "+cookies.get(k));
		}
	}

}
