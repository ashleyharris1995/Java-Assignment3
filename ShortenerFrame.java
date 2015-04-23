/*
 * Name: Ashley Harris
 * Student number: 1413555
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShortenerFrame extends JFrame {
    // This class is only a starting point. You may wish to add members and 
    // fields to complete the implementation of this class as per the
    // question on the assignment sheet.
    
    // Constants
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 260;
    
    // Instance variables -- GUI components
    private JPanel panel;
    private JLabel instructionLabel;
    private JTextArea inputArea;
    private JTextArea outputArea;
    private JButton shortenButton;
    private JTextField field;
    
    private String text;
    Shortener a = new Shortener();
    private DocumentListener listener;
    
    // Constructor
    public ShortenerFrame() {
        super();
        
        //
        // Set up the frame
        setSize( FRAME_WIDTH, FRAME_HEIGHT );
        
        //
        // Set up the panel and layout manager
        panel = new JPanel();
        GridLayout grid = new GridLayout( 0, 1 );  // a one-column layout
        panel.setLayout( grid );
        
        add( panel );  // add panel to the JFrame

        //
        // Set up and add components
        instructionLabel = new JLabel( "Enter text in the field below and click 'Shorten'" );
        panel.add( instructionLabel );
        
        inputArea = new JTextArea();
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        panel.add( inputArea );
        
        shortenButton = new JButton( "Shorten" );
        panel.add( shortenButton );
        shortenButton.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent e ) {
                text = a.shortenMessage(inputArea.getText());  // inputArea.getText() is null because referring to new inputArea in line 60. Needs to change to what user has typed.
            }
        });
        
        outputArea = new JTextArea(text);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        panel.add( outputArea );
    }
}