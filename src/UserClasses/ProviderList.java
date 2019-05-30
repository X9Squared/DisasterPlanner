package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;

public class ProviderList {
    private ArrayList<Provider> providers;
    private ZipList zips;

    public ProviderList() {
        setProviders(new ArrayList<>());
        zips = new ZipList();
        zips.setZips();
    }

    public void add(Provider temp) {
        getProviders().add(temp);
        out.println("added");
    }

    public void remove(Provider temp) {
        if (providers.contains(temp)) {
            providers.remove(temp);
            out.println("removed");
        }
    }

    public void updateList(String datPath) throws IOException {
        DataInputStream inStream = new DataInputStream(new FileInputStream(datPath));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        int tick = 0;
        while (reader.ready()) {
            if (tick % 2 == 1) {
                String line = reader.readLine();
                String[] splitData = line.split("_");
                Provider temp = new Provider(splitData[0], Integer.parseInt(splitData[1]),
                        zips.searchLoc(Integer.parseInt(splitData[2])), splitData[3], splitData[4]);
                add(temp);
            }
            ++tick;
        }
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public String searchClosestProvider(String need, ZipCode zip) {
        double minDistance = Double.MAX_VALUE;
        boolean found = false;
        Provider closestProv = new Provider();
        for (Provider prov : providers) {
            if (prov.getService().equals(need)) {
                found = true;
                ZipCode temp = zips.searchLoc(zip.getZipcode());
                double tempDist = temp.calcDistance(zip);
                if (tempDist < minDistance) {
                    minDistance = tempDist;
                    closestProv = prov;
                }
            }
        }
        if (!found) {
            return "There were no Providers in the list that matched your selected need - please try again.";
        } else {
            return closestProv.toString();
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Provider prov : providers) {
            output += prov.toString() + "\n";
        }
        return output;
    }
}
