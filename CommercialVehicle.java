package com.farrukh.simran.observerpattern.trafficmonitoring;

public class CommercialVehicle implements TrafficLightObserver {

	//implementing overridden method from TrafficLightObserver interface class
	//returns the currentLightColor from the LightColor enum class	
	@Override
	public void updateTrafficLights(LightColor currentLightColor) {
		if(currentLightColor.equals(LightColor.RED)) {
			System.out.println("All Commercial Vehicles STOP!");
		}
	}
}
