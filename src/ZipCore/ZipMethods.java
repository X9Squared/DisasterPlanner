package ZipCore;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public abstract class ZipMethods {
    public ArrayList<ZipCode> zips;

    public ZipMethods() {
        zips = new ArrayList<>();
    }

    public static ArrayList<ZipCode> readCsv() {
        ArrayList<ZipCode> output = new ArrayList<>();
        Scanner crawler;
        try {
            crawler = new Scanner(new File("C:\\Users\\wangj1701\\Documents\\DisasterPlanner\\src\\Assets\\uszips.csv"));
        } catch (java.io.FileNotFoundException e) {
            out.println("Cannot find zip code database, check paths:" + e);
            return null;
        }
        while (crawler.hasNextLine()) {
            String line = crawler.nextLine();
            String[] splitLine = line.split(",");
            ZipCode tempZip = new ZipCode(Integer.parseInt(splitLine[0]), Double.parseDouble(splitLine[1]), Double.parseDouble(splitLine[2]));
            output.add(tempZip);
        }
        return output;
    }


    public ArrayList<ZipCode> getZips() {
        return zips;
    }

    public void setZips() {
        this.zips = readCsv();
    }
}
