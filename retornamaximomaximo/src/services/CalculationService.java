package services;

import java.util.List;

public class CalculationService {
	//no lugar do T, pode ser Type, qualquer coisa
	//T para generico
	//o extends ta dizendo q � do tipo comparable
	public static <T extends Comparable<T>> T max(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		T max = list.get(0);

		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}

		return max;
	}
}