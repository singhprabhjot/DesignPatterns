package singhp.pattern.decorator;

public class Order {
	public static void main(String s[]){
		Order makeOrderObj=new Order();
		makeOrderObj.prepareOrder();
		
	}

	public void prepareOrder() {
		Beverages beverageObj=new HouseBlend();
		beverageObj=new Whip(beverageObj);
		beverageObj=new MilkWhip(beverageObj);
		System.out.print("Cost of "+beverageObj.getDescription());
		System.out.println(": "+beverageObj.cost());
		
		
	}
}
