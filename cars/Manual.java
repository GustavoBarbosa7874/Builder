package refactoring_guru.builder.example.cars;

import refactoring_guru.builder.example.components.Engine;
import refactoring_guru.builder.example.components.GPSNavigator;
import refactoring_guru.builder.example.components.Transmission;
import refactoring_guru.builder.example.components.TripComputer;

/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
// Declaração da classe Manual
public class Manual {

    // Declaração de variáveis de instância finais para armazenar os atributos do manual do carro
    private final CarType carType; // Tipo de carro
    private final int seats; // Número de assentos
    private final Engine engine; // Motor
    private final Transmission transmission; // Transmissão
    private final TripComputer tripComputer; // Computador de viagem
    private final GPSNavigator gpsNavigator; // Navegador GPS

    // Construtor da classe Manual, que recebe todos os atributos necessários para criar um manual
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        // Inicializa os atributos do manual com os valores fornecidos
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    // Método para gerar uma representação em forma de texto do manual
    public String print() {
        // Inicializa uma string vazia para armazenar as informações do manual
        String info = "";
        // Adiciona informações sobre o tipo de carro e o número de assentos
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        // Adiciona informações sobre o motor, incluindo volume e quilometragem
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        // Adiciona informações sobre a transmissão
        info += "Transmission: " + transmission + "\n";
        // Verifica se o computador de viagem está disponível e adiciona essa informação
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        // Verifica se o navegador GPS está disponível e adiciona essa informação
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        // Retorna a string com todas as informações do manual
        return info;
    }
}
