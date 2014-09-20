package programathon;
/*
*Importar librerias necesarias para el control y la reproduccion de archivos
*/
import java.io.PrintStream; 
import java.util.Map; 
import javazoom.jlgui.basicplayer.*; 

/*
*Creación de la clse ReproductorM la cual implementará de la clase BasicPlayer 
por lo que se deben sobreescribir los métodos.
*/
public  class ReproductorM implements BasicPlayerListener { 

    private PrintStream out = null;//Stream que mostrará en consola toda la accion desarrollada por la reproducción del archivo
    BasicPlayer player = new BasicPlayer();//Instancia de BasicPlayer 
   
    /*
    *Constructor de la clase ReproductorM
    */
    public ReproductorM () { 
        //Indica si en el proceso de reproducción ocurrieron acciones como pusar, reproducir, reanudar, etc. 
        player.addBasicPlayerListener(this);
        out = System.out; 
    } 

    BasicController control = (BasicController) player;//Controlador del reproductor
    
    
    /*
    *Metodos que sobreescribimos
    */ 

    /*7Método que proporciona informacion del archivo abierto
    */
    @Override
    public void opened(Object stream, Map properties) { 
        display("opened : " + properties.toString()); 
    } 
    
    /*Método que muestra el proceso mientras se reproduce la cancion
    */
    @Override
   public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) { 
       display("progress : " + properties.toString()); 
    } 

   /*Método que actualiza el estado del reproductor }
   */
    @Override
    public void stateUpdated(BasicPlayerEvent event) { 
        display("stateUpdated : " + event.toString()); 
    } 

    /*Controla la ejecucion de la reproduccion
    */
    @Override
    public void setController(BasicController controller) { 
        display("setController : " + controller); 
    } 

    /* Mustra en consola todos los datos de los metodos anteriores
    */
    public void display(String msg) { 
        if (out != null) { 
            out.println(msg); 
        } 
    } 

}