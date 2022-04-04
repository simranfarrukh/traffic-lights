package com.farrukh.simran.observerpattern.trafficmonitoring;

public class Runner {
	
	public static void main(String[] args) {
		
		//creates a TrafficLight object called light
		TrafficLight light = new TrafficLight();
		
		//addObserver method adds CommercialVehicle object to TrafficLightObserver array list
		light.addObserver(new CommercialVehicle());
		//addObserver method adds DomesticVehicle object to TrafficLightObserver array list
		light.addObserver(new DomesticVehicle());
		
		//LightChange object changes status of LightColor enum 
		light.lightChange();
		light.lightChange();
	}
}
