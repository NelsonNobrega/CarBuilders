package components;


public class GPSNavigator { //A classe GPSNavigator representa um componente de um carro, com funcionalidade de navega��o por GPS
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) { // A classe permite que a rota seja definida manualmente, fornecendo flexibilidade ao usu�rio para especificar a rota desejada
        this.route = manualRoute;
    }

    public String getRoute() { 
        return route;
    }
}