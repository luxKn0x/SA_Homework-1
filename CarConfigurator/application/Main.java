package application;

import builder.ConcreteCarBuilder;
import builder.CarBuilder;
import domain.Car;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ConcreteCarBuilder();

        Car car = builder
                .setEngine("V6")
                .setTransmission("Manual")
                .addInteriorFeature("GPS")
                .addSafetyFeature("Airbags")
                .build();

        System.out.println("Car successfully configured");
    }
}
