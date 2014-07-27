package parser;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SAXHandler {
    private static Logger LOGGER = Logger.getLogger(SAXHandler.class);
    public void startDocument() throws SAXException {

       LOGGER.info("Start");

    }

    public void endDocument() throws SAXException {
        LOGGER.info("End");
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        LOGGER.info(new String(ch, start, length));
           }
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("pub:publications"))LOGGER.info("Start element pub:publications");
        else LOGGER.info(qName + ":");
}

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("publications")) LOGGER.info("End of publications");
    }

    public void warning(SAXParseException e) throws SAXException {
        LOGGER.warn("WARNING: line " + e.getLineNumber() + ": "
                + e.getMessage());
    }
    public void error(SAXParseException e) throws SAXException {
        LOGGER.error("ERROR: line " + e.getLineNumber() + ": "
                + e.getMessage());
    }

    public void fatalError(SAXParseException e) throws SAXException {
        LOGGER.fatal("FATAL: line " + e.getLineNumber() + ": "
                + e.getMessage());
        throw (e);
    }



}
