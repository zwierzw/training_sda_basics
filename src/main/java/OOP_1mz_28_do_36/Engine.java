package OOP_1mz_28_do_36;

import lombok.Getter;
import lombok.Setter;

// Ex28
public class Engine {
    private Double capacity;
    @Getter
    @Setter
    private Integer horsePower;
    @Getter
    @Setter
    private Double fuelConsumption;

    //Ex29
    public Engine (Double capacity, Integer horsePower, Double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    //Ex30&31
    public void setCapacity (Double capacity) {
        this.capacity = capacity;
    }

    public Double getCapacity () {
        return this.capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", horsePower=" + horsePower +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
