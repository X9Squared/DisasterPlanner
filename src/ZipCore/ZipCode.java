package ZipCore;

public class ZipCode extends ZipList {
    int latitude;
    int longitude;
    int zipcode;

    public ZipCode(int lat, int lo, int zip) {
        latitude = lat;
        longitude = lo;
        zipcode = zip;
    }

}
