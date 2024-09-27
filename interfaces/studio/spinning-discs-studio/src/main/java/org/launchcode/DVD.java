package org.launchcode;

import java.util.ArrayList;

public class DVD extends BaseDisc{
    public DVD(ArrayList<String> contentOfDisk) {
        super(contentOfDisk, 4.7);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 560 to 1600 rpm.");
    }

    @Override
    public void reportInfoFromDisc() {
        for (String filename : getContentOfDisk()) {
            System.out.println(filename);
        }
    }

    @Override
    public void reWriteData(String filename) {
        getContentOfDisk().add(filename);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
