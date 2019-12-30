package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();

			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				String name = fields[0];
				Double salary = Double.parseDouble(fields[1]);

				list.add(new Employee(name, salary));
				employeeCsv = br.readLine();
			}

			// ordenar colecao
			Collections.sort(list);
			
			for (Employee e : list) {
				System.out.println(e.getName() + ", " + e.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
