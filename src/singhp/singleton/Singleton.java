package singhp.singleton;


//This class does lazy initialization and takes into account the synchronization of threads

/*
 *  Essentially, volatile is used to indicate that a variable's value will be modified by different threads.
 *  Declaring a volatile Java variable means:
 *  The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
 *  Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
 *  
 *  For more on volatile keyword use the following link http://www.javamex.com/tutorials/synchronization_volatile.shtml
 *  
 *  Remember
 *  1. A primitive variable may be declared volatile (whereas you can't synchronize on a primitive with synchronized);
 *  2. An access to a volatile variable never has the potential to block: we're only ever doing a simple read or write, so unlike a synchronized block we will never hold on to any lock;
 */

public class Singleton {
	private volatile static Singleton myInstance;
	private Singleton(){
		myInstance=null;
	}
	
	public static Singleton getInstance(){
		if(myInstance==null){
			//synchronizing the class to make sure only one thread is running at a time
			synchronized (Singleton.class) {
				if(myInstance==null){
					myInstance=new Singleton();
				}
			}
		}
		return myInstance;
	}
	
}
