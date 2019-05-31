package UserClasses;

import ZipCore.ZipCode;

public class Provider implements User {
    private String name;
    private int id;
    private ZipCode location;
    private String service;
    private String notes;

    //Constructors
    public Provider() {
        name = "Wal-Mart";
        id = 0000;
        location = new ZipCode(92130);
        setService("Literally ANYTHING");
    }

    public Provider(String n, int i, ZipCode loc, String serv, String not) {
        name = n;
        id = i;
        location = loc;
        setService(serv);
        notes = not;
    }

    //Set and get methods (integrated ZipCore at a later date)
    public ZipCode getLocation() {
        return location;
    }

    @Override
    public ZipCode setLoc(int zip) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setId(int newId) {
        this.id = newId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return name + "_" + id + "_" + location.getZipcode() + "_" + service + "_" + notes + "_";
    }
}
