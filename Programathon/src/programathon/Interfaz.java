
package programathon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Interfaz implements MouseListener {
    JFrame vPrincipal;
    JButton bNuevo,bGuardar,bAbrir,bReproducir,bSelecEscenario,bPersonaje,bSalir;
    BufferedImage ibNuevo,ibGuardar,ibAbrir,ibReproducir,ibSelecEscenario,ibPersonaje,ibSlir;
    Interfaz(){
        registraImagenes();
        creaBotones();
        javax.swing.JMenu jMenu1= new JMenu();
        jMenu1.setBounds(30,30,800,700);


        javax.swing.JMenu jMenu2=new JMenu();
        javax.swing.JMenuBar jMenuBar1=new JMenuBar();
        jMenu2.setBounds(30,30,800,700);
        jMenuBar1.setBounds(30,30,800,700);
        vPrincipal=new JFrame();
        vPrincipal.setLayout(null);
        vPrincipal.setResizable(false);
        vPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vPrincipal.setBounds(30,30,800,700);
        vPrincipal.add(bNuevo);
        vPrincipal.add(jMenu1);
        vPrincipal.add(jMenu2);
        vPrincipal.add(jMenuBar1);
        
        vPrincipal.setVisible(true);
    }
    public void registraImagenes(){
        try {
            ibNuevo=ImageIO.read(new File(""));
            ibGuardar=ImageIO.read(new File(""));  
            ibAbrir=ImageIO.read(new File(""));  
            ibReproducir=ImageIO.read(new File(""));  
            ibSelecEscenario=ImageIO.read(new File(""));  
            ibPersonaje=ImageIO.read(new File(""));  
            ibSlir=ImageIO.read(new File(""));  
        } catch (IOException ex) {
        }
    }
    public void creaBotones(){
        bNuevo=new JButton();
        bNuevo.setBounds(5,5,100,100);
        bNuevo.setIcon(null);
    }
    public static void main(String[] args){
        Interfaz interfaz=new Interfaz();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public void cargarConfiguracion(){
       // Cargar cargar = new Cargar();
        
        
        
        
        
    }
    public void guardarConfiguracion(){
        
        
        
        
        
        
    }    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Eventos en los botones

    @Override
    public void mouseClicked(MouseEvent e) {
          if(e.getSource()==bNuevo){
              System.out.println("Esta en el botonnuevo");
              
          }
          if(e.getSource()==bGuardar){
              System.out.println("Esta en el botonguardar");
              
          }
          if(e.getSource()==bAbrir){
              System.out.println("Esta en el botonabrir");
              
          }

          if(e.getSource()==bReproducir){
              System.out.println("Esta en el boton reproducr");
              
          }
          if(e.getSource()==bSelecEscenario){
              
              System.out.println("Esta en el botoescenario");
          }
          if(e.getSource()==bPersonaje){
              System.out.println("Esta en bton personaje");
              
          }
          if(e.getSource()==bSalir){
              System.out.println("Esta en el botonsalir");
              
          }
          
          
          
          
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
        
    }


 
    
    
    
    
    
    
    
    
    

