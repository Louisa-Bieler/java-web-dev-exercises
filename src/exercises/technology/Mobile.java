package exercises.technology;

class Mobile extends exercises.technology.Laptop {

    private boolean lockedSim;
    public Mobile(String os, String chip, String graphicChip, double storageCapacityMB, int batteryLifeMinutes, int chargingTimeMinutes, double displaySizeInCentimeters, double weightInGrams, boolean lockedSim){
        super(os, chip, graphicChip, storageCapacityMB, batteryLifeMinutes, chargingTimeMinutes, displaySizeInCentimeters, weightInGrams);
        this.lockedSim = lockedSim;

    }

    public boolean isLockedSim() {
        return lockedSim;
    }

    public void setLockedSim(boolean lockedSim) {
        this.lockedSim = lockedSim;
    }
}