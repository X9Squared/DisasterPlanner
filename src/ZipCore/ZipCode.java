package ZipCore;

public class ZipCode extends ZipList {
    private int latitude;
    private int longitude;
    private int zipcode;

    public ZipCode(int zip) {
        setLatitude(0);
        setLongitude(0);
        setZipcode(zip);
    }

    public ZipCode(int zip, int lat, int lon) {
        setLatitude(lat);
        setLongitude(lon);
        setZipcode(zip);
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
