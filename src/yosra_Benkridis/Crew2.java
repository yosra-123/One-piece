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
public class Crew2 extends JPanel implements ActionListener{
    
    JButton Add1, Add2,Add3,Add4,Add5,Add6,Add7,Back;
    
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    
      public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     Graphics2D g2=(Graphics2D)g;
     try{
         g2.drawImage(ImageIO.read(new File("Buggy.png")),380,5, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
      try{
         g2.drawImage(ImageIO.read(new File("Mohji.png")),110,300, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
           try{
         g2.drawImage(ImageIO.read(new File("Galdino.png")),600,300, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
          try{
         g2.drawImage(ImageIO.read(new File("Cabaji.png")),50,610, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
       try{
         g2.drawImage(ImageIO.read(new File("Kataruki.png")),400,660, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
          try{
         g2.drawImage(ImageIO.read(new File("Richie.png")),350,330, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
                    try{
         g2.drawImage(ImageIO.read(new File("Lao g.jpg")),630,680, this);
     
    
     }catch(IOException e){
        g2.drawString("Non trouvé", 0,0); 
     }
                    
    //panel pour les boutons
    
    JPanel but=new JPanel();
    but.setLayout(null);
    but.setBounds(910,850,150,80);
    but.setBackground(new Color(0,0,0,10));
      
    Add1= new JButton("Mohji");
    Add1.setBounds(910,750,150,80);
    Add1.setBackground(new Color(150,150,150));
    Add1.addActionListener(this);
    
    
    Add2= new JButton("Katakuri");
    Add2.setBounds(910,650,150,80);
    Add2.setBackground(new Color(150,150,150));
    Add2.addActionListener(this);
    
    Add3= new JButton("Galdino");
    Add3.setBounds(910,550,150,80);
    Add3.setBackground(new Color(150,150,150));
    Add3.addActionListener(this);
    
    Add4= new JButton("Cabaji");
    Add4.setBounds(910,450,150,80);
    Add4.setBackground(new Color(150,150,150));
    Add4.addActionListener(this);
    
    Add5= new JButton("Lao g");
    Add5.setBounds(910,350,150,80);
    Add5.setBackground(new Color(150,150,150));
    Add5.addActionListener(this);
    
    Add6= new JButton("Richie");
    Add6.setBounds(910,250,150,80);
    Add6.setBackground(new Color(150,150,150));
    Add6.addActionListener(this);
    
    Add7= new JButton("Buggy");
    Add7.setBounds(910,150,150,80);
    Add7.setBackground(new Color(150,150,150));
    Add7.addActionListener(this);
    
    Back= new JButton("Back");
    Back.setBounds(910,850,150,80);
    Back.setBackground(new Color(150,150,150));
    Back.addActionListener(this);
    
    tf1 = new JTextField(" ");
    tf1.setBounds(420,270,100,40);  
    
    tf2 = new JTextField(" ");
    tf2.setBounds(390,600,100,40);
    
      
    tf3 = new JTextField(" ");
    tf3.setBounds(700,930,100,40);
    
    tf4 = new JTextField(" ");
    tf4.setBounds(80,930,100,40);
    
    tf5 = new JTextField(" ");
    tf5.setBounds(700,580,100,40);
    
    tf6 = new JTextField(" ");
    tf6.setBounds(400,920,100,40);
    
    tf7 = new JTextField(" ");
    tf7.setBounds(100,550,100,40);
    
    
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
     if(e.getActionCommand().equals("Buggy")){    
      String str=e.getActionCommand(); 
      tf1.setText(str);}
     
      if(e.getActionCommand().equals("Richie")){
      String str=e.getActionCommand();   
      tf2.setText(str);}
      
     if(e.getActionCommand().equals("Lao g")){
     String str=e.getActionCommand();   
      tf3.setText(str);}
     
     if(e.getActionCommand().equals("Cabaji")){
     String str=e.getActionCommand();   
      tf4.setText(str);}
     
     if(e.getActionCommand().equals("Galdino")){
     String str=e.getActionCommand();   
      tf5.setText(str);} 
     
     if(e.getActionCommand().equals("Katakuri")){
     String str=e.getActionCommand();   
      tf6.setText(str);} 
     
    if(e.getActionCommand().equals("Mohji")){
     String str=e.getActionCommand();   
      tf7.setText(str);} 
    
     if(e.getActionCommand().equals("Back")){
        Logo2f f3=new Logo2f();
        f3.show();
        //passage du frame
      }
     
     }
 
     
      
    public static void main(String args[]){
        JFrame f = new JFrame("The crew of B");
        f.setSize(1100,1050);
        Crew2 c= new Crew2();
        f.setContentPane(c);
        f.show();
        
    }
    
}
