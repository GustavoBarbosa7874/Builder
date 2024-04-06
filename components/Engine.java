package refactoring_guru.builder.example.components;


/**
 * Just another feature of a car.
 */
// Declaração da classe Engine
public class Engine {

    // Declaração de variáveis de instância finais para armazenar os atributos do motor
    private final double volume; // Volume do motor
    private double mileage; // Quilometragem do motor
    private boolean started; // Indica se o motor está ligado ou desligado

    // Construtor da classe Engine, que recebe o volume e a quilometragem inicial do motor
    public Engine(double volume, double mileage) {
        // Inicializa os atributos do motor com os valores fornecidos
        this.volume = volume;
        this.mileage = mileage;
    }

    // Método para ligar o motor
    public void on() {
        started = true; // Define o status do motor como ligado
    }

    // Método para desligar o motor
    public void off() {
        started = false; // Define o status do motor como desligado
    }

    // Método para verificar se o motor está ligado
    public boolean isStarted() {
        return started; // Retorna o status do motor
    }

    // Método para movimentar o motor por uma certa distância
    public void go(double mileage) {
        if (started) { // Verifica se o motor está ligado
            this.mileage += mileage; // Incrementa a quilometragem do motor
        } else {
            System.err.println("Cannot go(), you must start engine first!"); // Exibe uma mensagem de erro se o motor não estiver ligado
        }
    }

    // Método getter para obter o volume do motor
    public double getVolume() {
        return volume; // Retorna o volume do motor
    }

    // Método getter para obter a quilometragem do motor
    public double getMileage() {
        return mileage; // Retorna a quilometragem do motor
    }
}
