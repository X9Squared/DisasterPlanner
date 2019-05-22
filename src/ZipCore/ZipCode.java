package ZipCore;

public class ZipCode {
    private double latitude;
    private double longitude;
    private int zipcode;
    //Constructors
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

    public double calcDistance (ZipCode target) {
        final int R = 6371; //Radius of Earth
        double lat1 = Math.toRadians(this.getLatitude());
        double lat2 = Math.toRadians(target.getLatitude());
        double deltalong = Math.toRadians(target.getLongitude() - this.getLongitude());
        double deltalat = Math.toRadians(target.getLatitude() - this.getLatitude());
        /* Uses Haversine formula for spherical distance between zipcodes:
            a = sin²(Δφ/2) + cos φ1 ⋅ cos φ2 ⋅ sin²(Δλ/2)
            c = 2 ⋅ atan2( √a, √(1−a) )
            d = R ⋅ c */
        double a = Math.sin(deltalat / 2) * Math.sin(deltalat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(deltalong / 2) * Math.sin(deltalong / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c; // convert to meters
        return distance;
    }

    //Equals method override
    @Override
    public boolean equals(Object obj) {
        return (((ZipCode) obj).getZipcode() == this.zipcode && ((ZipCode) obj).getLongitude() == this.longitude && ((ZipCode) obj).getLatitude() == this.latitude);
    }
    //Setters and getters
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
