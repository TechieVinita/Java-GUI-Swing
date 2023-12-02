
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Main{
    public static void main(String[] args){
        // JFrame - a GUI window to add components to

        /* 

        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here"); // sets the title of frame

        // the below method is used because when we press close(x) on the JFrame, it makes it invisible but does not close it.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the application

        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // hides the application - executes by default 
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 

        frame.setResizable(false); // prevents the frame from being resized
        frame.setSize(420, 420); // sets the x-dimension and y-dimension of frame
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("logo.jpg"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame


        // frame.getContentPane().setBackground(Color.green); // change the color of the background
        // frame.getContentPane().setBackground(new Color(123, 50, 250)); // rgb color
        frame.getContentPane().setBackground(new Color(0x123456)); // hex color

        */

        // MyFrame frame = new MyFrame();
        new MyFrame();
    }
}