package programathon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Interfaz implements MouseListener {
    JFrame vPrincipal;
    JButton bNuevo,bGuardar,bAbrir,bReproducir,bSelecEscenario,bPersonaje,bSalir;
    Interfaz(){
        vPrincipal=new JFrame();
        vPrincipal.setBounds(30,30,800,700);
        vPrincipal.add(bNuevo);
        bNuevo=new JButton();
        bNuevo.setBounds(50,50,5,5);
        bNuevo.setIcon(null);
        vPrincipal.setVisible(true);
    }
    public static void main(String[] args){
        Interfaz interfaz=new Interfaz();
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


 
    
    
    
    
    
    
    
    
    
