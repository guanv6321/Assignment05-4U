/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;



/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
        Map map = new Map("images/pics.txt");
        String startLocation = map.getStartLocation();
        String startDirection = map.getStartDirection();
        Controller c = new Controller(gui, map, startLocation, startDirection);
    }
    
}
