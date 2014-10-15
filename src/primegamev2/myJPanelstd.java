package primegamev2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class myJPanelstd extends JPanel implements ActionListener, KeyListener
{
    JPanel startButtonPanel;
    JButton startButton;
    Timer countdownTimer;
    int secondsLeft, scoreCounter;
    //BoardPanel myBoardPanel = new BoardPanel();
    //MenuPanel myMenuPanel = new MenuPanel();
    //ScorePanel myScorePanel = new ScorePanel();

    public void myJPanelstd()
    {
        displayStartButtonPanel();
        //when the startButton is hit, gameSetup() is called
    }

    public void gameSetup()
    {
        removeAll();
        setLayout(new BorderLayout());

        //add(myBoardPanel.myJPanel, "North");
        //add(myMenuPanel.myJPanel, "South");
        countdownTimer = new Timer(1000, this);

        secondsLeft = 5;
        revalidate();
        repaint();
    }

    public void displayStartButtonPanel()
    {
        removeAll();
        startButtonPanel = new JPanel();
        startButtonPanel.setLayout(new BorderLayout());
        startButton = new JButton("Start");
        //startButton.setPreferredSize(new Dimension(300, 300));
        startButton.addActionListener(this);
        //startButtonPanel.add(startButton, "Center");
        startButtonPanel.add(startButton);
        add(startButtonPanel);
        //revalidate();
        //repaint();
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Object obj = ae.getSource();

        /*
        if (obj == countdownTimer)
        {
            if (secondsLeft < 1)
            {
                System.out.println("YOU'RE OUT OF TIME AND FIX THIS PRINTOUT");
            }
            secondsLeft--;

            myMenuPanel.determineSliderValueAndPlaceButtons();
        }

        if (obj == startButton)
        {
            //myBoardPanel.gameSetup();
        }

        if (obj == myMenuPanel.restartButton)
        {
            //myBoardPanel.gameSetup(); 
        }

        
        if (obj == myBoardPanel.button1)
        {
            Border emptyBorder = BorderFactory.createEmptyBorder();
            myBoardPanel.button1.setBorder(emptyBorder);
            //THIS SHIT WORKS
        }
       */

        validate();
        repaint();

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        //e.getKeyChar()  
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        //e.getKeyChar()
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        //e.getKeyChar()
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //for(int i = 0; i < arrayCounter; i++)
        //{

        //   validate();
        //   repaint();
        //}
    }
}
