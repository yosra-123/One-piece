/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yosra_Benkridis;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author Windows10
 */
public class Crew1 extends JPanel implements ActionListener{
    
    JButton Add1, Add2,Add3,Add4,Add5,Add6,Add7,Back;
    
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    
      public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     Graphics2D g2=(Graphics2D)g;
     
     try{
         g2.drawImage(ImageIO.read(new File("Luffy.png")),400,30, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
     //message d erreur
      try{
         g2.drawImage(ImageIO.read(new File("Zoro.png")),50,300, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
           try{
         g2.drawImage(ImageIO.read(new File("Sanji.png")),650,300, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
          try{
         g2.drawImage(ImageIO.read(new File("Nami.png")),50,640, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
       try{
         g2.drawImage(ImageIO.read(new File("Robin.png")),350,640, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
          try{
         g2.drawImage(ImageIO.read(new File("Osope.png")),350,300, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
                    try{
         g2.drawImage(ImageIO.read(new File("Chopper.png")),650,640, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
                    
    //panel but pour les boutons 
    
    JPanel but=new JPanel();
    but.setLayout(null);
    but.setBounds(910,850,150,80);
    but.setBackground(new Color(0,0,0,10));
    //add1  
    Add1= new JButton("Zoro");
    Add1.setBounds(910,750,150,80);
    Add1.setBackground(new Color(150,150,150));
    Add1.addActionListener(this);
    //add2
    Add2= new JButton("Robin");
    Add2.setBounds(910,650,150,80);
    Add2.setBackground(new Color(150,150,150));
    Add2.addActionListener(this);
    //add3
    Add3= new JButton("Sanji");
    Add3.setBounds(910,550,150,80);
    Add3.setBackground(new Color(150,150,150));
    Add3.addActionListener(this);
    //add4
    Add4= new JButton("Nami");
    Add4.setBounds(910,450,150,80);
    Add4.setBackground(new Color(150,150,150));
    Add4.addActionListener(this);
   //add5 
    Add5= new JButton("Chopper");
    Add5.setBounds(910,350,150,80);
    Add5.setBackground(new Color(150,150,150));
    Add5.addActionListener(this);
    //add6
    Add6= new JButton("Osope");
    Add6.setBounds(910,250,150,80);
    Add6.setBackground(new Color(150,150,150));
    Add6.addActionListener(this);
    //add7
    Add7= new JButton("Luffy");
    Add7.setBounds(910,150,150,80);
    Add7.setBackground(new Color(150,150,150));
    Add7.addActionListener(this);
    //back
    Back= new JButton("Back");
    Back.setBounds(910,850,150,80);
    Back.setBackground(new Color(150,150,150));
    Back.addActionListener(this);
    
    //ajouter JTextField
    
    tf1 = new JTextField(" ");
    tf1.setBounds(400,250,100,40);  
    
    tf2 = new JTextField(" ");
    tf2.setBounds(370,580,100,40);
    
      
    tf3 = new JTextField(" ");
    tf3.setBounds(700,930,100,40);
    
    tf4 = new JTextField(" ");
    tf4.setBounds(80,950,100,40);
    
    tf5 = new JTextField(" ");
    tf5.setBounds(700,580,100,40);
    
    tf6 = new JTextField(" ");
    tf6.setBounds(400,940,100,40);
    
    tf7 = new JTextField(" ");
    tf7.setBounds(100,580,100,40);
    
    //ajouter les boutons dans JLabel
    
      JLabel background=new JLabel();   
      background.add(but);
      background.add(Add1);
      background.add(Add2);
      background.add(Add3);
      background.add(Add4); 
      background.add(Add5);
      background.add(Add6);
      background.add(Add7);
      background.add(Back);
      
      background.add(tf1);
      background.add(tf2);
      background.add(tf3);
      background.add(tf4);
      background.add(tf5);
      background.add(tf6);
      background.add(tf7);
      
      background.setBounds(0,0,1100,1050);
      add(background);
      setVisible(true);
    }
      
      
     public void actionPerformed (ActionEvent e){
        //ajouter le nom de chaque image  
     if(e.getActionCommand().equals("Luffy")){    
      String str=e.getActionCommand(); 
      tf1.setText(str);}
    if(e.getActionCommand().equals("Osope")){
      String str=e.getActionCommand();   
      tf2.setText(str);}
      
     if(e.getActionCommand().equals("Chopper")){
     String str=e.getActionCommand();   
      tf3.setText(str);}
     
     if(e.getActionCommand().equals("Nami")){
     String str=e.getActionCommand();   
      tf4.setText(str);}
     
     if(e.getActionCommand().equals("Sanji")){
     String str=e.getActionCommand();   
      tf5.setText(str);} 
     
     if(e.getActionCommand().equals("Robin")){
     String str=e.getActionCommand();   
      tf6.setText(str);} 
     
    if(e.getActionCommand().equals("Zoro")){
     String str=e.getActionCommand();   
      tf7.setText(str);} 
    
     if(e.getActionCommand().equals("Back")){
         //passage du frame
        Logo1f f3=new Logo1f();
        f3.show();
      }
     
     }
 
     
      
    public static void main(String args[]){
        JFrame f = new JFrame("The crew of F");
        f.setSize(1100,1050);
        Crew1 c= new Crew1();
        f.setContentPane(c);
        f.show();
        
    }
    
}
