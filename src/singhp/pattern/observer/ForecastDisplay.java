package singhp.pattern.observer;

public class ForecastDisplay implements DisplayElement,Observer{
	
	WeatherData weatherObj;
	
	public ForecastDisplay(Subject weatherObj){
		this.weatherObj=(WeatherData) weatherObj;
		weatherObj.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("In Forecast display!");
		display();	
	}

	@Override
	public void display() {
		System.out.println("Humidity is: "+weatherObj.getHumidity());	
	}

}
