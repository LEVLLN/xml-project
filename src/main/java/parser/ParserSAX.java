package parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class ParserSAX implements ParserFactory {

    @Override
    public void getData() throws IOException, SAXException, ParserConfigurationException {
        javax.xml.parsers.SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setValidating(false);
        javax.xml.parsers.SAXParser sp = spf.newSAXParser();
        SAXHandler handler = new SAXHandler();
        //sp.parse(new File("resources/Publications.xml"), handler);

    }
}