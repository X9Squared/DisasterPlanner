package UserClasses;
import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;

public class SurvivorList {
    private ArrayList<Survivor> survivors;
    private ZipList zips;
    //Constructors
    public SurvivorList() {
        setSurvivors(new ArrayList<>());
        zips = new ZipList();
        zips.setZips();
    }
    //Similar updateList method to ProviderList (see for full commenting)
    public void updateList(String datPath) throws IOException {
        DataInputStream inStream = new DataInputStream(new FileInputStream(datPath));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        while (reader.ready()) {
                String line = reader.readLine();
                if (line.length() > 0) {
                    String[] splitData = line.split("_");
                    Survivor temp = new Survivor(splitData[0], Integer.parseInt(splitData[2]),
                            zips.searchLoc(Integer.parseInt(splitData[3])), Integer.parseInt(splitData[1]), splitData[4], splitData[5]);
                    add(temp);
                }
        }
    }
    //Similar to searchProviders method, but instead of checking for minimum, checks for all under threshold
    public ArrayList<String> searchClosestSurvivors(String service, ZipCode zip, double threshold) {
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> contingency = new ArrayList<>();
        contingency.add("No survivors found within the specified threshold - please try again");
        ZipCode provLoc = zips.searchLoc(zip.getZipcode());
        boolean found = false;
        for (Survivor surv : getSurvivors()) {
            if (surv.getNeed().equals(service)) {
                found = true;
                double tempDist = provLoc.calcDistance(surv.getLocation());
                out.println(tempDist);
                out.println(surv.getLocation());
                //Check threshold
                if (tempDist < threshold) {
                    //Ouput ArrayList of strings due to the multi-objective output
                    output.add(surv.toString());
                }
            }
        }
        if (!found) {
            //Return an ArrayList with no Strings inside, only error message.
            return contingency;
        } else {
            return output;
        }
    }

    //Getters/setters
    public ArrayList<Survivor> getSurvivors() {
        return survivors;
    }

    public void setSurvivors(ArrayList<Survivor> survivors) {
        this.survivors = survivors;
    }
    //Add/remove methods (same as ProviderList)
    public void add(Survivor surv) {
        getSurvivors().add(surv);
        out.println("added");
    }

    public void remove(Survivor surv) {
        if (getSurvivors().contains(surv)) {
            getSurvivors().remove(surv);
            out.println("removed");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Survivor surv  : getSurvivors()) {
            output += surv.toString() + "\n";
        }
        return output;
    }
}
