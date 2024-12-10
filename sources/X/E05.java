package X;

import org.xml.sax.SAXException;

public class E05 extends SAXException {
    public static E05 A00(String str) {
        return new E05(str);
    }

    public E05(String str, Exception exc) {
        super(str, exc);
    }

    public E05(String str) {
        super(str);
    }
}
