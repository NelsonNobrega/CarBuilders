package components;


public class Engine { //A classe Engine modela um motor, com atributos como volume e quilometragem, e m�todos para ligar, desligar, verificar se est� ligado, e percorrer uma certa dist�ncia.
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) { //M�todos como go() verificam o estado do motor antes de executar a a��o
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}