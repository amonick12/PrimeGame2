package primegamev3;

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
    JLabel scoreLabel;
    int currentPos, maxNumberOfButtons, dimensionNumber, secondsLeft, 
            scoreCounter;
    Border emptyBorder = new LineBorder(Color.BLACK, 1);
    Border selectorBorder = new LineBorder(Color.BLACK, 5);
    int numberOfPrimesFor3x3 = 3;
    int numberOfPrimesFor4x4 = 5;
    int numberOfPrimesFor5x5 = 7;
    int[] buttonValuesArray = new int[25];
    int highestValueForAButton = 20;
    boolean repeatedValuesAllowedInButtonValuesArray = false;

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
        maxNumberOfButtons = 25;
        scoreCounter = 0;
        addKeyListener(this);
        //set focus is handled by paint
        removeAll();
        setLayout(new BorderLayout());
        optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(1, 2));

        initalizeAndPlaceDifficultySlider(optionsPanel);
        initializeAndPlaceRestartButton(optionsPanel);
        initializeAndPlaceScoreLabel(optionsPanel);
        add(optionsPanel, "South");
        buttonPanel = new JPanel();

        initializeAllGameButtons();
        placeButtons3x3(buttonPanel);
        currentPos = 1;
        putSelectorOnButton(getButtonFromCurrentPos(currentPos));

        add(buttonPanel, "North");

        countdownTimer = new Timer(1000, this);

        secondsLeft = 5;
        revalidate();
        repaint();
    }
    
    public int determineNumberOfPrimesBasedOnDimensionNumber()
    {
        if(dimensionNumber == 3)
        {
            return numberOfPrimesFor3x3;
        }
        
        if(dimensionNumber == 4)
        {
            return numberOfPrimesFor4x4;
        }
        
        if(dimensionNumber == 5)
        {
            return numberOfPrimesFor5x5;
        }
        
        else
        {
            System.out.println("dimensionNumber is out of bounds for determining number of primes");
            return -1;
        }
    }
    
    public int getNumberOfPrimesAlreadyInButtonValuesArray(int[] tIntArray)
    {
        int tempInt = 0;
        
        for(int i = 0; i < tIntArray.length; i++)
        {
            if(isIntPrime(tIntArray[i]))
            {
                tempInt++;
            }
        }
        
        return tempInt;
    }
    
    public void setButtonValuesArray(int[] tIntArray, int numberOfPrimes)
    {
        int tempInt = (int)Math.random()*highestValueForAButton;
        while(tempInt == 0 || tempInt < highestValueForAButton)
        {
            tempInt = (int)Math.random()*highestValueForAButton;
        }
            
        for(int i = 0; i < tIntArray.length; i++)
        {
            
            tIntArray[i] = tempInt;
        }
    }
    
    public boolean doesValueAlreadyExistInArray(int tint, int[] valueArray)
    {
        boolean tempBoolean = false;
        
        for(int i = 0; i < valueArray.length; i++)
        {
            if(tint == valueArray[i])
            {
                tempBoolean = true;
                return tempBoolean;
            }
        }
        
        return tempBoolean;
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
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
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
        dimensionNumber = 3;
        tpanel.setLayout(new GridLayout(3, 3));
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
        dimensionNumber = 4;
        tpanel.setLayout(new GridLayout(4, 4));
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
        dimensionNumber = 5;
        tpanel.setLayout(new GridLayout(5, 5));
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
        if (tslider.getValue() == 3)
        {
            placeButtons3x3(tpanel);
        }

        if (tslider.getValue() == 4)
        {
            placeButtons4x4(tpanel);
        }

        if (tslider.getValue() == 5)
        {
            placeButtons5x5(tpanel);
        }
    }

    public int translateKeyCodeToDirection(int tkeyCode)
    {
        return tkeyCode - 37;
    }

    public boolean isIntPrime(int tint)
    {
        boolean prime = true;
        int limit = (int) Math.sqrt(tint);

        for (int i = 2; i <= limit; i++)
        {
            if (tint % i == 0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
    
    public int getIntFromString(String tstring)
    {
        return Integer.decode(tstring);
    }
    
    public String getStringFromButton(JButton tButton)
    {
        return tButton.getText();
    }
    
    public boolean isButtonPrime(int tcurrentPos)
    {
        return isIntPrime(getIntFromString(getStringFromButton(getButtonFromCurrentPos(tcurrentPos))));
    }

    public JButton getButtonFromCurrentPos(int tcurrentPos)
    {
        if (tcurrentPos == 1)
        {
            return (button1);
        }
        if (tcurrentPos == 2)
        {
            return (button2);
        }
        if (tcurrentPos == 3)
        {
            return (button3);
        }
        if (tcurrentPos == 4)
        {
            return (button4);
        }
        if (tcurrentPos == 5)
        {
            return (button5);
        }
        if (tcurrentPos == 6)
        {
            return (button6);
        }
        if (tcurrentPos == 7)
        {
            return (button7);
        }
        if (tcurrentPos == 8)
        {
            return (button8);
        }
        if (tcurrentPos == 9)
        {
            return (button9);
        }
        if (tcurrentPos == 10)
        {
            return (button10);
        }
        if (tcurrentPos == 11)
        {
            return (button11);
        }
        if (tcurrentPos == 12)
        {
            return (button12);
        }
        if (tcurrentPos == 13)
        {
            return (button13);
        }
        if (tcurrentPos == 14)
        {
            return (button14);
        }
        if (tcurrentPos == 15)
        {
            return (button15);
        }
        if (tcurrentPos == 16)
        {
            return (button16);
        }
        if (tcurrentPos == 17)
        {
            return (button17);
        }
        if (tcurrentPos == 18)
        {
            return (button18);
        }
        if (tcurrentPos == 19)
        {
            return (button19);
        }
        if (tcurrentPos == 20)
        {
            return (button20);
        }
        if (tcurrentPos == 22)
        {
            return (button22);
        }
        if (tcurrentPos == 23)
        {
            return (button23);
        }
        if (tcurrentPos == 24)
        {
            return (button24);
        }
        if (tcurrentPos == 25)
        {
            return (button25);
        } else
        {
            return null;
        }
    }

    public void putSelectorOnButton(JButton tcurrentButton)
    {
        tcurrentButton.setBorder(selectorBorder);
    }

    public void removeSelectorOnButton(JButton tcurrentButton)
    {
        tcurrentButton.setBorder(emptyBorder);
    }

    public void moveSelector(int tdimensionNumber, int tcurrentPos, int tdirectionToMove)
    {
        if (canMoveToIndicatedPos(tdimensionNumber, tcurrentPos, tdirectionToMove) == true)
        {
            //this means that the move is allowed
            removeSelectorOnButton(getButtonFromCurrentPos(currentPos));
            //MOVE LEFT
            if (tdirectionToMove == 0)
            {
                currentPos -= 1;
                putSelectorOnButton(getButtonFromCurrentPos(currentPos));
            }
            //MOVE RIGHT
            if (tdirectionToMove == 2)
            {
                currentPos += 1;
                putSelectorOnButton(getButtonFromCurrentPos(currentPos));
            }
            //MOVE UP
            if (tdirectionToMove == 1)
            {
                currentPos -= dimensionNumber;
                putSelectorOnButton(getButtonFromCurrentPos(currentPos));
            }
            //MOVE DOWN
            if (tdirectionToMove == 3)
            {
                currentPos += dimensionNumber;
                putSelectorOnButton(getButtonFromCurrentPos(currentPos));
            }
        }
    }

    public boolean canMoveToIndicatedPos(int tdimensionNumber, int tcurrentPos, int tdirectionToMove)
    {
        boolean canMove = true;
        for (int i = 0; i <= tdimensionNumber; i++)
        {
            //LEFT SIDE CASE
            if (tcurrentPos == (1 + i * tdimensionNumber))
            //for 3x3 - 1, 4, 7, for 4x4 - 1, 5, 9, 13
            {
                if (tdirectionToMove == 0)
                {
                    canMove = false;
                    //System.out.println("can't move left - keep pos " + currentPos);
                }
            }
            //RIGHT SIDE CASE
            if (tcurrentPos == (i * tdimensionNumber))
            //for 3x3 - 0, 3, 6, 9, for 4x4 - 0, 4, 8, 12, 16
            {
                if (tdirectionToMove == 2)
                {
                    canMove = false;
                    //System.out.println("can't move right - keep pos " + currentPos);
                }
            }
            //TOP SIDE CASE
            if (tcurrentPos == i)
            {
                if (tdirectionToMove == 1)
                {
                    canMove = false;
                    //System.out.println("can't move up - keep pos " + currentPos);
                }
            }
            //BOTTOM SIDE CASE
            if (tcurrentPos == ((tdimensionNumber - 1) * tdimensionNumber) + i)
            //for 3x3 - 7, 8, 9, for 4x4 - 13, 14, 15, 16
            //for 3x3 - (2*3)+1, (2*3)+2, (2*3)+3
            //for 4x4 - (3*4)+1, (3*4)+2, (3*4)+3, (3*4)+4
            {
                if (tdirectionToMove == 3)
                {
                    canMove = false;
                    //System.out.println("can't move down - keep pos " + currentPos);
                }
            }
        }
        return canMove;
    }

    //need to determine 
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Object obj = ae.getSource();

        if (obj == countdownTimer)
        {
            if (secondsLeft < 1)
            {
                System.out.println("YOU'RE OUT OF TIME AND FIX THIS PRINTOUT");
            }
            secondsLeft--;

            determineSliderValueAndPlaceButtons(difficultySlider, buttonPanel);
        }

        if (obj == startButton)
        {
            gameSetup();
        }

        if (obj == button1)
        {
            button1.setBorder(emptyBorder);
            //THIS SHIT WORKS
        }

        validate();
        repaint();

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();
        //System.out.println("KEY " + keyChar + " (" + keyCode + ") WAS HIT FROM PRESSED");
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();
        //System.out.println("KEY " + keyChar + " (" + keyCode + ") WAS HIT FROM RELEASED");

        if (keyCode >= 37 && keyCode <= 40)
        {
            int directionCode = translateKeyCodeToDirection(keyCode);
            //System.out.println("directionCode is " + directionCode);
            //System.out.println("currentPos before move is " + currentPos);
            moveSelector(dimensionNumber, currentPos, directionCode);
            //System.out.println("currentPos after move is " + currentPos);
        }
        if (keyCode == 10)
        {
            if(isButtonPrime(currentPos))
            {
                scoreCounter++;
                scoreLabel.setText("     Score is " + scoreCounter);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();
        //System.out.println("KEY " + keyChar + " (" + keyCode + ") WAS HIT FROM TYPED");
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);


        //window focus is important and (the active focusable object) 
        //needs to be updated every time something happens
        //because keylisteners are dumb 
        //HURR DURR WHAT HAPPENED
        //this is probably the most important line in the entire program
        //without it, the keylisteners wouldn't work ~80% of the time
        requestFocusInWindow();
    }
}
