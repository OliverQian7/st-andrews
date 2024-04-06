import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class XMLPrune {
 
  public static void main(String argv[]) {
 
    try {
 
	File f = new File("input.xml");
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	DocumentBuilder db = dbf.newDocumentBuilder();
	Document doc = db.parse(f);
 
	//optional, but recommended
	doc.getDocumentElement().normalize();
 
	Node top = doc.getDocumentElement();
      	System.out.println("Root element :" + top.getNodeName());	
 
	
	Node child =top.getFirstChild();
	while (child.getNodeType() != Node.ELEMENT_NODE)
	    child = child.getNextSibling();

	top.removeChild(child);
	TransformerFactory tFactory =
	    TransformerFactory.newInstance();
	Transformer transformer = tFactory.newTransformer();

	DOMSource source = new DOMSource(doc);
	StreamResult result = new StreamResult(new File("output.xml"));
	transformer.transform(source, result); 
	
    } catch (Exception e) {
	e.printStackTrace();
    }
  }
 
}
