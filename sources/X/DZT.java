package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

public class DZT implements Attributes {
    public XmlPullParser A00;
    public final /* synthetic */ C26296Cx9 A01;

    public int getIndex(String str) {
        return -1;
    }

    public int getIndex(String str, String str2) {
        return -1;
    }

    public String getType(int i) {
        return null;
    }

    public String getType(String str) {
        return null;
    }

    public String getType(String str, String str2) {
        return null;
    }

    public String getValue(String str) {
        return null;
    }

    public String getValue(String str, String str2) {
        return null;
    }

    public DZT(C26296Cx9 cx9, XmlPullParser xmlPullParser) {
        this.A01 = cx9;
        this.A00 = xmlPullParser;
    }

    public int getLength() {
        return this.A00.getAttributeCount();
    }

    public String getLocalName(int i) {
        return this.A00.getAttributeName(i);
    }

    public String getQName(int i) {
        XmlPullParser xmlPullParser = this.A00;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(xmlPullParser.getAttributePrefix(i));
        return C17890vO.A0Z(attributeName, A10, ':');
    }

    public String getURI(int i) {
        return this.A00.getAttributeNamespace(i);
    }

    public String getValue(int i) {
        return this.A00.getAttributeValue(i);
    }
}
