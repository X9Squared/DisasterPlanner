package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SurvivorList {
    private ArrayList<Survivor> survivors;
    private ZipList zips;

    public ArrayList<String> searchClosestSurvivors(String service, ZipCode zip, double threshold) {
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> contingency = new ArrayList<>();
        contingency.add("No survivors found within the specified threshold - please try again");
        boolean found = false;
        for (Survivor surv : survivors) {
            if (surv.getNeed().equals(service)) {
                found = true;
                ZipCode temp = zips.searchLoc(zip.getZipcode());
                double tempDist = temp.calcDistance(zip);
                if (tempDist < threshold) {
                    output.add(surv.toString());
                }
            }
        }
        if (!found) {
            return contingency;
        } else {
            return output;
        }
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
