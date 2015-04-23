/*
 * Name: Ashley Harris
 * Student number: 1413555
 */

import javax.swing.JFrame;

public class ShortenerGUIApp {
    public static void main( String[] args ) {
        JFrame frame = new ShortenerFrame();
        frame.setTitle("Shortener Application");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}