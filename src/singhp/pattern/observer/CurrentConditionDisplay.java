package singhp.pattern.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	

	WeatherData weatherObj;
	
	//Pass the object of subject in constructor method to work in the same object. 
	public CurrentConditionDisplay(Subject weatherObj){	
		this.weatherObj=(WeatherData) weatherObj; //Casting is needed since weatherObj could have more methods
		weatherObj.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Temperature"+weatherObj.getTemperature());
		System.out.println("Humidity"+weatherObj.getHumidity());
		System.out.println("Pressure"+weatherObj.getPressure());	
	}

	@Override
	public void update() {
		System.out.println("I am in Current Condition showing the current data!");
		display();		
	}
}
