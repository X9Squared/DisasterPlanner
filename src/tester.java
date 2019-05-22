import ZipCore.ZipList;
import ZipCore.ZipMethods;
import ZipCore.ZipCode;

import static java.lang.System.out;

public class tester {
    public static void main(String[] args) {
        ZipList zippos = new ZipList();
        zippos.setZips();
        for (int i = 0; i < 6; i++) {
            out.println(zippos.getZips().get(i));
        }
        ZipCode me = zippos.searchLoc(92130);
        out.println(me);
        ZipCode you = zippos.searchLoc(92014);
        out.println(you);
        out.println(me.calcDistance(you));
    }
}
