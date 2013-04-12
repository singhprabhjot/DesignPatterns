package singhp.pattern.observer;

import java.util.Scanner;

public class TestValueChange {
	
	WeatherData weatherObj;
	public static void main(String s[]) {
		TestValueChange testObserverPattern=new TestValueChange();
		testObserverPattern.testObserverPattern();
	}
	public void testObserverPattern() {
		weatherObj=new WeatherData();
		CurrentConditionDisplay ccdObj=new CurrentConditionDisplay(weatherObj);
		ForecastDisplay fdObj=new ForecastDisplay(weatherObj);	
		getUserInput();
	}
	public void getUserInput(){
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Do you want to change the value? Y/N");
		String answer=scanObj.nextLine();
		if(answer.equals("Y")){
			weatherObj.setValues(10, 20, 30);		
		}
		else{
			System.out.println("Not changing values!");
		}
	}
	
}
