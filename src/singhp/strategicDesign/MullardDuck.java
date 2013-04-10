package singhp.strategicDesign;

public class MullardDuck extends Duck{
	public MullardDuck(){
		flyBehaviorObj=new FlyNoWay();
		quackBehaviorObj=new Quack();
	}
	public static void main(String s[]){
		MullardDuck mullardObj=new MullardDuck();
		mullardObj.performFly();
		mullardObj.performQuack();
	}
	
}
