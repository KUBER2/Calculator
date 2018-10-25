/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calv2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Jakub
 */


public class CalV2 extends JFrame   {
    
    private float firstNumber=0,secondNumber=0;
    private boolean isFirstNumber=false,isSecondNumber=false;
    private String operation = " ";
    private numericPanel numbersBox = new numericPanel();

    public CalV2()
    {
        super("Calculator");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(numbersBox, BorderLayout.CENTER);       
        setVisible(true);
        
        
        
    }
    
    
    public static void main(String[] args) {
        CalV2 cal = new CalV2();

        
    }
    
}
