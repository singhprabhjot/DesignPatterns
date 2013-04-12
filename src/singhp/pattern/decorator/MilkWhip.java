package singhp.pattern.decorator;

public class MilkWhip extends Whip {
	Beverages beverageObj;
	public MilkWhip(Beverages beverageObj) {
		super(beverageObj);
		this.beverageObj=beverageObj;
	}
	
	@Override
	public String getDescription() {
		return beverageObj.getDescription()+", MilkWhip";
	}

	@Override
	public double cost() {
		return beverageObj.cost()+.25;
	}

}
