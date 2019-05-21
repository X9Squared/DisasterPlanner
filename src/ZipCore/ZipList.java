package ZipCore;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public abstract class ZipList {
    public ArrayList<ZipCode> zips;

    public static ArrayList<ZipCode> readCsv() {
        ArrayList<ZipCode> output = new ArrayList<>();
        try {
            Scanner crawler = new Scanner(new File("Assets/uszips.csv"));
        } catch (java.io.FileNotFoundException e) {
            out.println("Cannot find zipcode database, check paths:" + e);
        }

    }

    public int searchLat() {

    }

    public int searchLong() {

    }
}
