package UserClasses;

import ZipCore.ZipCode;
import ZipCore.ZipList;

import java.util.ArrayList;

public class ProviderList {
    private ArrayList<Provider> providers;
    private ZipList zips;

    public ProviderList() {
        setProviders(new ArrayList<>());
    }

    public void add(Provider temp) {
        getProviders().add(temp);
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public void searchClosest(String need, ZipCode zip) {
        int minDistance = Integer.MAX_VALUE;
        for (Provider prov : providers) {
            if (prov.getService().equals(need)) {
                ZipCode temp = zips.searchLoc(zip.getZipcode());
            }
        }
    }
}
