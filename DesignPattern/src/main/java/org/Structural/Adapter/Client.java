package org.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        WeightInPounds weightInPounds = new WeightInPounds(150);
        WeightInKilograms weightInKilograms = new WeightAdapter(weightInPounds);
        System.out.println(weightInKilograms.getWeightInKilograms());
    }
}
