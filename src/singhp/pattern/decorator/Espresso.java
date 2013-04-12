package singhp.pattern.decorator;

public class Espresso extends Beverages{

	@Override
	public double cost() {
		return 1.1;
	}
	
	public String getDescription(){
		 description=super.description+"Espresso";
		 return description;
	}

}
