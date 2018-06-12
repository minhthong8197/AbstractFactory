package pizza;

import materialFactory.ModernPizzaMaterialFactory;

public class ModernPizza extends Pizza{

	@Override
	public
	void createPizza() {
		myFactory = new ModernPizzaMaterialFactory();
		this.prepare();
	}

}
