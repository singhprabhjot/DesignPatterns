package singhp.singleton;

public class SingletonEarlyInitialization {
	private static SingletonEarlyInitialization myInstance=new SingletonEarlyInitialization();
	
	private SingletonEarlyInitialization() {}
	
	public SingletonEarlyInitialization getInstance() {
		return myInstance;
	}
	
}
