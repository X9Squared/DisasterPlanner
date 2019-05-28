package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

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

}
