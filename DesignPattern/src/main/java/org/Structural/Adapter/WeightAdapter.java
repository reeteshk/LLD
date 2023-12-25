package org.Structural.Adapter;

public class WeightAdapter implements WeightInKilograms{
    private WeightInPounds weightInPounds;

    public WeightAdapter(WeightInPounds weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public double getWeightInKilograms() {
        return weightInPounds.getWeightInPounds() * 0.45359237;
    }
}
