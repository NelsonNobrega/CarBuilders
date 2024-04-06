

import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director(); //Cria um objeto Director para coordenar o processo de construção.


        CarBuilder builder = new CarBuilder(); //Constrói um carro esportivo utilizando o CarBuilder.
        director.constructSportsCar(builder);

        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();  //Constrói um manual para o carro esportivo utilizando o CarManualBuilder.Constrói um manual para o carro esportivo utilizando o CarManualBuilder.

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
