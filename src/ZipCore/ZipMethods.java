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

    //Reads uszips.csv into an ArrayList (should be called every time the program starts)
    public static ArrayList<ZipCode> readCsv() {
        ArrayList<ZipCode> output = new ArrayList<>();
        Scanner crawler;
        try {
            crawler = new Scanner(new File("C:\\Users\\wangj1701\\Documents\\DisasterPlanner\\src\\Assets\\uszips.csv"));
        } catch (java.io.FileNotFoundException e) {
            //Handles file not found exception to prevent errors
            out.println("Cannot find zip code database, check paths: " + e);
            return null;
        }
        while (crawler.hasNextLine()) {
            //Uses scanner to read the csv
            String line = crawler.nextLine();
            String[] splitLine = line.split(",");
            ZipCode tempZip = new ZipCode(Integer.parseInt(splitLine[0]), Double.parseDouble(splitLine[1]), Double.parseDouble(splitLine[2]));
            output.add(tempZip);
        }
        return output;
    }

    //ZipList inheritance setup
    public abstract ArrayList<ZipCode> getZips();

    public abstract void setZips();

    public abstract ZipCode searchLoc(int zipcode);
}
