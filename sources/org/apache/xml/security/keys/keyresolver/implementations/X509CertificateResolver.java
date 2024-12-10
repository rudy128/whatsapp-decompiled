package org.apache.xml.security.keys.keyresolver.implementations;

import X.BE8;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.keyresolver.KeyResolverSpi;

public class X509CertificateResolver extends KeyResolverSpi {
    public static Log c;
    public static Class d;

    static {
        Class a = a("org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver");
        d = a;
        c = LogFactory.getLog(a.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }
}
