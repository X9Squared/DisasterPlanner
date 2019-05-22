package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

public class Provider implements User {
    private String name;
    private int id;
    private ZipCode location;
    private boolean outofstock;
    private String service;
    private ZipList zips;

    //Constructors
    public Provider() {
        name = "Wal-Mart";
        id = 0000;
        location = new ZipCode(92130);
        outofstock = false;
        service = "Literally ANYTHING";
        zips = new ZipList();
    }

    public Provider(int z, String n, int i, ZipCode loc, int age, boolean s, String serv, String med) {
        name = n;
        id = i;
        location = loc;
        outofstock = s;
        service = req;
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
}
}
