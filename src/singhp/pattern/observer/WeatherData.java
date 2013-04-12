package singhp.pattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	public ArrayList<Observer> observersList;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observersList=new ArrayList<Observer>();
		temperature=0F;
		humidity=0F;
		pressure=0F;
	}
	
	@Override
	public void registerObserver(Observer observerObj) {
		observersList.add(observerObj);
	}

	@Override
	public void removeObserver(Observer observerObj) {
		int i=observersList.indexOf(observerObj);
		if ( i>=0){
			observersList.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observerObj : observersList) {
			observerObj.update();
		}
		
	}
	
	//getters to allow observer to only fetch the values that are required. 
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}
	
	//Can use setters to give more flexibility
	public void setValues (float temp, float humidity, float pressure) {
		this.humidity=humidity;
		this.temperature=temp;
		this.pressure=pressure;
		notifyObservers();		
	}

}
