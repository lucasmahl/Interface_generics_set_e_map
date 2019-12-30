package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2019");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();

		ComboDevice c = new ComboDevice("2019");
		c.processDoc("My dissertation");
		c.print("My dissertation");

		System.out.println("Scan result: " + c.scan());
	}

}