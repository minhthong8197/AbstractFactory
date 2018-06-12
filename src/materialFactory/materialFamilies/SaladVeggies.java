package materialFactory.materialFamilies;

public class SaladVeggies extends Veggies{

	public SaladVeggies() {
		//super();
		this.type = "Salad \t\t Rau xà lách";
	}

	@Override
	public String getTypeVeggies() {
		return type;
	}

}
