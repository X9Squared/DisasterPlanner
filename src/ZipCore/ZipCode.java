package ZipCore;

public class ZipCode extends ZipList {
    int latitude;
    int longitude;
    int zipcode;

    public ZipCode(int zip) {
        latitude = 0;
        longitude = 0;
        zipcode = zip;
    }

    public ZipCode(int zip, int lat, int lon) {
        latitude = lat;
        longitude = lon;
        zipcode = zip;
    }

}
