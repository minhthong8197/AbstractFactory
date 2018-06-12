package materialFactory.materialFamilies;

public class BeefMeat extends Meat{

	public BeefMeat() {
		this.type = "Beef \t\t Thịt bò";
	}

	@Override
	public String getTypeMeat() {
		return type;
	}
}
