package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormAkhir extends JFrame{
    
    JLabel lulus;
    
    public FormAkhir() {
        setTitle("HALAMAN KELULUSAN");
        setSize(700, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lulus = new JLabel(username + "(" + nim + ")" + "Kamu Tidak diterima sebagai Android Developer" );
        
        add(lulus);
        
    }
    
    
}
