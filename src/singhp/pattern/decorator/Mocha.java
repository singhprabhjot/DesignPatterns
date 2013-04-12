package singhp.pattern.decorator;

public class Mocha extends CondimentDecorator{
	Beverages beveragesObj;
	public Mocha(Beverages beveragesObj) {
		this.beveragesObj=beveragesObj;
		
	}
	@Override
	public double cost() {	
		return beveragesObj.cost()+.20;
	}

	@Override
	public String getDescription() {
		return beveragesObj.getDescription()+", Mocha";
	}
	
}
