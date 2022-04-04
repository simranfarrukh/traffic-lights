package com.farrukh.simran.observerpattern.trafficmonitoring;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
	
	private LightColor lightType; //enum variable from LightColor class
	private final List<TrafficLightObserver> observers; //list of TrafficLightObserver class
	
	//constructor takes no variables
	//initializes observers as an ArrayList, currentLightColor as GREEN enum variable
	public TrafficLight() {
		super();
		observers = new ArrayList<>();
		lightType = LightColor.GREEN;
		System.out.println("The light is currently GREEN." + "\nAll vehicles GO.\n");
	}
	
	
	//adds an observer to observers ArrayList
	public void addObserver(TrafficLightObserver observer) {
		observers.add(observer);
	}
	//removes an observer to observers ArrayList
	public void removeObserver(TrafficLightObserver observer) {
		observers.remove(observer);
	}
	//notifies all observers in the ArrayList about the LightColor status
	private void notifyObservers() {
		observers.forEach(observer->observer.updateTrafficLights(lightType)); 
	}
	
	
	//notifies the observers of a light change
	public void lightChange() {
		LightColor[] enumValues = LightColor.values();
		lightType = enumValues[(lightType.ordinal() + 1)]; //ordinal is the initial position of enum in the LightColor class
		System.out.println("The light has changed to " + lightType);
		notifyObservers();
	}
}
