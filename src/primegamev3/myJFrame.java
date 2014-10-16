package primegamev3;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class myJFrame extends JFrame implements KeyListener
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
        getContentPane().setFocusable(true);
        getContentPane().addKeyListener(this);
//------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 900);
        setVisible(true);
        

    }

    @Override
    public void keyTyped(KeyEvent ke)
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        //System.out.println("keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        //System.out.println("keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        //System.out.println("keyPressed");
    }
}
