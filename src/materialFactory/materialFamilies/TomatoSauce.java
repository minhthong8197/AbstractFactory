package materialFactory.materialFamilies;

public class TomatoSauce extends Sauce {

	public TomatoSauce() {
		//super();
		this.type = "Tomato sauce \t Sốt cà chua";
	}

	@Override
	public String getTypeSauce() {
		return type;
	}

}
