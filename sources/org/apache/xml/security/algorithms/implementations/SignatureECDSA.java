package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEA;
import X.C17880vN;
import X.C17890vO;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.utils.Base64;

public abstract class SignatureECDSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    public Signature d = null;

    public class SignatureECDSASHA1 extends SignatureECDSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1";
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.SignatureECDSA");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static byte[] c(byte[] bArr) {
        int length = bArr.length;
        if (length >= 48) {
            int i = length / 2;
            int i2 = i;
            while (i2 > 0 && bArr[i - i2] == 0) {
                i2--;
            }
            int i3 = i - i2;
            int i4 = i2;
            if (bArr[i3] < 0) {
                i4 = i2 + 1;
            }
            int i5 = i;
            while (i5 > 0 && bArr[(i * 2) - i5] == 0) {
                i5--;
            }
            int i6 = (i * 2) - i5;
            int i7 = i5;
            if (bArr[i6] < 0) {
                i7 = i5 + 1;
            }
            int i8 = i4 + 6 + i7;
            byte[] bArr2 = new byte[i8];
            bArr2[0] = 48;
            int i9 = i4 + 4;
            bArr2[1] = (byte) (i9 + i7);
            bArr2[2] = 2;
            bArr2[3] = (byte) i4;
            System.arraycopy(bArr, i3, bArr2, i9 - i2, i2);
            bArr2[i9] = 2;
            bArr2[i4 + 5] = (byte) i7;
            System.arraycopy(bArr, i6, bArr2, i8 - i5, i5);
            return bArr2;
        }
        throw C17880vN.A0f("Invalid XMLDSIG format of ECDSA signature");
    }

    public String a() {
        return this.d.getAlgorithm();
    }

    public String b() {
        return this.d.getProvider().getName();
    }

    public abstract String d();

    public void a(byte[] bArr, int i, int i2) {
        try {
            this.d.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw BE7.A0y(e);
        }
    }

    public boolean b(byte[] bArr) {
        try {
            byte[] c2 = c(bArr);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0s = BE6.A0s();
                A0s.append("Called ECDSA.verify() on ");
                BE9.A1I(Base64.b(bArr), A0s, log);
            }
            return this.d.verify(c2);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", (Exception) e);
        } catch (IOException e2) {
            throw new XMLSignatureException("empty", (Exception) e2);
        }
    }

    public SignatureECDSA() {
        Signature signature;
        String a2 = JCEMapper.a("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1");
        if (a.isDebugEnabled()) {
            BEA.A1O("Created SignatureECDSA using ", a2, BE6.A0s(), a);
        }
        String str = JCEMapper.e;
        if (str == null) {
            signature = Signature.getInstance(a2);
        } else {
            try {
                signature = Signature.getInstance(a2, str);
            } catch (NoSuchAlgorithmException e) {
                Object[] objArr = new Object[2];
                objArr[0] = a2;
                throw BE9.A10(e, objArr);
            } catch (NoSuchProviderException e2) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = a2;
                throw BE9.A10(e2, objArr2);
            }
        }
        this.d = signature;
    }

    public void a(Key key) {
        if (!(key instanceof PublicKey)) {
            String A0U = C17890vO.A0U(key);
            Class cls = c;
            if (cls == null) {
                cls = a("java.security.PublicKey");
                c = cls;
            }
            String name = cls.getName();
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(A0U, name, A1b);
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", A1b);
        }
        try {
            this.d.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            Signature signature = this.d;
            try {
                this.d = Signature.getInstance(signature.getAlgorithm());
            } catch (Exception e2) {
                if (a.isDebugEnabled()) {
                    BEA.A1J(e2, "Exception when reinstantiating Signature:", BE6.A0s(), a);
                }
                this.d = signature;
            }
            throw BE7.A0y(e);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }

    public void a(byte b2) {
        try {
            this.d.update(b2);
        } catch (SignatureException e) {
            throw BE7.A0y(e);
        }
    }

    public void a(byte[] bArr) {
        try {
            this.d.update(bArr);
        } catch (SignatureException e) {
            throw BE7.A0y(e);
        }
    }
}
