

package programathon;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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
    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem;

    JButton bNuevo,bGuardar,bAbrir,bReproducir,bSelecEscenario,bPersonaje,bSalir;
    BufferedImage ibNuevo,ibGuardar,ibAbrir,ibReproducir,ibSelecEscenario,ibPersonaje,ibSlir;
    ImageIcon iibNuevo,iibGuardar,iibAbrir,iibReproducir,iibSelecEscenario,iibPersonaje,iibSlir;
    Interfaz(){
        registraImagenes();
        creaBotones();
        javax.swing.JMenu jMenu1= new JMenu();
        jMenu1.setBounds(30,30,30,30);


        javax.swing.JMenu jMenu2=new JMenu();
        javax.swing.JMenuBar jMenuBar1=new JMenuBar();
        jMenu2.setBounds(300,340,240,240);
        jMenuBar1.setBounds(300,304,504,340);
        
        vPrincipal=new JFrame();
        vPrincipal.setLayout(null);
        vPrincipal.setResizable(false);
        vPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vPrincipal.setBounds(30,30,800,700);
        vPrincipal.add(bNuevo);
        vPrincipal.add(menu);
        
        vPrincipal.add(jMenu2);
        vPrincipal.add(jMenuBar);
        cargarMenu();
        
        vPrincipal.setVisible(true);
    }
    public void cargarMenu(){
        JMenuBar menuBar;
JMenu menu, submenu;
JMenuItem menuItem;
JRadioButtonMenuItem rbMenuItem;
JCheckBoxMenuItem cbMenuItem;

//Create the menu bar.
menuBar = new JMenuBar();

//Build the first menu.
menu = new JMenu("A Menu");
menu.setMnemonic(KeyEvent.VK_A);
menu.getAccessibleContext().setAccessibleDescription(
        "The only menu in this program that has menu items");
menuBar.add(menu);

//a group of JMenuItems
menuItem = new JMenuItem("A text-only menu item",
                         KeyEvent.VK_T);
menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_1, ActionEvent.ALT_MASK));
menuItem.getAccessibleContext().setAccessibleDescription(
        "This doesn't really do anything");
menu.add(menuItem);

menuItem = new JMenuItem("Both text and icon",
                         new ImageIcon("images/middle.gif"));
menuItem.setMnemonic(KeyEvent.VK_B);
menu.add(menuItem);

menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
menuItem.setMnemonic(KeyEvent.VK_D);
menu.add(menuItem);

//a group of radio button menu items
menu.addSeparator();
ButtonGroup group = new ButtonGroup();
rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
rbMenuItem.setSelected(true);
rbMenuItem.setMnemonic(KeyEvent.VK_R);
group.add(rbMenuItem);
menu.add(rbMenuItem);

rbMenuItem = new JRadioButtonMenuItem("Another one");
rbMenuItem.setMnemonic(KeyEvent.VK_O);
group.add(rbMenuItem);
menu.add(rbMenuItem);

//a group of check box menu items
menu.addSeparator();
cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
cbMenuItem.setMnemonic(KeyEvent.VK_C);
menu.add(cbMenuItem);

cbMenuItem = new JCheckBoxMenuItem("Another one");
cbMenuItem.setMnemonic(KeyEvent.VK_H);
menu.add(cbMenuItem);

//a submenu
menu.addSeparator();
submenu = new JMenu("A submenu");
submenu.setMnemonic(KeyEvent.VK_S);

menuItem = new JMenuItem("An item in the submenu");
menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_2, ActionEvent.ALT_MASK));
submenu.add(menuItem);

menuItem = new JMenuItem("Another item");
submenu.add(menuItem);
menu.add(submenu);

//Build second menu in the menu bar.
menu = new JMenu("Another Menu");
menu.setMnemonic(KeyEvent.VK_N);
menu.getAccessibleContext().setAccessibleDescription(
        "This menu does nothing");
menuBar.add(menu);
    }
    
    
    
 
    public void registraImagenes(){
        try {
            ibNuevo=ImageIO.read(new File("/imagenes/fondoPrincipal.jpg"));
            ibGuardar=ImageIO.read(new File(""));  
            ibAbrir=ImageIO.read(new File(""));  
            ibReproducir=ImageIO.read(new File(""));  
            ibSelecEscenario=ImageIO.read(new File(""));  
            ibPersonaje=ImageIO.read(new File(""));  
            ibSlir=ImageIO.read(new File(""));  
            iibNuevo=new ImageIcon(ibNuevo);
        } catch (IOException ex) {
        }
    }
    public void creaBotones(){
        Archivos proyectos1 = new Archivos();
        proyectos1.generarDirectorio("Proyectos");
        bNuevo=new JButton();
        bNuevo.setBounds(5,5,100,100);
        bNuevo.setIcon(null);
    }
    public static void main(String[] args){
        Interfaz interfaz=new Interfaz();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public void cargarConfiguracion(){
       // Cargar cargar = new Cargar();
        a= cargar.obtener();
        color=a[0];
        color=a[1];
        color=a[2];
        
        
        
        
    }
    public void guardarConfiguracion(){
        Cargar cargar = new Cargar();
        
        
        
        
        
        
        
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













////////////////MENUUUUUUUU







 
    
    
    
    
    
    
    
    
    

