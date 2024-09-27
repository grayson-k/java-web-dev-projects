package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc{
    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of ");
    }

    @Override
    public void reportInfoFromDisc() {

    }

    @Override
    public void reWriteData(String filename) {
        getContentOfDisk().add(filename);

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(ArrayList<String> contentOfDisk) {
        super(contentOfDisk, .700);
    }
}
