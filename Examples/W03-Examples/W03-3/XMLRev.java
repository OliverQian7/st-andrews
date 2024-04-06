import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class XMLRev {
    public static void main(String argv[]) {
        try {
            // In this case we will have to load AND save an XML document

            // First we load an XML document. Start by creating a DocumentBuilder
            // object. Again, the factory pattern is not important here, this is
            // simply boilerplate code needed by the interface
            File f = new File(argv[0]);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(f);     // parse the XML file into a Document object

            // optional, but recommended
            // This will simply merge neighbouring text nodes and result in 
            // a cleaner, simpler tree
            doc.getDocumentElement().normalize();
            
            // Get the root node
            Node top = doc.getDocumentElement();
            
            // Get a list and the number of its children
            NodeList children = top.getChildNodes();
            int nChildren = children.getLength();
            
            // Put the children into an array of Nodes, for simpler iterating
            // Alternatively, we could iterate through the NodeList directly
            Node savedChildren[] = new Node[nChildren];
            for (int i = 0; i < nChildren; i++)
                savedChildren[i] = children.item(i);
            
            // Go through the list once and remove each of the children from
            // the root node in turn
            for (int i = 0; i < nChildren; i++)
                top.removeChild(savedChildren[i]);
            
            // Now go through the list in reverse order and add the children
            // again -- we are reversing the sequence
            // Note -- we could have also used top.appendChild here
            for (int i = nChildren - 1; i >= 0; i --)
                top.insertBefore(savedChildren[i], null);

            // All the changes so far were done in-memory (transient data)
            // by processing the doc object
            // Now we can use the transformer to transform this internal 
            // representation into an XML document
            // Once again, this is boilerplate code needed by the library,
            // we have not covered factories yet
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(argv[1]));
            transformer.transform(source, result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
