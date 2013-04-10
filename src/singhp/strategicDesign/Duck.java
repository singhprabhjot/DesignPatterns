package singhp.strategicDesign;

public abstract class Duck {
	FlyBehavior flyBehaviorObj;
	QuackBehavior quackBehaviorObj;
	public void performFly(){
		flyBehaviorObj.fly();
	} 
	public void performQuack(){
		quackBehaviorObj.quack();
	}
}
