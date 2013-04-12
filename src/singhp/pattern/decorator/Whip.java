package singhp.pattern.decorator;

public class Whip extends CondimentDecorator {
	Beverages beverageObj;
	public Whip(Beverages beverageObj) {
		this.beverageObj=beverageObj;
	}
	
	@Override
	public String getDescription() {
		return beverageObj.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverageObj.cost()+.10;
	}

}
