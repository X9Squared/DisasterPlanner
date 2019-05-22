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
    //Constructors
    public Survivor() {
        name = "Tim";
        id = 0000;
        location = new ZipCode(92130);
        age = 25;
        setSatisfied(false);
        setNeed("Just a hug");
        medical = "Requires hug treatment";
        zips = new ZipList();
    }

    public Survivor(int z, String n, int i, ZipCode loc, int age, boolean s, String req, String med) {
        name = n;
        id = i;
        location = loc;
        this.age = age;
        setSatisfied(s);
        setNeed(req);
        medical = med;
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

    public boolean isSatisfied() {
        return satisfied;
    }

    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }
}
