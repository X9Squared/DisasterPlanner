package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

public class Survivor implements User {
    private String name;
    private int id;
    private ZipCode location;
    private int age;
    private boolean satisfied;
    private String need;
    private String medical;
    private ZipList zips;

    public Survivor() {
        name = "Tim";
        id = 0000;
        location = new ZipCode(92130);
        age = 25;
        satisfied = false;
        need = "Just a hug";
        medical = "Requires hug treatment";
        zips = new ZipList();
    }

    public Survivor(int z, String n, int i, ZipCode loc, int age, boolean s, String req, String med) {
        name = n;
        id = i;
        location = loc;
        this.age = age;
        satisfied = s;
        need = req;
        medical = med;
        zips = new ZipList();
    }


    public ZipCode getLocation(int zip) {
        return location;
    }

    @Override
    public ZipCode setLoc(int zip) {
        return null;
    }

    @Override
    public int getAge() {
        return age;
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
