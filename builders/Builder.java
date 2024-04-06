package refactoring_guru.builder.example.builders;

import refactoring_guru.builder.example.cars.CarType;
import refactoring_guru.builder.example.components.Engine;
import refactoring_guru.builder.example.components.GPSNavigator;
import refactoring_guru.builder.example.components.Transmission;
import refactoring_guru.builder.example.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    // Método para definir o tipo de carro
    void setCarType(CarType type);

    // Método para definir o número de assentos do carro
    void setSeats(int seats);

    // Método para definir o motor do carro
    void setEngine(Engine engine);

    // Método para definir a transmissão do carro
    void setTransmission(Transmission transmission);

    // Método para definir o computador de viagem do carro
    void setTripComputer(TripComputer tripComputer);

    // Método para definir o navegador GPS do carro
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
