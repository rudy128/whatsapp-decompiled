package org.apache.xml.security.utils.resolver;

import X.AnonymousClass3MW;
import X.AnonymousClass8BS;
import X.BE6;
import X.BE8;
import X.BE9;
import X.BEA;
import X.C17880vN;
import X.C17890vO;
import X.C72463Mc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

public class ResourceResolver {
    public static Log a = null;
    public static boolean b = false;
    public static List c = null;
    public static boolean d = true;
    public static Class f;
    public ResourceResolverSpi e;

    static {
        Class b2 = b("org.apache.xml.security.utils.resolver.ResourceResolver");
        f = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public ResourceResolver(String str) {
        this.e = null;
        this.e = (ResourceResolverSpi) Class.forName(str).newInstance();
    }

    public ResourceResolver(ResourceResolverSpi resourceResolverSpi) {
        this.e = resourceResolverSpi;
    }

    public static void a(String str) {
        a(str, false);
    }

    private boolean c(Attr attr, String str) {
        return this.e.b(attr, str);
    }

    public void a(Map map) {
        this.e.a(map);
    }

    public XMLSignatureInput b(Attr attr, String str) {
        return this.e.a(attr, str);
    }

    public static final ResourceResolver a(Attr attr, String str, List list) {
        int size;
        int i = 0;
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0s = BE6.A0s();
            A0s.append("I was asked to create a ResourceResolver and got ");
            A0s.append(C72463Mc.A0C(list));
            log.debug(A0s.toString());
            Log log2 = a;
            StringBuffer A0s2 = BE6.A0s();
            A0s2.append(" extra resolvers to my existing ");
            A0s2.append(c.size());
            BE9.A1I(" system-wide resolvers", A0s2, log2);
        }
        if (list == null || (size = list.size()) <= 0) {
            return a(attr, str);
        }
        do {
            ResourceResolver resourceResolver = (ResourceResolver) list.get(i);
            if (resourceResolver != null) {
                String A0U = C17890vO.A0U(resourceResolver.e);
                if (a.isDebugEnabled()) {
                    BEA.A1O("check resolvability by class ", A0U, BE6.A0s(), a);
                }
                if (resourceResolver.e.b(attr, str)) {
                    return resourceResolver;
                }
            }
            i++;
        } while (i < size);
        return a(attr, str);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }

    public static final ResourceResolver a(Attr attr, String str) {
        String str2;
        int size = c.size();
        for (int i = 0; i < size; i++) {
            ResourceResolver resourceResolver = (ResourceResolver) c.get(i);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0s = BE6.A0s();
                A0s.append("check resolvability by class ");
                BE9.A1I(C17890vO.A0U(resourceResolver.e), A0s, log);
            } else if (resourceResolver == null) {
                continue;
            }
            if (resourceResolver.e.b(attr, str)) {
                if (i != 0) {
                    List list = (List) ((ArrayList) c).clone();
                    list.remove(i);
                    list.add(0, resourceResolver);
                    c = list;
                }
                return resourceResolver;
            }
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        if (attr != null) {
            str2 = attr.getNodeValue();
        } else {
            str2 = "null";
        }
        AnonymousClass8BS.A1B(str2, str, A1b);
        throw new ResourceResolverException("utils.resolver.noClass", A1b, attr, str);
    }

    public static void a(String str, boolean z) {
        try {
            ResourceResolver resourceResolver = new ResourceResolver(str);
            if (z) {
                c.add(0, resourceResolver);
                a.debug("registered resolver");
                return;
            }
            c.add(resourceResolver);
        } catch (Exception | NoClassDefFoundError unused) {
            a.warn(BE9.A0p(str, " disabling it", BE8.A0i("Error loading resolver ")));
        }
    }

    public static void a() {
        if (!b) {
            c = C17880vN.A0z(10);
            b = true;
        }
    }
}
