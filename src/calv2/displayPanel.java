/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calv2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jakub
 */
public class displayPanel extends JPanel {
    
    private JLabel display = new JLabel("Tu pojawią sie twoje działąnia");
    
    
    public displayPanel(){
        super();
            
    }
    public void setText(String textToSet){
        display.setText(textToSet);
        
    }
    
}
