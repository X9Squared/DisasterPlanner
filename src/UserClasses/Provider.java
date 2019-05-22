package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

public class Provider implements User {
    private String name;
    private int id;
    private ZipCode location;
    private boolean outofstock;
    private String service;

    //Constructors
    public Provider() {
        name = "Wal-Mart";
        id = 0000;
        location = new ZipCode(92130);
        setOutofstock(false);
        setService("Literally ANYTHING");
        zips = new ZipList();
    }

    public Provider(int z, String n, int i, ZipCode loc, int age, boolean s, String serv, String med) {
        name = n;
        id = i;
        location = loc;
        setOutofstock(s);
        setService(serv);
        zips = new ZipList();
    }

    //Set and get methods (integrated ZipCore at a later date)
    public ZipCode getLocation(int zip) {
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

    public boolean isOutofstock() {
        return outofstock;
    }

    public void setOutofstock(boolean outofstock) {
        this.outofstock = outofstock;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
