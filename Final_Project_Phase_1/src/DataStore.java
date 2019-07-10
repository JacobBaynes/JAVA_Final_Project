/**
 * Created by Jacob Baynes 05/01/2018
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataStore {

    // static datastore attribute
    private static DataStore singleton = null;

    // private default constructor
    private DataStore() {
    }

    // private section array attribute
    private static CourseSection[] sections = new CourseSection[15];
    private static File sectionFile = Paths.get(".", "resources", "Sections.txt").normalize().toFile();

    public static DataStore getInstance() {
        if (singleton == null) {
            singleton = new DataStore();
            Scanner fs;
            try {
                fs = new Scanner(sectionFile);
                for (int i = 0; i < sections.length; i++) {
                    sections[i] = new CourseSection(fs.next(), fs.next(), fs.next(), fs.next(), fs.next(), fs.next(), fs.next(), fs.next());
                }
            } catch (FileNotFoundException e) {
                System.out.print(e.getMessage());
            }



        }
        return singleton;
    }

    public static CourseSection[] getSections() {
        return sections;
    }
}
