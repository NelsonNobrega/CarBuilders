package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder { // A interface Builder cont�m m�todos para configurar diferentes aspectos do produto.
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

//O c�digo segue o padr�o Builder, separando a constru��o de objetos complexos de sua representa��o