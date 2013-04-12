package singhp.pattern.decorator;

public abstract class Beverages {
	public abstract double cost();
	public String description="Unknown";
	
	public String getDescription(){
		return description;
	}
}
