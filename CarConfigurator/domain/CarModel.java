package domain;

import java.util.Set;

public class CarModel {

    private final String name;
    private final Set<String> allowedEngines;
    private final Set<String> allowedTransmissions;
    private final Set<String> allowedInteriorFeatures;
    private final Set<String> allowedExteriorOptions;
    private final Set<String> allowedSafetyFeatures;

    public CarModel(String name,
                    Set<String> allowedEngines,
                    Set<String> allowedTransmissions,
                    Set<String> allowedInteriorFeatures,
                    Set<String> allowedExteriorOptions,
                    Set<String> allowedSafetyFeatures) {

        this.name = name;
        this.allowedEngines = allowedEngines;
        this.allowedTransmissions = allowedTransmissions;
        this.allowedInteriorFeatures = allowedInteriorFeatures;
        this.allowedExteriorOptions = allowedExteriorOptions;
        this.allowedSafetyFeatures = allowedSafetyFeatures;
    }

    public String getName() {
        return name;
    }

    public boolean isEngineAllowed(String engine) {
        return allowedEngines.contains(engine);
    }

    public boolean isTransmissionAllowed(String transmission) {
        return allowedTransmissions.contains(transmission);
    }

    public boolean isInteriorFeatureAllowed(String feature) {
        return allowedInteriorFeatures.contains(feature);
    }

    public boolean isExteriorOptionAllowed(String option) {
        return allowedExteriorOptions.contains(option);
    }

    public boolean isSafetyFeatureAllowed(String feature) {
        return allowedSafetyFeatures.contains(feature);
    }
}
