
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="genre">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fantastic"/>
 *     &lt;enumeration value="Utopia"/>
 *     &lt;enumeration value="Anti-Utopia"/>
 *     &lt;enumeration value="Romance"/>
 *     &lt;enumeration value="Story"/>
 *     &lt;enumeration value="Epos"/>
 *     &lt;enumeration value="Biography"/>
 *     &lt;enumeration value="Autobiography"/>
 *     &lt;enumeration value="History"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genre")
@XmlEnum
public enum Genre {

    @XmlEnumValue("Fantastic")
    FANTASTIC("Fantastic"),
    @XmlEnumValue("Utopia")
    UTOPIA("Utopia"),
    @XmlEnumValue("Anti-Utopia")
    ANTI_UTOPIA("Anti-Utopia"),
    @XmlEnumValue("Romance")
    ROMANCE("Romance"),
    @XmlEnumValue("Story")
    STORY("Story"),
    @XmlEnumValue("Epos")
    EPOS("Epos"),
    @XmlEnumValue("Biography")
    BIOGRAPHY("Biography"),
    @XmlEnumValue("Autobiography")
    AUTOBIOGRAPHY("Autobiography"),
    @XmlEnumValue("History")
    HISTORY("History");
    private final String value;

    Genre(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Genre fromValue(String v) {
        for (Genre c: Genre.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
