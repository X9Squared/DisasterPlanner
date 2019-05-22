package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SurvivorList {
    private ArrayList<Survivor> survivors;
    private ZipList zips;

    public ArrayList<String> searchClosetSurvivors(String need, ZipCode zip) {
        ArrayList<String> output = new ArrayList<>();
        return output;
    }

    public ArrayList<Survivor> getSurvivors() {
        return survivors;
    }

    public void setSurvivors(ArrayList<Survivor> survivors) {
        this.survivors = survivors;
    }

    public ZipList getZips() {
        return zips;
    }

    public void setZips(ZipList zips) {
        this.zips = zips;
    }
}
