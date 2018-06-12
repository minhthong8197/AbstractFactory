package pizza;

import materialFactory.TraditionalPizzaMaterialFactory;

public class TraditionalPizza extends Pizza {

	@Override
	public
	void createPizza() {
		myFactory = new TraditionalPizzaMaterialFactory();
		this.prepare();
	}

}
