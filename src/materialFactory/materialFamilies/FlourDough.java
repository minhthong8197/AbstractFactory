package materialFactory.materialFamilies;

public class FlourDough extends Dough {
	
	public FlourDough() {
		//super();
		this.type = "Flour \t\t Bột mì";
	}

	@Override
	public String getTypeDough() {
		return type;
	}
}
