import UserClasses.Provider;
import UserClasses.ProviderList;
import UserClasses.Survivor;
import UserClasses.SurvivorList;
import ZipCore.ZipList;
import ZipCore.ZipMethods;
import ZipCore.ZipCode;

import java.util.Scanner;

import static java.lang.System.out;

public class tester {
    public static void main(String[] args) {
        ZipList zippos = new ZipList();
        SurvivorList survlist = new SurvivorList();
        ProviderList provlist = new ProviderList();
        zippos.setZips();
        Scanner input = new Scanner(System.in);
        Survivor surv1 = new Survivor("Ash", 0001, zippos.searchLoc(92130), 17, "Medical", "N/A");
        Survivor surv2 = new Survivor("Jager", 0002, zippos.searchLoc(38870), 16, "Food", "N/A");
        Survivor surv3 = new Survivor("Blitz", 0003, zippos.searchLoc(28026), 18, "Water", "N/A");
        Provider prov1 = new Provider("GUBISOFT", 0000, zippos.searchLoc(76020), "Food", "N/A");
        survlist.add(surv1);
        survlist.add(surv2);
        survlist.add(surv3);
        provlist.add(prov1);
        out.println(provlist.searchClosestProvider(surv1.getNeed(), surv1.getLocation()));
        out.println(provlist.searchClosestProvider(surv3.getNeed(),surv3.getLocation()));
        out.println(survlist.searchClosestSurvivors("Food", prov1.getLocation(), 1500));
    }
}
