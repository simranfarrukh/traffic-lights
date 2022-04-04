package com.farrukh.simran.observerpattern.trafficmonitoring;

public interface TrafficLightObserver {
	
	//updates current traffic light color
	//takes currentLightColor as parameter from LightColor enum class
	void updateTrafficLights(LightColor currentLightColor);

}
