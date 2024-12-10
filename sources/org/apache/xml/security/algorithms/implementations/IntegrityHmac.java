package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BEA;
import X.C17890vO;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public abstract class IntegrityHmac extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class c;
    public static Class d;
    public int b = 0;
    public Mac e = null;
    public boolean f = false;

    public class IntegrityHmacMD5 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-md5";
        }

        public int e() {
            return 128;
        }
    }

    public class IntegrityHmacRIPEMD160 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160";
        }

        public int e() {
            return 160;
        }
    }

    public class IntegrityHmacSHA1 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2000/09/xmldsig#hmac-sha1";
        }

        public int e() {
            return 160;
        }
    }

    public class IntegrityHmacSHA256 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256";
        }

        public int e() {
            return 256;
        }
    }

    public class IntegrityHmacSHA384 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384";
        }

        public int e() {
            return 384;
        }
    }

    public class IntegrityHmacSHA512 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512";
        }

        public int e() {
            return 512;
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA1");
        c = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String a() {
        a.debug("engineGetJCEAlgorithmString()");
        return this.e.getAlgorithm();
    }

    public String b() {
        return this.e.getProvider().getName();
    }

    public void c() {
        this.b = 0;
        this.f = false;
        this.e.reset();
    }

    public abstract String d();

    public abstract int e();

    public void a(byte[] bArr, int i, int i2) {
        try {
            this.e.update(bArr, i, i2);
        } catch (IllegalStateException e2) {
            throw BE7.A0y(e2);
        }
    }

    public boolean b(byte[] bArr) {
        int e2;
        try {
            if (!this.f || this.b >= (e2 = e())) {
                byte[] doFinal = this.e.doFinal();
                ThreadLocal threadLocal = MessageDigestAlgorithm.b;
                return MessageDigest.isEqual(doFinal, bArr);
            }
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0s = BE6.A0s();
                A0s.append("HMACOutputLength must not be less than ");
                A0s.append(e2);
                log.debug(A0s.toString());
            }
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = String.valueOf(e2);
            throw new XMLSignatureException("algorithms.HMACOutputLengthMin", A1a);
        } catch (IllegalStateException e3) {
            throw BE7.A0y(e3);
        }
    }

    public IntegrityHmac() {
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            BEA.A1O("Created IntegrityHmacSHA1 using ", a2, BE6.A0s(), a);
        }
        try {
            this.e = Mac.getInstance(a2);
        } catch (NoSuchAlgorithmException e2) {
            Object[] A1b = AnonymousClass3MX.A1b(a2, 0);
            A1b[1] = e2.getLocalizedMessage();
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", A1b);
        }
    }

    public void a(Key key) {
        if (!(key instanceof SecretKey)) {
            String A0U = C17890vO.A0U(key);
            Class cls = d;
            if (cls == null) {
                cls = a("javax.crypto.SecretKey");
                d = cls;
            }
            String name = cls.getName();
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(A0U, name, A1b);
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", A1b);
        }
        try {
            this.e.init(key);
        } catch (InvalidKeyException e2) {
            Mac mac = this.e;
            try {
                this.e = Mac.getInstance(mac.getAlgorithm());
            } catch (Exception e3) {
                if (a.isDebugEnabled()) {
                    BEA.A1J(e3, "Exception when reinstantiating Mac:", BE6.A0s(), a);
                }
                this.e = mac;
            }
            throw BE7.A0y(e2);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }

    public void a(Element element) {
        if (element != null) {
            Text b2 = XMLUtils.b(element.getFirstChild(), "HMACOutputLength", 0);
            if (b2 != null) {
                this.b = Integer.parseInt(b2.getData());
                this.f = true;
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("element null");
    }

    public void a(byte b2) {
        try {
            this.e.update(b2);
        } catch (IllegalStateException e2) {
            throw BE7.A0y(e2);
        }
    }

    public void a(byte[] bArr) {
        try {
            this.e.update(bArr);
        } catch (IllegalStateException e2) {
            throw BE7.A0y(e2);
        }
    }
}
