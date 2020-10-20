package com.revature.bean.car;

import com.revature.bean.engine.*;

public class Car {
	
	
	private String make;
	private String color;
	private Engine engine;
	private Engine model;
	
	public Car() {
		
	}
    public  Car(String make,String color,Engine engine, Engine model ) {
		
		this.model=model;
		this.make=make;
		this.color=color;
		this.engine=engine;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getModel() {
		return model;
	}
	public void setModel(Engine model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", color=" + color + ", engine=" + engine + ", model=" + model + "]";
	}
    
    
	

}
