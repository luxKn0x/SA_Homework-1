package domain;

import java.util.List;

public class Car {
    private final String engine;
    private final String transmission;
    private final List<String> interiorFeatures;
    private final List<String> exteriorOptions;
    private final List<String> safetyFeatures;

    public Car(String engine, String transmission,
               List<String> interiorFeatures,
               List<String> exteriorOptions,
               List<String> safetyFeatures) {
        this.engine = engine;
        this.transmission = transmission;
        this.interiorFeatures = interiorFeatures;
        this.exteriorOptions = exteriorOptions;
        this.safetyFeatures = safetyFeatures;
    }
}
