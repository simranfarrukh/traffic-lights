# Traffic Lights

A simple traffic light simulator to understand the Observer Design Pattern in Java.

## Class Implementations
#### TrafficLightsObserver:
- Contains a single updateTrafficLights() method that takes LightColor class's object as parameter
- CommercialVehicle and DomesticVehicle implement the updateTrafficLights() method and are considered observers

#### Commercial Vehicle:
- Implements overridden updateTrafficLights() method from the TrafficLightObserver interface

#### Domestic Vehicle:
- Implements overridden updateTrafficLights() method from the TrafficLightObserver interface

#### LightColor:
- Enum class that contains a list of traffic light colors

#### TrafficLight:
- Takes TrafficLightObserver as a list called observers, which is implemented as a new array list
- Takes LightColor object a variable called lightType
- contains addObserver(), removeObservers(), and notifyObservers() method that add, remove, and notify all objects
- The lightChange() method iterates through the LightColor enum class's values, prints out the light type, and uses the notifyObservers() method to update the traffic lights for all observers

## Contributing
For pull requests, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
All rights reserved and exclusive to Simran Farrukh. Do not copy or share this code.
