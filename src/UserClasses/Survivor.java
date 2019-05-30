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
    //Constructors

    public Survivor() {
        name = "Tim";
        setId(0000);
        location = new ZipCode(92130);
        age = 25;
        setSatisfied(false);
        setNeed("Just a hug");
        notes = "Requires hug treatment";
    }

    public Survivor(String n, int i, ZipCode loc, int age, String req, String not) {
        name = n;
        setId(i);
        location = loc;
        this.age = age;
        setNeed(req);
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

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public int getId() {
        return id;
    }

    public boolean isSatisfied() {
        return satisfied;
    }

    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }

    @Override
    public String toString() {
        return name + "_" + age + "_" + id + "_" + location.getZipcode() + "_" +need + "_" +notes;
    }
}
