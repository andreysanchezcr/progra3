package programathon;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Interfaz extends Frame implements MouseListener {
    MenuBar barra = new MenuBar();
    Menu configuracion = new Menu("Configuración");
    Menu CambiarColor = new Menu("Cambiar Color");
    
    JFrame vPrincipal;
    JButton bNuevo,bGuardar,bAbrir,bReproducir,bSelecEscenario,bPersonaje,bSalir;
    ImageIcon iibNuevo,iibGuardar,iibAbrir,iibReproducir,iibSelecEscenario,iibPersonaje,iibSalir;
    Interfaz(){
        setMenuBar(barra);
        barra.add(configuracion);
        configuracion.add(CambiarColor);
        configuracion.addSeparator();
        creaBotones();
        vPrincipal=new JFrame();
        vPrincipal.setLayout(null);
        vPrincipal.setResizable(false);
        vPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vPrincipal.setBounds(30,30,800,600);
        vPrincipal.add(bNuevo);
        vPrincipal.add(bGuardar);
        vPrincipal.add(bAbrir);
        vPrincipal.add(bReproducir);
        vPrincipal.add(bSelecEscenario);
        vPrincipal.add(bPersonaje);
        vPrincipal.add(bSalir);
        vPrincipal.setVisible(true);
    }
    //Cargamos las imagenes.
    //Enteros height y width para cambiar tamaño de imagen.
    public ImageIcon getIconImage(int width,int height,String direccion) {
        Image imagen = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(direccion)); //Obtener la imagen con la direccion que le enviemos
        ImageIcon iibNuevo=new ImageIcon(imagen);  //Conviete la imagen cargada a icono
        Image icono = iibNuevo.getImage();  //Se obtiene la imagen del icono
        ImageIcon iconoEscalado = new ImageIcon (icono.getScaledInstance(width,height,Image.SCALE_SMOOTH)); //Cambiamos el tamaño de la imagen
        return iconoEscalado;
    }
    //Método creación de botones de la interfaz.
    public void creaBotones(){
        bNuevo=new JButton();
        bNuevo.setBounds(5,5,100,100);
        bNuevo.setIcon(getIconImage(100,100,"simbolos/nuevo.png"));
        bGuardar=new JButton();
        bGuardar.setBounds(5,5,100,100);
        bGuardar.setIcon(getIconImage(100,100,"simbolos/guardar.png"));
        bAbrir=new JButton();
        bAbrir.setBounds(105,5,100,100);
        bAbrir.setIcon(getIconImage(100,100,"simbolos/abrir_proyecto.png"));
        bReproducir=new JButton();
        bReproducir.setBounds(205,5,100,100);
        bReproducir.setIcon(getIconImage(100,100,"simbolos/reproducir.png"));
        bSelecEscenario=new JButton();
        bSelecEscenario.setBounds(305,5,100,100);
        bSelecEscenario.setIcon(getIconImage(100,100,"simbolos/agregar-cambiar escenario.png"));
        bPersonaje=new JButton();
        bPersonaje.setBounds(405,5,100,100);
        bPersonaje.setIcon(getIconImage(100,100,"simbolos/agregar personaje.png"));
        bSalir=new JButton();
        bSalir.setBounds(505,5,100,100);
        bSalir.setIcon(getIconImage(100,100,"simbolos/salir_aplicacion.png"));
        
        
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


 
    
    
    
    
    
    
    
    
    
