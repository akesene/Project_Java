/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guirasb.com.guirasb;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ak
 */
public class guiAct implements  ActionListener{
  JFrame myframe = new JFrame("Finch Raspberrypi ");
  JPanel gameBoard = new JPanel(new GridLayout(4, 4));
  
   // copied code 
  
  
    JLabel subjectLabel = new JLabel("Subject");
    JLabel verbLabel = new JLabel("Verb");
    JLabel objectLabel = new JLabel("Object");

    JLabel subject = new JLabel("My friend ");
    JTextField verb = new JTextField(25);
    String[] objectOptions = { " a ball."," chickens."," a kazoo.", " an igloo." };
    JComboBox object = new JComboBox(objectOptions);

    JButton clear = new JButton("Clear");
    JTextArea sentence = new JTextArea("My friend ___ ___.");
    JButton exit = new JButton("Exit");
    
  public guiAct (){
      
      myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myframe.setSize(200, 200);
      
    
    
        subjectLabel.setOpaque(true);
        subjectLabel.setBackground(new Color(0,255,255));
        subjectLabel.setHorizontalAlignment(JLabel.CENTER);

        sentence.setEditable(false);
        sentence.setOpaque(false);
        sentence.setLineWrap(true);
        sentence.setWrapStyleWord(true);

        exit.addActionListener(this);
        clear.addActionListener(this);
        verb.addActionListener(this);
        object.addActionListener(this);
    
        gameBoard.add(subjectLabel);
        gameBoard.add(verbLabel);
        gameBoard.add(objectLabel);
        gameBoard.add(subject);
        gameBoard.add(verb);
        gameBoard.add(object);
        gameBoard.add(clear);
        gameBoard.add(sentence);
        gameBoard.add(exit);
        
        
        myframe.setContentPane(gameBoard);
        myframe.setVisible(true);
        myframe.pack();
      
 
  } 

public void actionPerformed (ActionEvent e) {
   
     if (e.getSource() == exit) {

            myframe.dispose();

        } else if (e.getSource() == clear) {

            sentence.setText("");

        } else if ((e.getSource() == verb) || (e.getSource() == object)) {

            String combinedWords = subject.getText() + verb.getText() + (String)object.getSelectedItem();
            sentence.setText(combinedWords);

        }
    
    
  }


    




  }  
    
    
    

