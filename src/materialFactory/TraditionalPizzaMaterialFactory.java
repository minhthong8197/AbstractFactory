package materialFactory;

import materialFactory.materialFamilies.BeefMeat;
import materialFactory.materialFamilies.Dough;
import materialFactory.materialFamilies.FlourDough;
import materialFactory.materialFamilies.Meat;
import materialFactory.materialFamilies.SaladVeggies;
import materialFactory.materialFamilies.Sauce;
import materialFactory.materialFamilies.TomatoSauce;
import materialFactory.materialFamilies.Veggies;

public class TraditionalPizzaMaterialFactory extends PizzaMaterialFactory {

	@Override
	public Dough createDough() {
		return new FlourDough();
	}

	@Override
	public Meat createMeat() {
		return new BeefMeat();
	}

	@Override
	public Veggies createVeggies() {
		return new SaladVeggies();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

	@Override
	public String getPizzaType() {
		return this.myPizzaType;
	}

	public TraditionalPizzaMaterialFactory() {
		this.myPizzaType = "Modern pizza";
	}

}
