package org.apache.xml.security.utils.resolver.implementations;

import X.AnonymousClass000;
import X.AnonymousClass8BV;
import X.BE6;
import X.BE8;
import X.BE9;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.IdResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ResolverXPointer extends ResourceResolverSpi {
    public static Log d = null;
    public static Class e = null;
    public static final int f = 13;

    static {
        Class c = c("org.apache.xml.security.utils.resolver.implementations.ResolverXPointer");
        e = c;
        d = LogFactory.getLog(c.getName());
    }

    public static String f(String str) {
        if (!str.startsWith("#xpointer(id(") || !str.endsWith("))")) {
            return null;
        }
        String substring = str.substring(f, str.length() - 2);
        int length = substring.length() - 1;
        if ((substring.charAt(0) == '\"' && substring.charAt(length) == '\"') || (substring.charAt(0) == '\'' && substring.charAt(length) == '\'')) {
            return substring.substring(1, length);
        }
        return null;
    }

    public boolean a() {
        return true;
    }

    public boolean b(Attr attr, String str) {
        if (attr != null) {
            String nodeValue = attr.getNodeValue();
            if (d(nodeValue) || e(nodeValue)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        return AnonymousClass000.A1O(str.equals("#xpointer(/)") ? 1 : 0);
    }

    public static boolean e(String str) {
        if (str.startsWith("#xpointer(id(") && str.endsWith("))")) {
            String substring = str.substring(f, str.length() - 2);
            int length = substring.length() - 1;
            if ((substring.charAt(0) == '\"' && substring.charAt(length) == '\"') || (substring.charAt(0) == '\'' && substring.charAt(length) == '\'')) {
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer A0s = BE6.A0s();
                    A0s.append("Id=");
                    BE9.A1I(substring.substring(1, length), A0s, log);
                }
                return true;
            }
        }
        return false;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }

    public XMLSignatureInput a(Attr attr, String str) {
        String nodeValue;
        Document ownerDocument = attr.getOwnerElement().getOwnerDocument();
        String nodeValue2 = attr.getNodeValue();
        Node node = ownerDocument;
        if (!d(nodeValue2)) {
            if (e(nodeValue2)) {
                String f2 = f(nodeValue2);
                Node a = IdResolver.a(ownerDocument, f2);
                node = a;
                if (a == null) {
                    throw new ResourceResolverException("signature.Verification.MissingID", AnonymousClass8BV.A1b(f2), attr, str);
                }
            } else {
                node = null;
            }
        }
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(node);
        xMLSignatureInput.m = "text/xml";
        if (str == null || str.length() <= 0) {
            nodeValue = attr.getNodeValue();
        } else {
            nodeValue = str.concat(attr.getNodeValue());
        }
        xMLSignatureInput.n = nodeValue;
        return xMLSignatureInput;
    }
}
