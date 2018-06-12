package materialFactory;

import materialFactory.materialFamilies.Dough;
import materialFactory.materialFamilies.Meat;
import materialFactory.materialFamilies.Sauce;
import materialFactory.materialFamilies.Veggies;

public abstract class PizzaMaterialFactory {
	String myPizzaType;
	
	public abstract Dough createDough();
	public abstract Meat createMeat();
	public abstract Veggies createVeggies();
	public abstract Sauce createSauce();
	public abstract String getPizzaType();
}
