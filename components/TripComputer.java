package refactoring_guru.builder.example.components;

import refactoring_guru.builder.example.cars.Car;

/**
 * Just another feature of a car.
 */
// Declaração da classe TripComputer
public class TripComputer {

    // Declaração de uma variável de instância para armazenar o carro associado ao trip computer
    private Car car;

    // Método para definir o carro associado ao trip computer
    public void setCar(Car car) {
        this.car = car; // Define o carro associado ao trip computer
    }

    // Método para exibir o nível de combustível do carro
    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel()); // Exibe o nível de combustível do carro
    }

    // Método para exibir o status do carro (ligado/desligado)
    public void showStatus() {
        // Verifica se o motor do carro está ligado e exibe o status correspondente
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started"); // Exibe uma mensagem indicando que o carro está ligado
        } else {
            System.out.println("Car isn't started"); // Exibe uma mensagem indicando que o carro está desligado
        }
    }
}
