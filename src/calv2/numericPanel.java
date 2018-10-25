/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calv2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jakub
 */
public class numericPanel extends JPanel {
    
    public numericPanel(){
        super();
        setLayout(new GridLayout(5,4,3,3));
        JButton buttonClearDisplay = new JButton("C");
        //buttonClearDisplay.addActionListener(this);
        JButton buttonDelate = new JButton("del");
        //buttonDelate.addActionListener(this);
        JButton buttonSquere = new JButton("sqr");
        //buttonSquere.addActionListener(this);
        JButton buttonAdd = new JButton("+");
        //buttonAdd.addActionListener(this);
        JButton buttonSubtract = new JButton("-");
        //buttonSubtract.addActionListener(this);
        JButton buttonMultiply = new JButton("*");
        //buttonMultiply.addActionListener(this);
        JButton buttonEqual = new JButton("=");
        //buttonEqual.addActionListener(this);
        JButton buttonDivide = new JButton("/");
        //buttonDivide.addActionListener(this);
        JButton buttonDecimal = new JButton(",");
        //buttonDecimal.addActionListener(this);
        JButton button00 = new JButton("00");
        //button00.addActionListener(this);
        StringBuilder tmp = new StringBuilder(" ");
        JButton[] buttonsNumers = new JButton[10]; 
        for(int i=0;i<10;i++){
            tmp.deleteCharAt(0);
            tmp.append(i);                
            buttonsNumers[i]= new JButton(tmp.toString());
            //buttonsNumers[i].addActionListener(this);
        }
        add(buttonClearDisplay);
        add(buttonDelate);
        add(buttonSquere);
        add(buttonDivide);
        
        add(buttonsNumers[7]);
        add(buttonsNumers[8]);
        add(buttonsNumers[9]);
        add(buttonMultiply);
        
        add(buttonsNumers[4]);
        add(buttonsNumers[5]);
        add(buttonsNumers[6]);
        add(buttonSubtract);
        
        add(buttonsNumers[1]);
        add(buttonsNumers[2]);
        add(buttonsNumers[3]);
        add(buttonAdd);
        
        
        add(buttonsNumers[0]);
        add(buttonDecimal);
        add(button00);
        add(buttonEqual);
        
    }
    
}
