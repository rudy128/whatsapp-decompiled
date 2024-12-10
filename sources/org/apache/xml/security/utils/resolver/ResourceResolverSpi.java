package org.apache.xml.security.utils.resolver;

import X.BE8;
import X.C17880vN;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

public abstract class ResourceResolverSpi {
    public static Log a;
    public static Class c;
    public Map b = null;

    static {
        Class b2 = b("org.apache.xml.security.utils.resolver.ResourceResolverSpi");
        c = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public abstract XMLSignatureInput a(Attr attr, String str);

    public abstract boolean a();

    public abstract boolean b(Attr attr, String str);

    public void a(Map map) {
        if (map != null) {
            Map map2 = this.b;
            if (map2 == null) {
                map2 = C17880vN.A11();
                this.b = map2;
            }
            map2.putAll(map);
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }

    public String a(String str) {
        Map map = this.b;
        if (map == null) {
            return null;
        }
        return C17880vN.A0s(str, map);
    }
}
