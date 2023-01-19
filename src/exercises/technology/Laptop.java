package exercises.technology;

public class Laptop extends exercises.technology.Computer {

    private int batteryLifeMinutes;

    private int chargingTimeMinutes;
    private double displaySizeInCentimeters;
    private double weightInGrams;

    public Laptop(String os, String chip, String graphicChip, double storageCapacityMB, int batteryLifeMinutes, int chargingTimeMinutes, double displaySizeInCentimeters, double weightInGrams){
        super(os, chip, graphicChip, storageCapacityMB);
        this.batteryLifeMinutes = batteryLifeMinutes;
        this.chargingTimeMinutes = chargingTimeMinutes;
        this.displaySizeInCentimeters = displaySizeInCentimeters;
        this.weightInGrams = weightInGrams;

    }

    public int getBatteryLifeMinutes() {
        return batteryLifeMinutes;
    }

    public void setBatteryLifeMinutes(int batteryLifeMinutes) {
        this.batteryLifeMinutes = batteryLifeMinutes;
    }

    public int getChargingTimeMinutes() {
        return chargingTimeMinutes;
    }

    public void setChargingTimeMinutes(int chargingTimeMinutes) {
        this.chargingTimeMinutes = chargingTimeMinutes;
    }

    public double getDisplaySizeInCentimeters() {
        return displaySizeInCentimeters;
    }

    public void setDisplaySizeInCentimeters(double displaySizeInCentimeters) {
        this.displaySizeInCentimeters = displaySizeInCentimeters;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}