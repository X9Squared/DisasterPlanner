package ZipCore;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class ZipList {
    private ArrayList<ZipCode> zips;

    public ZipList() {
        zips = new ArrayList<>();
    }

    public static ArrayList<ZipCode> readCsv() {
        ArrayList<ZipCode> output = new ArrayList<>();
        Scanner crawler;
        try {
            crawler = new Scanner(new File("Assets/uszips.csv"));
        } catch (java.io.FileNotFoundException e) {
            out.println("Cannot find zip code database, check paths:" + e);
            return null;
        }
        while (crawler.hasNextLine()) {
            String line = crawler.nextLine();
            String[] splitLine = line.split(",");
            int[] corrSplit = new int[splitLine.length];
            for (int i = 0; i < splitLine.length; i++) {
                corrSplit[i] = Integer.parseInt(splitLine[i]);
            }
            ZipCode tempZip = new ZipCode(corrSplit[0],corrSplit[1],corrSplit[2]);
            output.add(tempZip);
        }
        return output;
    }

    public ZipCode searchLoc(int zipcode) {
        int templat = 0;
        int templong = 0;
        for (ZipCode zip : zips) {
            if (zip.getZipcode() == zipcode) {
                templat = zip.getLatitude();
                templong = zip.getLongitude();
            }
        }
        ZipCode output = new ZipCode(zipcode, templat, templong);
        return output;
    }

    public ArrayList<ZipCode> getZips() {
        return zips;
    }

    public void setZips() {
        this.zips = readCsv();
    }
}
