package programathon;

import java.io.*;
import javax.swing.*;

/** 
*Una clase que permite el manejo de archivos necesarios para el reproductor
*@author Kenneth Martínez Avendaño
*/

public class Archivos{

    /**
    *Ruta del fichero
    */
    private  String directorio;

    /**
    * Constructor para la clase Archivos
    */

    public Archivos(){

        //this.directorio = direccion;
    }


    /** 
    *Método que permite generar una carpeta en donde se almacenarán los datos
     * @param nombre nombre del directorio
    */

    public void generarDirectorio(String nombre){

        File archivo = new File(nombre);
        if (archivo.exists()){ // Revisa si existe la carpeta
        }
        else{
            archivo.mkdir();
        }
    }

    public boolean revisarCarpeta(String nombre){

        File archivo = new File("Proyectos" + File.separator + nombre);
        return archivo.exists();
    }

    /** 
    *Crea una copia del archivo entrada y lo redirecciona a la carpeta del programa
     * @param direccion direccion de la carpeta
     * @param carpeta carpeta
    */

    public void redireccionarFichero(String direccion, String carpeta){

                File archivo = new File(direccion);
                String nombre = archivo.getName();
                String direccionCompleta;
                
                // Une una direccion con nombre de carpeta y nombre de archivo
                if (carpeta == null){

                    direccionCompleta = "Proyectos" + File.separator + nombre; 
                }
                
                else {

                    direccionCompleta =  "Proyectos" + File.separator + carpeta + File.separator + nombre;
    
                }

                 File destino = new File(direccionCompleta);
                


                try {
                    OutputStream salida; 
                    try (InputStream entrada = new FileInputStream(direccion) //Obtiene los bytes del directorio
                    ) {                                
                        salida = new FileOutputStream(destino); //Lee los flujos de bytes
                        byte[] contenido = new byte[1024];
                        int iniciador;
                        // Va leyendo el contenido de entrada y escribiendo en el de salida
                        while ((iniciador = entrada.read(contenido)) > 0) {
                            salida.write(contenido, 0, iniciador);
                        }
                    } //Lee los flujos de bytes
                        salida.close();

                } catch (IOException ioe){
                        ioe.printStackTrace();
                    }
        }

    /**
    *Obtiene el nombre del archivo segun su ruta
    *@return Devuelve un string del nombre de un fichero
    */

    public String obtenerNombre(){
        File temp = new File(this.directorio);
        return temp.getName(); //obtener nombre
    }
    
    public String obtenerProyectos(){
        String homeUsuario = System.getProperty("user.home"); //obtiene el directorio personal
        String dir = homeUsuario + File.separator + "Proyectos"+File.separator;
        return dir;
    }

    /**
    *Obtiene la direccion del archivo segun su ruta
     * @param nombre nombre del directorio a obtener
    *@return Devuelve un string de la ruta completa de un fichero
    */

    public String obtenerDireccion(String nombre){
        File temp = new File(nombre);
        return temp.getAbsolutePath()+File.separator; //obtener ruta completa
    }

    /**
    *Obtiene el directorio home y lo une con la carpeta musica
    *@return Devuele un String con el directorio de musica
    */




    /**
    *Permite leer los elementos de tipo (".mp3", ".wav", ".ogg") que hay en un directorio 
    *y sobre redireccionar el fichero a la carpeta Proyectos
    *@param directorio Es la dirección personal del computador
     * @param carpeta nombre de carpeta
     * @return resultado
    */

    public String[][] leerArchivosCarpeta(String directorio, String carpeta){

        File fichero = new File(directorio);
        File[] arregloFichero = fichero.listFiles(); // Lista de ficheros
        int cantidad = arregloFichero.length;
        String[][] listaCanciones = new String[cantidad][cantidad];

        for(int contador = 0; contador < arregloFichero.length;contador ++){

            String cancion = arregloFichero[contador].getName();
                String cancion1 = arregloFichero[contador].getAbsolutePath();// Guarda las direcciones

                listaCanciones[0][contador]=cancion;
                listaCanciones[1][contador]=cancion1;
                
                Archivos archivoTemp = new Archivos();
                archivoTemp.redireccionarFichero(cancion,carpeta);
             
        }return listaCanciones; 
    }
    
 
 }