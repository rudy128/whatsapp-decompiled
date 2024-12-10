package org.apache.xml.security.keys.content;

import X.AnonymousClass04E;
import X.BE8;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;

public abstract class X509Data extends SignatureElementProxy implements KeyInfoContent {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.keys.content.X509Data");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String e() {
        throw AnonymousClass04E.createAndThrow();
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }
}
