package OOP_1mz_28_do_36;

import lombok.Getter;
import lombok.Setter;

//Ex32
public abstract class Car {
    @Getter
    @Setter
    private String producer, model, color;
    @Getter
    @Setter
    private Integer seatsNumber;
    private Engine engine;        //kompozycja

    //piszemy Setter i Getter do Engine
    public void setEngine (Engine engine1){
        this.engine = engine1;
    }

    public Engine getEngine (){
        return this.engine;
    }

    //tworzę konstruktor ze wszystkimi argumentami

    public Car (String producer, String model, String color, Integer seatsNumber, Engine engine){
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine.toString() +
                '}';
    }
}
