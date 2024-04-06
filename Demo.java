package refactoring_guru.builder.example;

import refactoring_guru.builder.example.builders.CarBuilder;
import refactoring_guru.builder.example.builders.CarManualBuilder;
import refactoring_guru.builder.example.cars.Car;
import refactoring_guru.builder.example.cars.Manual;
import refactoring_guru.builder.example.director.Director;

/**
 * Demo class. Everything comes together here.
 */
// Declaração da classe Demo
public class Demo {

    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto Director
        Director director = new Director();

        // Criação de um objeto CarBuilder
        CarBuilder builder = new CarBuilder();

        // Director utiliza o CarBuilder para construir um carro esportivo
        director.constructSportsCar(builder);

        // Obtém o produto final (um objeto Car) do CarBuilder
        Car car = builder.getResult();

        // Imprime informações sobre o carro construído
        System.out.println("Car built:\n" + car.getCarType());

        // Criação de um objeto CarManualBuilder
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director utiliza o CarManualBuilder para construir um manual para o carro esportivo
        director.constructSportsCar(manualBuilder);

        // Obtém o produto final (um objeto Manual) do CarManualBuilder
        Manual carManual = manualBuilder.getResult();

        // Imprime informações sobre o manual construído
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
