package director;

import builder.CarBuilder;
import domain.Car;

public class CarDirector {

    public Car buildLuxuryCar(CarBuilder builder) {
        return builder
                .setEngine("V8")
                .setTransmission("Automatic")
                .addInteriorFeature("Leather seats")
                .addInteriorFeature("Premium sound system")
                .addSafetyFeature("ABS")
                .addSafetyFeature("Rear camera")
                .build();
    }
}
