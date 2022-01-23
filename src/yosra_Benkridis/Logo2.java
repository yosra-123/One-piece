/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yosra_Benkridis;

/**
 *
 * @author Windows10
 */import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Logo2 extends JPanel implements ActionListener  {
    
    JButton next,Back;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D)g;
  //visage      
       Ellipse2D e = new Ellipse2D.Double(250,300,500,430);
       g2d.setColor(Color.WHITE);
       g2d.fill(e);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.setColor(Color.BLACK);
       g2d.draw(e);

//       mouthe

        QuadCurve2D q1=new QuadCurve2D.Double(391,713,330,870,460,910);
        g2d.setStroke(new BasicStroke(6.0f));
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
       g2d.setPaint(Color.WHITE);
        GeneralPath gp=new GeneralPath();
        gp.moveTo(280,410);
        gp.lineTo(180,290);
        gp.curveTo(190,270,145,140,110,270);
        gp.curveTo(110,270,2,295,120,350);
        gp.lineTo(120,350);
        gp.lineTo(250,490);
        gp.closePath();
        g2d.fill(gp);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(gp);//
//egg2
       g2d.setPaint(Color.WHITE);
       GeneralPath gp2=new GeneralPath();
       gp2.moveTo(720,410);
       gp2.lineTo(850,290);
       gp2.curveTo(850,290,900,140,925,290);
       gp2.curveTo(925,290,1050,350,880,360);
       gp2.lineTo(880,360);
       gp2.lineTo(750,490);
       gp2.closePath();
       g2d.fill(gp2);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp2);//
//egg3            
      g2d.setPaint(Color.WHITE);
      GeneralPath gp3=new GeneralPath();
      gp3.moveTo(605,713);
      gp3.lineTo(800,800);
      gp3.curveTo(800,800,930,700,870,840);
      gp3.curveTo(870,840,940,990,790,871);
      gp3.lineTo(789,871);
      gp3.lineTo(639,810);
      gp3.closePath();
      g2d.fill(gp3);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp3);//
//egg4       
      g2d.setPaint(Color.WHITE);
      GeneralPath gp4=new GeneralPath();
      gp4.moveTo(391,713);
      gp4.lineTo(180,810);
      gp4.curveTo(180,810,50,720,128,850);
      gp4.curveTo(128,850,50,980,210,870);
      gp4.lineTo(210,870);
      gp4.lineTo(370,810);
      gp4.closePath();
      g2d.fill(gp4);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp4);//
   
   //les yeux
      Ellipse2D e1 = new Ellipse2D.Double(325,420,150,150);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(e1);
       
       Ellipse2D e2= new Ellipse2D.Double(545,420,150,150);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(e2);//
       
  //ney rouge   
       Ellipse2D e3 = new Ellipse2D.Double(430,520,160,180);
       g2d.setColor(Color.RED);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.fill(e3);//
       
//les taches des yeux 
       g2d.setPaint(Color.BLACK);
       GeneralPath gp5=new GeneralPath();
       gp5.moveTo(370,460);
       gp5.lineTo(430,330);
       gp5.lineTo(430,330);
       gp5.lineTo(400,460);
       gp5.closePath();
       g2d.fill(gp5);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(gp5);
   
       g2d.setPaint(Color.BLACK);
       GeneralPath gp6=new GeneralPath();
       gp6.moveTo(650,460);
       gp6.lineTo(580,330);
       gp6.lineTo(580,330);
       gp6.lineTo(610,460);
       gp6.closePath();
       g2d.fill(gp6);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(gp6);
   
      
   
       g2d.setPaint(Color.BLACK);
       GeneralPath gp7=new GeneralPath();
       gp7.moveTo(650,560);
       gp7.lineTo(610,690);
       gp7.lineTo(610,690);
       gp7.lineTo(620,560);
       gp7.closePath();
       g2d.fill(gp7);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(gp7);
   
   
       g2d.setPaint(Color.BLACK);
       GeneralPath gp8=new GeneralPath();
       gp8.moveTo(370,560);
       gp8.lineTo(420,690);
       gp8.lineTo(420,690);
       gp8.lineTo(400,560);
       gp8.closePath();
       g2d.fill(gp8);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(gp8);
   
       g2d.setPaint(Color.BLACK);
       GeneralPath gp10=new GeneralPath();
       gp10.moveTo(335,500);
       gp10.lineTo(290,490);
       gp10.lineTo(290,490);
       gp10.lineTo(380,480);
       gp10.closePath();
       g2d.fill(gp10);
       g2d.setColor(Color.BLACK);
       g2d.setStroke(new BasicStroke(6.0f));
       g2d.draw(gp10);
   
      g2d.setPaint(Color.BLACK);
      GeneralPath gp11=new GeneralPath();
      gp11.moveTo(425,500);
      gp11.lineTo(490,490);
      gp11.lineTo(490,490);
      gp11.lineTo(470,480);
      gp11.closePath();
      g2d.fill(gp11);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp11);
   
   
      g2d.setPaint(Color.BLACK);
      GeneralPath gp12=new GeneralPath();
      gp12.moveTo(550,500);
      gp12.lineTo(530,490);
      gp12.lineTo(530,490);
      gp12.lineTo(550,480);
      gp12.closePath();
      g2d.fill(gp12);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp12);
   
      g2d.setPaint(Color.BLACK);
      GeneralPath gp13=new GeneralPath();
      gp13.moveTo(550,480);
      gp13.lineTo(535,485);
      gp13.lineTo(535,485);
      gp13.lineTo(550,480);
      gp13.closePath();
      g2d.fill(gp13);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp13); 
   
   
   
      g2d.setPaint(Color.BLACK);
      GeneralPath gp14=new GeneralPath();
      gp14.moveTo(635,470);
      gp14.lineTo(740,485);
      gp14.lineTo(740,485);
      gp14.lineTo(645,500);
      gp14.closePath();
      g2d.fill(gp14);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(6.0f));
      g2d.draw(gp14);//
   
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
    
    //image avec message d'erreur
         try{
         g2d.drawImage(ImageIO.read(new File("buggy.jpg")),200,10, this);
    
     }catch(IOException ee){
        g2d.drawString("Non trouvé", 0, 0); 
     }
   //label qu en va ajouter le panel et boutons      
      JLabel background=new JLabel();   
      background.add(but);
      background.add(next);
       background.add(Back);
      background.setBounds(0,0,1100,1050);
      add(background);
      setVisible(true);
       }
    public void actionPerformed(ActionEvent e){
      if(e.getActionCommand().equals("Next"))
          { Crew2f f2=new Crew2f();
           f2.show();}
       if(e.getActionCommand().equals("Back")){
        Beginf f3=new Beginf();
        f3.show();
      }
  }
    public static void main(String[]args){
       JFrame f2=new JFrame("Buggy");
        f2.setSize(1100,1000);
        Logo2 Logo2 = new Logo2();
        f2.setContentPane(Logo2);
        f2.show(); 
    
}}
