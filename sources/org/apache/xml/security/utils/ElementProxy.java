package org.apache.xml.security.utils;

import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BX;
import X.BE6;
import X.BE8;
import X.BE9;
import X.C17880vN;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ElementProxy {
    public static Log j;
    public static HashMap n = C17880vN.A11();
    public static HashMap o = C17880vN.A11();
    public static Class p;
    public Element k = null;
    public String l = null;
    public Document m = null;

    public ElementProxy() {
    }

    public String b(String str, String str2) {
        return ((CharacterData) XMLUtils.a(this.k.getFirstChild(), str2, str, 0).getFirstChild()).getData();
    }

    public abstract String d();

    public abstract String e();

    public final Element k() {
        return this.k;
    }

    public String l() {
        return this.l;
    }

    public byte[] n() {
        return Base64.a(XMLUtils.a(this.k));
    }

    public String o() {
        return XMLUtils.a(this.k);
    }

    static {
        Class c = c("org.apache.xml.security.utils.ElementProxy");
        p = c;
        j = LogFactory.getLog(c.getName());
    }

    public static void d(String str, String str2) {
        if (n.containsValue(str2)) {
            Object obj = n.get(str);
            if (!obj.equals(str2)) {
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass8BX.A1K(str2, str, obj, A1a);
                throw new XMLSecurityException("prefix.AlreadyAssigned", A1a);
            }
        }
        if ("http://www.w3.org/2000/09/xmldsig#".equals(str)) {
            XMLUtils.a = str2;
        }
        if ("http://www.w3.org/2001/04/xmlenc#".equals(str)) {
            XMLUtils.b = str2;
        }
        n.put(str, str2.intern());
        if (str2.length() == 0) {
            o.put(str, "xmlns");
        } else {
            o.put(str, BE9.A0p("xmlns:", str2, BE6.A0s()).intern());
        }
    }

    public int c(String str, String str2) {
        int i = 0;
        for (Node firstChild = this.k.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (str2.equals(firstChild.getLocalName()) && BE8.A1a(str, firstChild)) {
                i++;
            }
        }
        return i;
    }

    public ElementProxy(Element element, String str) {
        if (element != null) {
            if (j.isDebugEnabled()) {
                Log log = j;
                StringBuffer A0s = BE6.A0s();
                A0s.append("setElement(\"");
                A0s.append(element.getTagName());
                A0s.append("\", \"");
                A0s.append(str);
                BE9.A1I("\")", A0s, log);
            }
            this.m = element.getOwnerDocument();
            this.k = element;
            this.l = str;
            m();
            return;
        }
        throw new XMLSecurityException("ElementProxy.nullElement");
    }

    public void m() {
        String e = e();
        String d = d();
        String localName = this.k.getLocalName();
        String namespaceURI = this.k.getNamespaceURI();
        if (!d.equals(namespaceURI) && !e.equals(localName)) {
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = BE9.A0p(":", localName, BE8.A0i(namespaceURI));
            A1b[1] = BE9.A0p(":", e, BE8.A0i(d));
            throw new XMLSecurityException("xml.WrongElement", A1b);
        }
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }
}
