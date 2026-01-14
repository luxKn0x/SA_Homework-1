package builder;

import domain.Car;

public interface CarBuilder {
    CarBuilder setEngine(String engine);
    CarBuilder setTransmission(String transmission);
    CarBuilder addInteriorFeature(String feature);
    CarBuilder addExteriorOption(String option);
    CarBuilder addSafetyFeature(String feature);
    Car build();
}
