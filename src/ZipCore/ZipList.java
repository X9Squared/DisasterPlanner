package ZipCore;

import java.util.ArrayList;

public class ZipList extends ZipMethods {
    public ZipList() {
        super();
    }

    //Searching algo, simple loop through - could be changed to binary search at a later date.
    public ZipCode searchLoc(int zipcode) {
        double templat = 0;
        double templong = 0;
        for (ZipCode zip : zips) {
            if (zip.getZipcode() == zipcode) {
                templat = zip.getLatitude();
                templong = zip.getLongitude();
            }
        }
        ZipCode output = new ZipCode(zipcode, templat, templong);
        return output;
    }

    @Override
    public ArrayList<ZipCode> getZips() {
        return zips;
    }

    @Override
    public void setZips() {
        zips = readCsv();
    }
}
