/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
/**
 *
 * @author stephanmorris
 */
public class LoginScreen implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    private JLabel userlabel;
    private JLabel passlabel;
    private JLabel successLabel;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    
    public LoginScreen() {
        
        panel = new JPanel();
        frame = new JFrame();
       

        frame.setSize(250,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); 
        
        panel.setLayout(null);
        
        //UserName Label
        userlabel = new JLabel("Username");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);  
        
        //Text Field
        JTextField userText = new JTextField();
        userText.setBounds(80, 20, 100, 25);
        panel.add(userText);
        
        //Password Label
        passlabel = new JLabel("Password");
        passlabel.setBounds(10, 50, 80, 25);
        panel.add(passlabel);  
        
        //Password Textfield
        JPasswordField passText = new JPasswordField();
        passText.setBounds(80, 50, 100, 25);
        panel.add(passText);  
     
        //Login Button
        button = new JButton("Login");
        button.setBounds(50, 80, 100, 25);
        button.addActionListener(this);
        panel.add(button);
        
        //Success Label
        successLabel = new JLabel("");
        successLabel.setBounds(50, 120, 100, 25);
        panel.add(successLabel);  
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login Screen");
        frame.setVisible(true);

    }
          
            
    public static void main(String[] args) {
        new LoginScreen();     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        successLabel.setText("Login Successful");
    }
    
}
