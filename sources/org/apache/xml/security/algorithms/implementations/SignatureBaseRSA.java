package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEA;
import X.C17890vO;
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

public abstract class SignatureBaseRSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    public Signature d = null;

    public class SignatureRSAMD5 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-md5";
        }
    }

    public class SignatureRSARIPEMD160 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160";
        }
    }

    public class SignatureRSASHA1 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
        }
    }

    public class SignatureRSASHA256 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
        }
    }

    public class SignatureRSASHA384 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384";
        }
    }

    public class SignatureRSASHA512 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512";
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.SignatureBaseRSA");
        b = a2;
        a = LogFactory.getLog(a2.getName());
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
            return this.d.verify(bArr);
        } catch (SignatureException e) {
            throw BE7.A0y(e);
        }
    }

    public SignatureBaseRSA() {
        Signature signature;
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            BEA.A1O("Created SignatureRSA using ", a2, BE6.A0s(), a);
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
