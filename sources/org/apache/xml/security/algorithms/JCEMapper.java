package org.apache.xml.security.algorithms;

import X.BE6;
import X.BE8;
import X.BEA;
import X.C17880vN;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

public class JCEMapper {
    public static Log a;
    public static Class b;
    public static Map c;
    public static Map d;
    public static String e = null;

    public class Algorithm {
        public String a;
        public String b;
        public String c;

        public Algorithm(Element element) {
            this.a = element.getAttribute("AlgorithmClass");
            this.b = element.getAttribute("KeyLength");
            this.c = element.getAttribute("RequiredKey");
        }
    }

    static {
        Class b2 = b("org.apache.xml.security.algorithms.JCEMapper");
        b = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public static String a() {
        return e;
    }

    public static void a(Element element) {
        b((Element) element.getElementsByTagName("Algorithms").item(0));
    }

    public static void b(Element element) {
        int i = r5 * 2;
        c = new HashMap(i);
        d = new HashMap(i);
        for (Element element2 : XMLUtils.a(element.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "Algorithm")) {
            String attribute = element2.getAttribute("URI");
            c.put(attribute, element2.getAttribute("JCEName"));
            d.put(attribute, new Algorithm(element2));
        }
    }

    public static String a(String str) {
        if (a.isDebugEnabled()) {
            BEA.A1O("Request for URI ", str, BE6.A0s(), a);
        }
        return C17880vN.A0s(str, c);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }
}
