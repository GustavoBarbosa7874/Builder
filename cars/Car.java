package refactoring_guru.builder.example.cars;

import refactoring_guru.builder.example.components.Engine;
import refactoring_guru.builder.example.components.GPSNavigator;
import refactoring_guru.builder.example.components.Transmission;
import refactoring_guru.builder.example.components.TripComputer;

/**
 * Car is a product class.
 */
// Declaração da classe Car
public class Car {

    // Declaração de variáveis de instância finais para armazenar os atributos do carro
    private final CarType carType; // Tipo de carro
    private final int seats; // Número de assentos
    private final Engine engine; // Motor
    private final Transmission transmission; // Transmissão
    private final TripComputer tripComputer; // Computador de viagem
    private final GPSNavigator gpsNavigator; // Navegador GPS
    private double fuel = 0; // Nível de combustível inicializado como 0

    // Construtor da classe Car, que recebe todos os atributos necessários para criar um carro
    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        // Inicializa os atributos do carro com os valores fornecidos
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;

        // Verifica se há um tripComputer não nulo e define este carro como seu proprietário
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }

        // Inicializa o navegador GPS do carro
        this.gpsNavigator = gpsNavigator;
    }

    // Método getter para obter o tipo de carro
    public CarType getCarType() {
        return carType;
    }

    // Método getter para obter o nível de combustível
    public double getFuel() {
        return fuel;
    }

    // Método setter para definir o nível de combustível
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    // Método getter para obter o número de assentos
    public int getSeats() {
        return seats;
    }

    // Método getter para obter o motor
    public Engine getEngine() {
        return engine;
    }

    // Método getter para obter a transmissão
    public Transmission getTransmission() {
        return transmission;
    }

    // Método getter para obter o computador de viagem
    public TripComputer getTripComputer() {
        return tripComputer;
    }

    // Método getter para obter o navegador GPS
    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
