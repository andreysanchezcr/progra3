import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import programathon.Interfaz;
public class xml{
    

    public xml() throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
   DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
DOMImplementation implementation = builder.getDOMImplementation();
    Document document = implementation.createDocument(null, "documento", null);
    document.setXmlVersion("1.0");
    Element raiz = document.getDocumentElement();
    Element nodoNombreCampo = document.createElement("ElementoHijoDeLaRaíz"); //creamos un nuevo elemento
Text nodoValorCampo = document.createTextNode("contenido del elemento hijo"); //Ingresamos la info				
nodoNombreCampo.appendChild(nodoValorCampo); 						
raiz.appendChild(nodoNombreCampo); //pegamos el elemento a la raiz "Documento"
    Source source = new DOMSource(document);
    Result result = new StreamResult(new java.io.File("resultado.xml"));
Transformer transformer = TransformerFactory.newInstance().newTransformer();
transformer.transform(source, result);
    
    
    
    
    
    }
        public static void main(String[] args) throws ParserConfigurationException, TransformerException{
        xml a = new xml();
    }
    
    
    
    
    
}