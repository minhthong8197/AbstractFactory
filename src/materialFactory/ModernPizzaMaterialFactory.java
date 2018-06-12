package materialFactory;

import materialFactory.materialFamilies.Dough;
import materialFactory.materialFamilies.MayonnaiseSauce;
import materialFactory.materialFamilies.Meat;
import materialFactory.materialFamilies.PorkMeat;
import materialFactory.materialFamilies.RiceDough;
import materialFactory.materialFamilies.Sauce;
import materialFactory.materialFamilies.SeaJellyVeggies;
import materialFactory.materialFamilies.Veggies;

public class ModernPizzaMaterialFactory extends PizzaMaterialFactory {

	@Override
	public Dough createDough() {
		return new RiceDough();
	}

	@Override
	public Meat createMeat() {
		return new PorkMeat();
	}

	@Override
	public Veggies createVeggies() {
		return new SeaJellyVeggies();
	}

	@Override
	public Sauce createSauce() {
		return new MayonnaiseSauce();
	}

	@Override
	public String getPizzaType() {
		return this.myPizzaType;
	}

	public ModernPizzaMaterialFactory() {
		this.myPizzaType = "Modern pizza";
	}

}
