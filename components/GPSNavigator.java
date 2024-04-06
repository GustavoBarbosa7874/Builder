package refactoring_guru.builder.example.components;

/**
 * Just another feature of a car.
 */
// Declaração da classe GPSNavigator
public class GPSNavigator {

    // Declaração de uma variável de instância para armazenar a rota
    private String route;

    // Construtor padrão da classe GPSNavigator, define uma rota padrão
    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    // Construtor da classe GPSNavigator que permite especificar uma rota manualmente
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute; // Define a rota com base na rota fornecida
    }

    // Método getter para obter a rota atual
    public String getRoute() {
        return route; // Retorna a rota atual
    }
}
