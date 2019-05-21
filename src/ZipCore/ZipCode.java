package ZipCore;

import java.util.ArrayList;

public class ZipCode {
    private double latitude;
    private double longitude;
    private int zipcode;

    public ZipCode(int zip) {
        setLatitude(0);
        setLongitude(0);
        setZipcode(zip);
    }

    public ZipCode(int zip, double lat, double lon) {
        setLatitude(lat);
        setLongitude(lon);
        setZipcode(zip);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return zipcode + " , " + latitude + " , " + longitude;
    }
}
