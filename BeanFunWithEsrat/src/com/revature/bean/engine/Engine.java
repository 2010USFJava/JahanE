package com.revature.bean.engine;
import com.revature.bean.car.*;

public class Engine {
    private String name;
    private  String model;
	
	public Engine() {
		
	}
	public Engine(String name, String model) {
		
		this.name=name;
		this.model=model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
