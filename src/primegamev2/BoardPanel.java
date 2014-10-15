/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primegamev2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author stephenjohnwrightfarrington
 */
public class BoardPanel extends myJPanelstd
{

    JPanel myJPanel;
    int buttonPos, numberOfPrimesFor3x3, numberOfPrimesFor4x4, numberOfPrimes5x5;
    JButton button1, button2, button3, button4,
            button5, button6, button7,
            button8, button9, button10, button11, button12, button13, button14,
            button15, button16, button17, button18, button19, button20,
            button21, button22, button23, button24, button25;

    public void BoardPanel()
    {
        myJPanel = new JPanel();
        myJPanel.setLayout(new GridLayout(3, 3));

        initializeAllGameButtons();
        placeButtons3x3();
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

    public void placeButtons3x3()
    {
        removeAll();
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
    }

    public void placeButtons4x4()
    {
        removeAll();
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
    }

    public void placeButtons5x5()
    {
        removeAll();
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
        add(button17);
        add(button18);
        add(button19);
        add(button20);
        add(button21);
        add(button22);
        add(button23);
        add(button24);
        add(button25);
    }

    public void determineSliderValueAndPlaceButtons(JSlider tslider)
    {
        if (tslider.getValue() == 3)
        {
            placeButtons3x3();
        }

        if (tslider.getValue() == 4)
        {
            placeButtons4x4();
        }

        if (tslider.getValue() == 5)
        {
            placeButtons5x5();
        }
    }

    public void determineNewSelectorPosition(int formerPos, int newPos)
    {
        if (isEdgeCase(formerPos) == true)
        {
            //
        }
    }

    public boolean isEdgeCase(int currentPos)
    {
        return false;
    }
    //need to determine which direction to ignore certain user inputs

  
}
