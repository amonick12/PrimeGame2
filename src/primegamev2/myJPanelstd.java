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

    JPanel setupPanel, optionsPanel, buttonPanel;
    JSlider difficultySlider;
    JButton startButton, restartButton, button1, button2, button3, button4, 
            button5, button6, button7,
            button8, button9, button10, button11, button12, button13, button14,
            button15, button16, button17, button18, button19, button20,
            button21, button22, button23, button24, button25;
    Timer countdownTimer;
    int secondsLeft, scoreCounter;
    JLabel scoreLabel;
    int buttonPos, numberOfPrimesFor3x3, numberOfPrimesFor4x4, numberOfPrimes5x5;
    
    public myJPanelstd()
    {
            displaySetupPanel();
            //when the startButton is hit, gameSetup() is called
    }
    
    public void displaySetupPanel()
    {
        removeAll();
        setupPanel = new JPanel();
        setupPanel.setLayout(new BorderLayout());        
        startButton = new JButton("Start");
        startButton.setPreferredSize(new Dimension(300, 300));
        startButton.addActionListener(this);
        setupPanel.add(startButton, "Center");
        add(setupPanel);
        revalidate();
        repaint();
    }
    
    public void gameSetup()
    {
        removeAll();
        setLayout(new BorderLayout());
        optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(1, 2));

        initalizeAndPlaceDifficultySlider(optionsPanel);
        initializeAndPlaceRestartButton(optionsPanel);
        initializeAndPlaceScoreLabel(optionsPanel);

        add(optionsPanel, "South");

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        
        initializeAllGameButtons();
        placeButtons4x4(buttonPanel);
        
        add(buttonPanel, "North");
        
        countdownTimer = new Timer(1000, this);
        
        secondsLeft = 5;
        revalidate();
        repaint();
    }

    public void initalizeAndPlaceDifficultySlider(JPanel tpanel)
    {
        difficultySlider = new JSlider(3, 5, 3);
        difficultySlider.setMajorTickSpacing(1);
        difficultySlider.setPaintTicks(true);
        difficultySlider.setPaintLabels(true);
        difficultySlider.setSnapToTicks(true);
        tpanel.add(difficultySlider);
    }
    
    public void initializeAndPlaceRestartButton(JPanel tpanel)
    {
        restartButton = new JButton("restart");
        tpanel.add(restartButton);
    }
    
    public void initializeAndPlaceScoreLabel(JPanel tpanel)
    {
        scoreCounter = 0;
        scoreLabel = new JLabel("     Score is " + scoreCounter);
        tpanel.add(scoreLabel);
    }
    
    public void initializeAllGameButtons()
    {
        button1 = new JButton("button1");
        Border testBorder = new LineBorder(Color.BLACK, 5);
        button1.setBorder(testBorder);
        button2 = new JButton("button2");
        button3 = new JButton("button3"); 
        button4 = new JButton("button4"); 
        button5 = new JButton("button5"); 
        button6 = new JButton("button6"); 
        button7 = new JButton("button7");
        button8 = new JButton("button8"); 
        button9 = new JButton("button9");
        button10 = new JButton("button10"); 
        button11 = new JButton("button11"); 
        button12 = new JButton("button12"); 
        button13 = new JButton("button13"); 
        button14 = new JButton("button14");
        button15 = new JButton("button15"); 
        button16 = new JButton("button16"); 
        button17 = new JButton("button17"); 
        button18 = new JButton("button18"); 
        button19 = new JButton("button19"); 
        button20 = new JButton("button20");
        button21 = new JButton("button21"); 
        button22 = new JButton("button22"); 
        button23 = new JButton("button23"); 
        button24 = new JButton("button24"); 
        button25 = new JButton("button25");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);
        button21.addActionListener(this);
        button22.addActionListener(this);
        button23.addActionListener(this);
        button24.addActionListener(this);
        button25.addActionListener(this);
    }
    
    public void placeButtons3x3(JPanel tpanel)
    {
        tpanel.removeAll();
        tpanel.add(button1);
        tpanel.add(button2);
        tpanel.add(button3);
        tpanel.add(button4);
        tpanel.add(button5);
        tpanel.add(button6);
        tpanel.add(button7);
        tpanel.add(button8);
        tpanel.add(button9);
    }
    
    public void placeButtons4x4(JPanel tpanel)
    {
        tpanel.removeAll();
        tpanel.add(button1);
        tpanel.add(button2);
        tpanel.add(button3);
        tpanel.add(button4);
        tpanel.add(button5);
        tpanel.add(button6);
        tpanel.add(button7);
        tpanel.add(button8);
        tpanel.add(button9);
        tpanel.add(button10);
        tpanel.add(button11);
        tpanel.add(button12);
        tpanel.add(button13);
        tpanel.add(button14);
        tpanel.add(button15);
        tpanel.add(button16);
    }
    
    public void placeButtons5x5(JPanel tpanel)
    {
        tpanel.removeAll();
        tpanel.add(button1);
        tpanel.add(button2);
        tpanel.add(button3);
        tpanel.add(button4);
        tpanel.add(button5);
        tpanel.add(button6);
        tpanel.add(button7);
        tpanel.add(button8);
        tpanel.add(button9);
        tpanel.add(button10);
        tpanel.add(button11);
        tpanel.add(button12);
        tpanel.add(button13);
        tpanel.add(button14);
        tpanel.add(button15);
        tpanel.add(button16);
        tpanel.add(button17);
        tpanel.add(button18);
        tpanel.add(button19);
        tpanel.add(button20);
        tpanel.add(button21);
        tpanel.add(button22);
        tpanel.add(button23);
        tpanel.add(button24);
        tpanel.add(button25);
    }
    
    public void determineSliderValueAndPlaceButtons(JSlider tslider, JPanel tpanel)
    {
        if(tslider.getValue() == 3)
        {
            placeButtons3x3(tpanel);
        }
        
        if(tslider.getValue() == 4)
        {
            placeButtons4x4(tpanel);
        }
        
        if(tslider.getValue() == 5)
        {
           placeButtons5x5(tpanel); 
        }
    }
    
    public void determineNewSelectorPosition(int formerPos, int newPos)
    {
        if(isEdgeCase(formerPos) == true)
        {
            //
        }
    }
    
    public boolean isEdgeCase(int currentPos)
    {
        return false;
    }
    
    //need to determine 

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Object obj = ae.getSource();

        if (obj == countdownTimer)
        {
            if(secondsLeft < 1)
            {
                System.out.println("YOU'RE OUT OF TIME AND FIX THIS PRINTOUT");
            }
            secondsLeft--;
            
            determineSliderValueAndPlaceButtons(difficultySlider, buttonPanel);
        }
        
        if(obj == startButton)
        {
            gameSetup();
        }
        
        if(obj == button1)
        {
            Border emptyBorder = BorderFactory.createEmptyBorder();
            button1.setBorder(emptyBorder);
            //THIS SHIT WORKS
        }

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
