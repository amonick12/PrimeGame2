package primegamev2;

import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{

    myJPanelstd mjp;

    public myJFrame()
    {
        super("My First Frame");
        
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
//------------------------------------------------------
// Create components
        mjp = new myJPanelstd();
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mjp, "Center");
//------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        

    }
}
