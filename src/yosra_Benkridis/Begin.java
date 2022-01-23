/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yosra_Benkridis;

/**
 *
 * @author Windows10
 */
import jaco.mp3.player.MP3Player;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Begin extends JFrame implements ActionListener {
    
      public static final String track="we.mp3";
     MP3Player tr=new MP3Player(new File(track));
     
     
      public static final String track1="we.mp3";
     MP3Player tr1=new MP3Player(new File(track1));
     
      Begin(){ 
          
      JPanel heading,begin;
      
      JButton exit,page1,logo2,song;
      
      Font f = new Font("Serif",Font.BOLD,100); 
      
      //panel heading pour le titre
      
      heading = new JPanel();
      heading.setBackground(new Color(0,0,0,10));
      heading.setBounds(325,210,450,150);  
      
      //label dans le panel qui contient le titre
      
      JLabel name = new JLabel("One piece");
      name.setForeground(Color.BLUE);
      name.setBounds(200,50,400,50);
      name.setFont(f);
      heading.add(name);
      
      // panel begin qui contient les boutons
      
      begin=new JPanel();
      begin.setLayout(null);
      begin.setBounds(315,400,500,550);
      begin.setBackground(new Color(0,0,0,10));
      
      //bouton logo1
      
      page1= new JButton("Logo1");
      page1.setBounds(170,140,100,50);
      page1.setBackground(new Color(150,150,150));
      page1.addActionListener(this);
      begin.add(page1);
      
      //bouton logo2
      
      logo2= new JButton("Logo2");
      logo2.setBounds(170,200,100,50);
      logo2.setBackground(new Color(150,150,150));
      logo2.addActionListener(this);
      begin.add(logo2);
      
      //bouton exit
      
      song= new JButton("Song");
      song.setBounds(170,260,100,50);
      song.setBackground(new Color(150,150,150));
      song.addActionListener(this);
      begin.add(song);
      
     //bouton song 
            
      exit= new JButton("Exit");
      exit.setBounds(170,320,100,50);
      exit.setBackground(new Color(150,150,150));
      exit.addActionListener(this);
      begin.add(exit);
      
      
      //frame
      
      setTitle("One piece"); 
      setSize(1100,1050);
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      //background qui contient l'image
      
      ImageIcon background_image= new ImageIcon("start.jpg");
      Image img=background_image.getImage();
      Image temp_img=img.getScaledInstance(1100, 1050,Image.SCALE_SMOOTH);
      background_image= new ImageIcon(temp_img);
      JLabel background=new JLabel("",background_image,JLabel.CENTER);
      
      //ajout de titre et boutons
      
      background.add(heading);
      background.add(begin);
      
      background.setBounds(0,0,1100,1050);
      add(background);
      setVisible(true);
     
    }
     public void actionPerformed(ActionEvent e){
     
      if(e.getActionCommand().equals("Logo1")){
        Logo1f f1=new Logo1f();
        f1.show();
       
      }
      if(e.getActionCommand().equals("Logo2")){
        Logo2f f2=new Logo2f();
        f2.show();
      }
      if(e.getActionCommand().equals("Song")){
        tr.play();  
      }
        if(e.getActionCommand().equals("Exit")){   
         tr1.stop();
         System.exit(0);
      }
       }
           
     public static void main(String args[]){
    
        new Begin();
        
          }

              }
   

