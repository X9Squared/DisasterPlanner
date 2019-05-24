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
    private String notes;
    private ZipList zips;
    //Constructors
    public Survivor() {
        name = "Tim";
        id = 0000;
        location = new ZipCode(92130);
        age = 25;
        satisfied = false;
        need = "Just a hug";
        notes = "Requires hug treatment";
        zips = new ZipList();
    }

    public Survivor(int z, String n, int i, ZipCode loc, int age, boolean s, String req, String not) {
        name = n;
        id = i;
        location = loc;
        this.age = age;
        satisfied = s;
        need = req;
        notes = not;
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
