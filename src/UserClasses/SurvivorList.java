package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SurvivorList {
    private ArrayList<Survivor> survivors;
    private ZipList zips;

    public ArrayList<String> searchClosestSurvivors(String service, ZipCode zip, double threshhold) {
        ArrayList<String> output = new ArrayList<>();
        boolean found = false;
        Provider closestProv = new Provider();
        for (Survivor surv : survivors) {
            if (surv.().equals(service)) {
                found = true;
                ZipCode temp = zips.searchLoc(zip.getZipcode());
                double tempDist = temp.calcDistance(zip);
                if (tempDist < minDistance) {
                    minDistance = tempDist;
                    closestProv = prov;
                }
            }
        }
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
