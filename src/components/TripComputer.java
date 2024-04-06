package components;

import cars.Car;

public class TripComputer { //A classe TripComputer representa um componente do carro, responsável por exibir informações como o nível de combustível e o status do motor.

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() { //Os métodos showFuelLevel() e showStatus() permitem exibir o nível de combustível e o status do motor, respectivamente, melhorando a usabilidade do computador de viagem.
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
