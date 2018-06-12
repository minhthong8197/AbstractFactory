package pizza;

import materialFactory.PizzaMaterialFactory;
import materialFactory.materialFamilies.Dough;
import materialFactory.materialFamilies.Meat;
import materialFactory.materialFamilies.Sauce;
import materialFactory.materialFamilies.Veggies;

public abstract class Pizza {
	Dough dough; 	//bột làm bánh
	Meat meat;		//thịt
	Veggies veggies;//rau
	Sauce sauce;	//nước sốt
	String myPizzaType;	//loại pizza cụ thể nào
	PizzaMaterialFactory myFactory;
	
	void prepare() {
		dough = myFactory.createDough();
		meat = myFactory.createMeat();
		veggies = myFactory.createVeggies();
		sauce = myFactory.createSauce();
		myPizzaType = myFactory.getPizzaType();
	}
	
	public abstract void createPizza();
	
	public void showInfo() {
		System.out.println("Maked a " + this.myPizzaType + " with:");
		System.out.println("\t " + dough.getTypeDough());	//in ra loại bột
		System.out.println("\t " + meat.getTypeMeat());		//in ra loại thịt
		System.out.println("\t " + veggies.getTypeVeggies());	//in ra loại rau
		System.out.println("\t " + sauce.getTypeSauce());	//in ra loại nước sốt
		System.out.println("----------------------------------------------------\n");
	}
	
}
