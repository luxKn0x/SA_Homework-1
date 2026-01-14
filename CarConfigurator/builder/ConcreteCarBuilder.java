package builder;

import domain.Car;
import validation.CarValidator;
import java.util.ArrayList;
import java.util.List;

public class ConcreteCarBuilder implements CarBuilder {

    private String engine;
    private String transmission;
    private List<String> interior = new ArrayList<>();
    private List<String> exterior = new ArrayList<>();
    private List<String> safety = new ArrayList<>();

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder addInteriorFeature(String feature) {
        interior.add(feature);
        return this;
    }

    public CarBuilder addExteriorOption(String option) {
        exterior.add(option);
        return this;
    }

    public CarBuilder addSafetyFeature(String feature) {
        safety.add(feature);
        return this;
    }

    public Car build() {
        CarValidator.validate(engine, transmission);
        return new Car(engine, transmission, interior, exterior, safety);
    }
}
