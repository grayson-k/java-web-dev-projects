package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc{
    private double storageCapacity;
    private ArrayList<String> contentOfDisk;

    public BaseDisc(ArrayList<String> contentOfDisk, double storageCapacity) {
        this.contentOfDisk = contentOfDisk;
        this.storageCapacity = storageCapacity;
    }

    public ArrayList<String> getContentOfDisk() {
        return contentOfDisk;
    }

    public void setContentOfDisk(ArrayList<String> contentOfDisk) {
        this.contentOfDisk = contentOfDisk;
    }

    public void writeDataTo(String newFile) {
        contentOfDisk.add(newFile);
    }
}
