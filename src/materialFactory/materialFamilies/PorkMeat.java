package materialFactory.materialFamilies;

public class PorkMeat extends Meat {
	public PorkMeat() {
		this.type = "Pork \t\t\t Thịt lợn";
	}

	@Override
	public String getTypeMeat() {
		return type;
	}
}
