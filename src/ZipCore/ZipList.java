package ZipCore;

public class ZipList extends ZipMethods{
    public ZipList() {
        super();
    }

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
}
