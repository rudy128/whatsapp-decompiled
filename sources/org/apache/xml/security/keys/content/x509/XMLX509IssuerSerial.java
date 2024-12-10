package org.apache.xml.security.keys.content.x509;

import X.AnonymousClass04E;
import X.BE8;
import java.math.BigInteger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;

public abstract class XMLX509IssuerSerial extends SignatureElementProxy implements XMLX509DataContent {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public abstract BigInteger a();

    public abstract String b();

    public String e() {
        throw AnonymousClass04E.createAndThrow();
    }

    public boolean equals(Object obj) {
        throw AnonymousClass04E.createAndThrow();
    }

    public int hashCode() {
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
