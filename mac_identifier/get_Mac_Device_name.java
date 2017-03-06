import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class get_Mac_Device_name
{
	public static void main(String[] args) throws Exception
	{
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File("../tracker_execute/nmap.xml"));
        NodeList nodeList = document.getElementsByTagName("address");
        String get_attr_addr = "";

        /*
         * Iterating the IP address and the mac address over the network
         */
        for(int x=0,size= nodeList.getLength(); x<size; x++)
        {
            get_attr_addr = get_attr_addr+nodeList.item(x).getAttributes().getNamedItem("addr").getNodeValue()+",";

        }

        /*
         * Iterating the nodelist to get the vendor names connected over the network
         */
        System.out.println("Vendors connected over the network.......");
        for(int y=1,size= nodeList.getLength(); y<size; y+=2)
        {
        	System.out.println("\t\t"+nodeList.item(y).getAttributes().getNamedItem("vendor").getNodeValue());
        }

        /*
         * Applying split function to seggregate the ip address and the mac address from the string
         */
        String[] segment = get_attr_addr.split(",");
        System.out.println("IP Adresses traced in the network .......");
        for(int i=0;i<segment.length;i+=2)
        {
        	System.out.println("\t\t"+segment[i]);
        }

        /*
         * Iterate the mac address from the segment array
         */
        System.out.println("MAC address for devices connected over the network .......");
        for(int i=1;i<segment.length;i+=2)
        {
        	System.out.println("\t\t"+segment[i]);
        }
    }
}
