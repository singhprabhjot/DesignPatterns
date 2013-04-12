package singhp.pattern.decorator;

public class HouseBlend extends Beverages{

	public HouseBlend() {
		description="House Blend!";
	}

	@Override
	public double cost() {	
		return 1.2;
	}
	
}
