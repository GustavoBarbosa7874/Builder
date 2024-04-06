package refactoring_guru.builder.example.director;

import refactoring_guru.builder.example.builders.Builder;
import refactoring_guru.builder.example.cars.CarType;
import refactoring_guru.builder.example.components.Engine;
import refactoring_guru.builder.example.components.GPSNavigator;
import refactoring_guru.builder.example.components.Transmission;
import refactoring_guru.builder.example.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
// Declaração da classe Director
public class Director {

    // Método para construir um carro esportivo
    public void constructSportsCar(Builder builder) {
        // Define os atributos do carro esportivo utilizando o construtor fornecido pelo Builder
        builder.setCarType(CarType.SPORTS_CAR); // Define o tipo de carro como SPORTS_CAR
        builder.setSeats(2); // Define o número de assentos como 2
        builder.setEngine(new Engine(3.0, 0)); // Cria um novo motor com volume 3.0 e quilometragem inicial 0
        builder.setTransmission(Transmission.SEMI_AUTOMATIC); // Define a transmissão como SEMI_AUTOMATIC
        builder.setTripComputer(new TripComputer()); // Define o computador de viagem como um novo objeto TripComputer
        builder.setGPSNavigator(new GPSNavigator()); // Define o navegador GPS como um novo objeto GPSNavigator
    }

    // Método para construir um carro urbano
    public void constructCityCar(Builder builder) {
        // Define os atributos do carro urbano utilizando o construtor fornecido pelo Builder
        builder.setCarType(CarType.CITY_CAR); // Define o tipo de carro como CITY_CAR
        builder.setSeats(2); // Define o número de assentos como 2
        builder.setEngine(new Engine(1.2, 0)); // Cria um novo motor com volume 1.2 e quilometragem inicial 0
        builder.setTransmission(Transmission.AUTOMATIC); // Define a transmissão como AUTOMATIC
        builder.setTripComputer(new TripComputer()); // Define o computador de viagem como um novo objeto TripComputer
        builder.setGPSNavigator(new GPSNavigator()); // Define o navegador GPS como um novo objeto GPSNavigator
    }

    // Método para construir um SUV
    public void constructSUV(Builder builder) {
        // Define os atributos do SUV utilizando o construtor fornecido pelo Builder
        builder.setCarType(CarType.SUV); // Define o tipo de carro como SUV
        builder.setSeats(4); // Define o número de assentos como 4
        builder.setEngine(new Engine(2.5, 0)); // Cria um novo motor com volume 2.5 e quilometragem inicial 0
        builder.setTransmission(Transmission.MANUAL); // Define a transmissão como MANUAL
        builder.setGPSNavigator(new GPSNavigator()); // Define o navegador GPS como um novo objeto GPSNavigator
    }
}
