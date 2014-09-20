package programathon;

import javax.swing.*;

public class Interfaz {
    JFrame vPrincipal;
    JButton bNuevo,bGuardar,bAbrir,bReproducir,bSelecEscenario,bPersonake,bSalir;
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
}