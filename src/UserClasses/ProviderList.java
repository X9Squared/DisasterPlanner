package UserClasses;
import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;

public class ProviderList {
    private ArrayList<Provider> providers;
    private ZipList zips;
    //Constructors
    public ProviderList() {
        setProviders(new ArrayList<>());
        zips = new ZipList();
        //Automatically reads and sets Zips from CSV whenever instantiated
        zips.setZips();
    }
    //Add provider to list without get reference
    public void add(Provider temp) {
        getProviders().add(temp);
        out.println("added");
    }
    //Remove provider from list without get reference
    public void remove(Provider temp) {
        if (getProviders().contains(temp)) {
            getProviders().remove(temp);
            out.println("removed");
        }
    }
    //Read written dat file and update list accordingly for additional usage.
    public void updateList(String datPath) throws IOException {
        //Reader instantiation
        DataInputStream inStream = new DataInputStream(new FileInputStream(datPath));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        while (reader.ready()) {
            String line = reader.readLine();
            if (line.length() > 0) {
                //Split line of dat file for reading into constructor
                String[] splitData = line.split("_");
                Provider temp = new Provider(splitData[0], Integer.parseInt(splitData[1]),
                        zips.searchLoc(Integer.parseInt(splitData[2])), splitData[3], splitData[4]);
                add(temp);
            }
        }
    }
    //Getters/setters
    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }
    //Search for closest providers from ProviderList - placed into provider for easy list access.
    public String searchClosestProvider(String need, ZipCode zip) {
        double minDistance = Double.MAX_VALUE;
        boolean found = false;
        Provider closestProv = new Provider();
        for (Provider prov : getProviders()) {
            //Check need
            if (prov.getService().equals(need)) {
                found = true;
                ZipCode temp = zips.searchLoc(zip.getZipcode());
                double tempDist = temp.calcDistance(zip);
                //Find closest provider with matching needs
                if (tempDist < minDistance) {
                    minDistance = tempDist;
                    closestProv = prov;
                }
            }
        }
        if (!found) {
            //Prevent error if no providers exist in the area.
            return "There were no Providers in the list that matched your selected need - please try again.";
        } else {
            return closestProv.toString();
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Provider prov : getProviders()) {
            output += prov.toString() + "\n";
        }
        return output;
    }
}
