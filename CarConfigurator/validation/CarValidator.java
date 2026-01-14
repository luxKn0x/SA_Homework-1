package validation;

public class CarValidator {

    public static void validate(String engine, String transmission) {
        if (engine == null || engine.isEmpty()) {
            throw new IllegalStateException("Engine is required");
        }
        if (transmission == null || transmission.isEmpty()) {
            throw new IllegalStateException("Transmission is required");
        }
    }
}
