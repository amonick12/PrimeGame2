/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primegamev2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author stephenjohnwrightfarrington
 */
public class ScorePanel extends myJPanelstd
{
    JLabel scoreLabel;
    int scoreCounter;
    
    public void ScorePanel()
    {
        initializeAndPlaceScoreLabel();
    }
      
      public void initializeAndPlaceScoreLabel()
    {
        scoreCounter = 0;
        scoreLabel = new JLabel("      Score is " + scoreCounter);
        add(scoreLabel);
    }
    
    public void scoreLabelPlusOne()
    {
        scoreCounter++;
        scoreLabel.setText("      Score is " + scoreCounter);
    }
}
