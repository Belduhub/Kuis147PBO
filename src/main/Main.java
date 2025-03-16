package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
    JLabel judul = new JLabel ("REGISTRATION FORM");
    JLabel username = new JLabel("Nama:");
    JLabel nim = new JLabel("NIM:");
    JLabel WScore = new JLabel ("Writing Score");
    JLabel CScore = new JLabel ("Coding Score");
    JLabel IScore = new JLabel ("Interview Score");
    JLabel Deva = new JLabel ("Android Developer");
    JLabel Devw = new JLabel ("Website Developer");
    
    JTextField usernameTextField = new JTextField();
    JTextField nimTextField = new JTextField();
    JTextField WTextField = new JTextField();
    JTextField CTextField = new JTextField();
    JTextField ITextField = new JTextField();
    
    JRadioButton Adev = new JRadioButton();
    JRadioButton Wdev = new JRadioButton();

    JButton apply = new JButton("Apply");
    
    Main(){
        setVisible(true);
        setSize(500,500);
        setTitle("REGISTRATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(judul);
        add(username);
        add(nim);
        add(WScore);
        add(CScore);
        add(IScore);
        add(usernameTextField);
        add(nimTextField);
        add(Adev);
        add(Wdev);
        add(apply);
        add(WTextField);
        add(CTextField);
        add(ITextField);
        add(Deva);
        add(Devw);
        
        judul.setBounds(160,50,440,12);
        username.setBounds(100,70,440,12);
        nim.setBounds(100,90,250,24);
        WScore.setBounds(100,150,120,20);
        CScore.setBounds(100,210,120,20);
        IScore.setBounds(100,270,120,20);
        usernameTextField.setBounds(160,70,100,20);
        nimTextField.setBounds(160,90,100,20);
        Adev.setBounds(100,330,120,20);
        Wdev.setBounds(100,360,120,20);
        Deva.setBounds(140,310,250,30);
        Devw.setBounds(140,340,250,30);
        apply.setBounds(160,390,120,20);
        WTextField.setBounds(100,180,120,20);
        CTextField.setBounds(100,240,120,20);
        ITextField.setBounds(100,300,120,20);
        
        
        apply.addActionListener(this);
    }
    
        @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == Adev){
                String username = usernameTextField.getText();
                String nim  = nimTextField.getText();
                
                int wscore  = Integer.parseInt(WTextField.getText());
                int cscore  = Integer.parseInt(WTextField.getText());
                int iscore  = Integer.parseInt(WTextField.getText());
                
                if((wscore * 0.4) + (cscore * 0.5) + (iscore * 0.3) >= 85){
                    
                }
            }
                else if(e.getSource() == Wdev){
                String username = usernameTextField.getText();
                String nim  = nimTextField.getText();
                
                int wscore  = Integer.parseInt(WTextField.getText());
                int cscore  = Integer.parseInt(WTextField.getText());
                int iscore  = Integer.parseInt(WTextField.getText());
                
                if((wscore * 0.4) + (cscore * 0.35) + (iscore * 0.25) >= 85){
                    
                }
                }
            
            if (username.getText().isEmpty() || nim.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tolong isi Nama dan Nim", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
             else  if (!Adev.isSelected() && !Wdev.isSelected()) {
                JOptionPane.showMessageDialog(this, "PILIH SALAH SATU", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             else if (WTextField.getText().isEmpty() && CTextField.getText().isEmpty() && ITextField.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "MOHON ISI NILAI", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                
            
                else if(e.getSource() == apply){
                String username = usernameTextField.getText();
                String nim  = nimTextField.getText();
                
                int wscore  = Integer.parseInt(WTextField.getText());
                int cscore  = Integer.parseInt(WTextField.getText());
                int iscore  = Integer.parseInt(WTextField.getText());
                
            }
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, "Tolong isi Nilai dengan angka", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



