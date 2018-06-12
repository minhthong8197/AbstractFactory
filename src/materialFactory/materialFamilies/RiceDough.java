package materialFactory.materialFamilies;

public class RiceDough extends Dough {

	public RiceDough() {
		// super();
		this.type = "Rice flour \t\t Bột gạo";
	}

	@Override
	public String getTypeDough() {
		return type;
	}
}
