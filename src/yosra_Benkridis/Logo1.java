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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.*;

public class Logo1 extends JPanel implements ActionListener {
   JButton next,Back;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D)g;
     
//        création du premiére arc (visage)haut

       Arc2D a=new Arc2D.Float(255,328,495,400,0,-180,Arc2D.CHORD);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(a);
       
// création des yeux 

       Ellipse2D e = new Ellipse2D.Double(350,560,110,110);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(e);
       
       Ellipse2D e1= new Ellipse2D.Double(550,560,110,110);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(e1);
       
//       création du ney

       Ellipse2D e3= new Ellipse2D.Double(480,670,40,30);
        g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(e3);
       
//       création du chapeau

       Arc2D a2=new Arc2D.Float(250,280,500,500,0,180,Arc2D.CHORD);
       g2d.setColor(Color.YELLOW);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(a2);
       g2d.setColor(Color.BLACK);
       g2d.draw(a2);
       
    //long one 
    
       RoundRectangle2D rr = new RoundRectangle2D.Double(127,502,750,25,50,50);
       g2d.setColor(Color.YELLOW);
       g2d.fill(rr);
       
      RoundRectangle2D rr1 = new RoundRectangle2D.Double(127,502,750,25,50,50);
       Arc2D a5=new Arc2D.Float(255,450,495,500,0,-180,Arc2D.OPEN);
       Area ar4=new Area(rr1);
       Area ar5 =new Area(a5);
       ar5.intersect(ar4);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(ar4);//
       //bonde rouge
      Arc2D a3=new Arc2D.Float(250,280,500,500,0,180,Arc2D.CHORD);
       Rectangle2D r=new Rectangle2D.Double(250,430,500,70);
       Area ar=new Area(a3);
       Area ar1=new Area(r);
       ar.intersect(ar1);
       g2d.setColor(Color.RED);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(ar);
       g2d.setColor(Color.BLACK);
       g2d.draw(ar);
    //bouche avec les dents
         QuadCurve2D q1=new QuadCurve2D.Double(391,713,330,870,460,910);
        g2d.draw(q1);
        QuadCurve2D q2=new QuadCurve2D.Double(460,910,510,925,570,900);
        g2d.draw(q2);
         QuadCurve2D q3=new QuadCurve2D.Double(605,713,685,850,570,900);
        g2d.draw(q3);
        QuadCurve2D q4=new QuadCurve2D.Double(382,740,510,820,615,740);
        g2d.draw(q4);
        QuadCurve2D q5=new QuadCurve2D.Double(375,770,510,880,628,771);
        g2d.draw(q5);
        Line2D.Float line =new Line2D.Float(445.0f,725.0f,425.0f,800.0f);
        g2d.draw(line);
        Line2D.Float line1 =new Line2D.Float(500.0f,730.0f,500.0f,820.0f);
        g2d.draw(line1);
        Line2D.Float line2 =new Line2D.Float(553.0f,727.0f,580.0f,800.0f);
        g2d.draw(line2);
// egg1    
        
       Line2D.Float line3 =new Line2D.Float(180.0f,290.0f,280.0f,410.0f);
        g2d.draw(line3);
        Line2D.Float line4 =new Line2D.Float(120.0f,350.0f,250.0f,490.0f);
        g2d.draw(line4); 
       CubicCurve2D cc = new CubicCurve2D.Double(180,290,210,200,100,190,110,270);
       g2d.draw(cc);
       CubicCurve2D cc1 = new CubicCurve2D.Double(120,350,40,360,40,250,110,270);
       g2d.draw(cc1);
//egg2       
       Line2D.Float line5 =new Line2D.Float(850.0f,290.0f,720.0f,410.0f);
        g2d.draw(line5);
       Line2D.Float line6 =new Line2D.Float(880.0f,360.0f,750.0f,490.0f);
       g2d.draw(line6);
       CubicCurve2D cc2 = new CubicCurve2D.Double(850,290,840,210,950,200,925,290);
       g2d.draw(cc2);
       CubicCurve2D cc3 = new CubicCurve2D.Double(880,360,950,400,990,300,925,290);
       g2d.draw(cc3);
// egg3      
       Line2D.Float line7 =new Line2D.Float(800.0f,800.0f,605.0f,713.0f);
        g2d.draw(line7);
       Line2D.Float line8 =new Line2D.Float(790.0f,870.0f,639.0f,810.0f);
       g2d.draw(line8);
       CubicCurve2D cc4 = new CubicCurve2D.Double(800,800,860,720,940,810,870,840);
       g2d.draw(cc4);
       CubicCurve2D cc5 = new CubicCurve2D.Double(790,870,860,970,940,860,870,840);
       g2d.draw(cc5);
      
  //egg4
       Line2D.Float line9 =new Line2D.Float(180.0f,810.0f,391.0f,713.0f);
       g2d.draw(line9);
       Line2D.Float line10 =new Line2D.Float(210.0f,870.0f,370.0f,810.0f);
       g2d.draw(line10); 
       CubicCurve2D cc6 = new CubicCurve2D.Double(180,810,150,720,50,820,128,850);
       g2d.draw(cc6);
       CubicCurve2D cc7 = new CubicCurve2D.Double(210,870,160,980,60,870,128,850);
       g2d.draw(cc7);
//
       

//panel pour les boutons

      JPanel but=new JPanel();
      but.setLayout(null);
      but.setBounds(910,850,150,80);
      but.setBackground(new Color(0,0,0,20));
      
      next= new JButton("Next");
      next.setBounds(910,850,150,80);
      next.setBackground(new Color(150,150,150));
      next.addActionListener(this);
      
      
      Back= new JButton("Back");
      Back.setBounds(910,750,150,80);
      Back.setBackground(new Color(150,150,150));
      Back.addActionListener(this);
      
//

       try{
         g2d.drawImage(ImageIO.read(new File("one piece.jpg")),200,10, this);
     
    
     }catch(IOException ee){
        g2d.drawString("Non trouvé", 0, 0); 
     }
      
  //label qu en va ajouter panel et boutons  
      JLabel background=new JLabel();
      background.add(but);
      background.add(next);
      background.add(Back);
      background.setBounds(0,0,1100,1050);
      add(background);
      setVisible(true);//
       }
     public void actionPerformed(ActionEvent e){
      if(e.getActionCommand().equals("Next"))
              { Crew1f f1=new Crew1f();
              f1.show();}
       if(e.getActionCommand().equals("Back")){
        Beginf f3=new Beginf();
        f3.show();
      }
  }
     
    public static void main(String args[]){
        JFrame f1=new JFrame("Luffy");
        f1.setSize(1100,1000);
        Logo1 Logo1 = new Logo1();
        f1.setContentPane(Logo1);
        f1.show(); 
       
        
       
    }
}
