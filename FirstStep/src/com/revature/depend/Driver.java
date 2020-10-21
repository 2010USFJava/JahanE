package com.revature.depend;

public class Driver {
	
	public static void main(String [] args) {
		Car car= new Car(1234, "4runner", "Toyoter","blue",new Engine());
		String engineName;
		engineName=car.engine.name;
		System.out.println(engineName);
		Engine myEngine=new Engine("Hemi Deluxe");
	    Car car1= new Car(5629,"sunfire","google","pink",myEngine);
	    String engineName1= car1.engine.name;
	    System.out.println(engineName1);
	}

}
