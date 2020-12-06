package OOP_1mz_28_do_36;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(12.02d,1200, 15.23);
        SportCar sportCar = new SportCar("Opel", "Corsa", "red", 2, engine);

        System.out.println(sportCar.loudBrumBrumBrum());
    }
}
