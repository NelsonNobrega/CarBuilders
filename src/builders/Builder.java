package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder { // A interface Builder contém métodos para configurar diferentes aspectos do produto.
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

//O código segue o padrão Builder, separando a construção de objetos complexos de sua representação