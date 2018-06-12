package main;

import pizza.ModernPizza;
import pizza.Pizza;
import pizza.TraditionalPizza;

public class Main {

	public static void main(String[] args) {
		System.out.println("From Abstract Factory Pattern:\n");
		
		Pizza a = new TraditionalPizza();	
		a.createPizza();
		a.showInfo();
		
		Pizza b = new ModernPizza();
		b.createPizza();
		b.showInfo();
	}

}
