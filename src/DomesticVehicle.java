package com.farrukh.simran.observerpattern.trafficmonitoring;

public class DomesticVehicle implements TrafficLightObserver {

	//implementing overridden method from TrafficLightObserver interface class
	//returns the currentLightColor from the LightColor enum class
	@Override
	public void updateTrafficLights(LightColor currentLightColor) {
		if(currentLightColor.equals(LightColor.YELLOW)) {
			System.out.println("All Domestic vehicles STOP!\n" + "Only Commercial vehicles may GO!\n");
		}
		else if(currentLightColor.equals(LightColor.RED)) {
			System.out.println("All Domestic Vehicles STOP!\n");
		}
	}
}
