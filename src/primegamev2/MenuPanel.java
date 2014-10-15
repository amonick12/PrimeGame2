/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primegamev2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author stephenjohnwrightfarrington
 */
public class MenuPanel extends myJPanelstd
{
    JSlider difficultySlider;
    JPanel myJPanel;
    JButton restartButton;
    
    public void MenuPanel()
    {
        myJPanel = new JPanel();
        myJPanel.setLayout(new GridLayout(1,2));
        initalizeAndPlaceDifficultySlider();
        initializeAndPlaceRestartButton();
        //myScorePanel.initializeAndPlaceScoreLabel();
    }
    
    public void initalizeAndPlaceDifficultySlider()
    {
        difficultySlider = new JSlider(3, 5, 3);
        difficultySlider.setMajorTickSpacing(1);
        difficultySlider.setPaintTicks(true);
        difficultySlider.setPaintLabels(true);
        difficultySlider.setSnapToTicks(true);
        add(difficultySlider);
    }
    
    public void initializeAndPlaceRestartButton()
    {
        restartButton = new JButton("restart");
        add(restartButton);
    }
    
    public void determineSliderValueAndPlaceButtons()
    {
        if(difficultySlider.getValue() == 3)
        {
            
        }
    }
    
    
    
    
}
