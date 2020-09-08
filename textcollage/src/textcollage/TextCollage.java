package textcollage;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JFrame;

/**

* This main program simply shows a window that contains

* a DrawTextPanel and the menu bar for that panel.

*/

public class TextCollage

{

//Define the main method

public static void main(String[] args)

{

//intialize a frame and set the title of the frame

JFrame frame = new JFrame("Text Collage");

//Create object for the DrawTextPanel

DrawTextPanel panel = new DrawTextPanel();

//add panel to the frame

frame.setContentPane( panel );

//set the menu bar for the frame

frame.setJMenuBar(panel.getMenuBar());

//set resizable to false

frame.setResizable(false);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

frame.setLocation( (screenSize.width - frame.getWidth())/2,

(screenSize.height - frame.getHeight())/2 );

frame.setVisible(true);

}

}