package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		/*
		 * Para estudo do tipo curinga
		 * 
		 * 
		 * // tipo curinga List<?> myObjs = new ArrayList<Object>(); List<Integer>
		 * muNumber = new ArrayList<Integer>();
		 * 
		 * // é possivel atribuir pq é curinga myObjs = muNumber;
		 * 
		 * Object obj; Integer x = 10; obj = x;
		 */

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		
		List<String> myStrs = Arrays.asList("Maria","Alex","Ana");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);

		}
	}

}
