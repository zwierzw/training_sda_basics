package OOP_1mz_28_do_36;

//Ex33
public class SportCar extends Car implements LoudCar {

    //Ex34
    public SportCar(String producer, String model, String color, Engine engine) {
        super(producer, model, color, 2, engine);
    }

    //Ex35&36
    public SportCar(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber, engine);
    }

    @Override
    public String loudBrumBrumBrum() {
        return "BRRRRRRRRRUM!";
    }

    @Override
    public String toString() {
        return "SportCar" + super.toString();
    }
}
