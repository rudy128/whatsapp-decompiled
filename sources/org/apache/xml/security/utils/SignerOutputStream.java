package org.apache.xml.security.utils;

import X.BE6;
import X.BE8;
import java.io.ByteArrayOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.signature.XMLSignatureException;

public class SignerOutputStream extends ByteArrayOutputStream {
    public static Log b;
    public static Class c;
    public final SignatureAlgorithm a;

    static {
        Class a2 = a("org.apache.xml.security.utils.SignerOutputStream");
        c = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public SignerOutputStream(SignatureAlgorithm signatureAlgorithm) {
        this.a = signatureAlgorithm;
    }

    public void write(byte[] bArr, int i, int i2) {
        if (b.isDebugEnabled()) {
            b.debug("Canonicalized SignedInfo:");
            StringBuffer stringBuffer = new StringBuffer(i2);
            for (int i3 = i; i3 < i + i2; i3++) {
                stringBuffer.append((char) bArr[i3]);
            }
            b.debug(stringBuffer.toString());
        }
        try {
            this.a.a(bArr, i, i2);
        } catch (XMLSignatureException e) {
            StringBuffer A0s = BE6.A0s();
            A0s.append("");
            A0s.append(e);
            throw BE8.A0f(A0s);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }

    public void write(int i) {
        try {
            this.a.a((byte) i);
        } catch (XMLSignatureException e) {
            StringBuffer A0s = BE6.A0s();
            A0s.append("");
            A0s.append(e);
            throw BE8.A0f(A0s);
        }
    }

    public void write(byte[] bArr) {
        try {
            this.a.a(bArr);
        } catch (XMLSignatureException e) {
            StringBuffer A0s = BE6.A0s();
            A0s.append("");
            A0s.append(e);
            throw BE8.A0f(A0s);
        }
    }
}
