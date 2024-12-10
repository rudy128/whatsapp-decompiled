package org.apache.xml.security.c14n;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.w3c.dom.Node;

public class Canonicalizer {
    public static boolean a;
    public static Map b;
    public CanonicalizerSpi c = null;

    public static final Canonicalizer a(String str) {
        return new Canonicalizer(str);
    }

    public static void a() {
        if (!a) {
            b = new HashMap(10);
            a = true;
        }
    }

    public static Class b(String str) {
        return (Class) b.get(str);
    }

    public byte[] a(Node node) {
        return this.c.a(node);
    }

    public byte[] a(Node node, String str) {
        return this.c.a(node, str);
    }

    public Canonicalizer(String str) {
        try {
            CanonicalizerSpi canonicalizerSpi = (CanonicalizerSpi) b(str).newInstance();
            this.c = canonicalizerSpi;
            canonicalizerSpi.a = true;
        } catch (Exception unused) {
            throw new InvalidCanonicalizerException("signature.Canonicalizer.UnknownCanonicalizer", AnonymousClass000.A1b(str, 1));
        }
    }

    public static void a(String str, String str2) {
        Class b2 = b(str);
        if (b2 == null) {
            try {
                b.put(str, Class.forName(str2));
            } catch (ClassNotFoundException unused) {
                throw AnonymousClass8BR.A0w("c14n class not found");
            }
        } else {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(str, b2, A1b);
            throw new AlgorithmAlreadyRegisteredException("algorithm.alreadyRegistered", A1b);
        }
    }

    public void a(OutputStream outputStream) {
        ((CanonicalizerBase) this.c).n = outputStream;
    }
}
