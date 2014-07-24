package parser;

import entity.AuthorsListType;
import entity.GenreType;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParserSAX extends DefaultHandler {
    StringBuffer accumulator = new StringBuffer();
    String title;
    AuthorsListType authorsListType;
    GenreType genreType;
    Date dateType = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
    int authorId;
    int publicationId;

    public void endDocument() throws SAXException {
        System.out.println("Parsing ended");
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        accumulator.setLength(0);
        if (qName.equals("publication"))
            publicationId = Integer.parseInt(attributes.getValue("publicationId"));

    }


}
