import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import java.io.*;

public class SimpleXMLWriter {
    public static void main(String [] argv) {
        try {
            // Create a fresh DOM object with nothing in it
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element rootElement = doc.createElement("menu");
            doc.appendChild(rootElement);

            // Create one new element and add it to the root
            Element item = doc.createElement("item");
            rootElement.appendChild(item);

            // set attributes
            Attr attr = doc.createAttribute("type");
            attr.setValue("food");
            item.setAttributeNode(attr);

            // Create another one
            item = doc.createElement("item");
            rootElement.appendChild(item);

            // set attributes
            attr = doc.createAttribute("type");
            attr.setValue("drink");
            item.setAttributeNode(attr);

            // Write our DOM document out as XML
            // You don't need to understand this in detail at this stage, just that
            // it transform the DOM representation into an XML document
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("simpleoutput.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
