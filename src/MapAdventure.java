
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class MapAdventure {

    private ArrayList<ScreenAdventure> screens;

    public MapAdventure(String fileName) {
        // initialize the list
        screens = new ArrayList<>();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            // Make screens
            // loop to the end of the file
            while (input.hasNext()) {
                // creating a screen from the scanner
                ScreenAdventure s = new ScreenAdventure(input);
                // added the created screen to the list
                screens.add(s);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    
    public ScreenAdventure getScreen(String direction, String location) {
        // go through each screen
        for (ScreenAdventure scrn : screens) {
            // see if the row and col match
            if (scrn.getCurrentLocation() == direction && scrn.getCurrentDirection() == location) {
                // found the screen
                return scrn;
            }
        }
        // no screen found
        return null;
    }
}
