package exercises.technology;
import java.util.ArrayList;
public class Computer {

    private String os;
    private double storageCapacityMB;
    private String chip;

    private String graphicChip;



    public Computer(String os, String chip, String graphicChip, double storageCapacityMB){
        this.os = os;
        this.chip = chip;
        this.graphicChip = graphicChip;
        this.storageCapacityMB = storageCapacityMB;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public double getStorageCapacityMB() {
        return storageCapacityMB;
    }

    public void setStorageCapacityMB(double storageCapacityMB) {
        this.storageCapacityMB = storageCapacityMB;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getGraphicChip() {
        return graphicChip;
    }

    public void setGraphicChip(String graphicChip) {
        this.graphicChip = graphicChip;
    }
}