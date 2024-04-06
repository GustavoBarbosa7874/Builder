package refactoring_guru.builder.example.builders;

import refactoring_guru.builder.example.cars.Manual;
import refactoring_guru.builder.example.cars.CarType;
import refactoring_guru.builder.example.components.Engine;
import refactoring_guru.builder.example.components.GPSNavigator;
import refactoring_guru.builder.example.components.Transmission;
import refactoring_guru.builder.example.components.TripComputer;



/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
// Declaração da classe CarManualBuilder que implementa a interface Builder
public class CarManualBuilder implements Builder {

    // Declaração de variáveis de instância para armazenar os atributos do manual do carro em construção
    private CarType type; // Tipo de carro
    private int seats; // Número de assentos
    private Engine engine; // Motor
    private Transmission transmission; // Transmissão
    private TripComputer tripComputer; // Computador de viagem
    private GPSNavigator gpsNavigator; // Navegador GPS

    // Método para definir o tipo de carro
    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    // Método para definir o número de assentos
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    // Método para definir o motor
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Método para definir a transmissão
    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    // Método para definir o computador de viagem
    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    // Método para definir o navegador GPS
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    // Método para obter o resultado final da construção do manual do carro
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
