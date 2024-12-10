package X;

import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Cri  reason: case insensitive filesystem */
public abstract class C26068Cri {
    public static C28324DxW A00(Object obj) {
        if (obj instanceof X509Certificate) {
            return A01((X509Certificate) obj);
        }
        throw AnonymousClass000.A0s("getIssuer");
    }

    public static C28324DxW A01(X509Certificate x509Certificate) {
        if (x509Certificate instanceof E3Q) {
            C28324DxW dxW = ((C27283DbC) ((E3Q) x509Certificate)).c.A03.A05;
            if (dxW != null) {
                return dxW;
            }
            throw BE6.A0k();
        } else if (x509Certificate != null) {
            return A03(x509Certificate.getIssuerX500Principal());
        } else {
            throw BE6.A0k();
        }
    }

    public static C28324DxW A02(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof E3Q)) {
            return A03(x509Certificate.getSubjectX500Principal());
        }
        C28324DxW dxW = ((C27283DbC) ((E3Q) x509Certificate)).c.A03.A06;
        if (dxW != null) {
            return dxW;
        }
        throw BE6.A0k();
    }

    public static C28324DxW A03(X500Principal x500Principal) {
        if (x500Principal != null) {
            byte[] encoded = x500Principal.getEncoded();
            if (encoded != null) {
                C28324DxW A01 = C28324DxW.A01(encoded);
                if (A01 != null) {
                    return A01;
                }
                throw BE6.A0k();
            }
            throw BE6.A0k();
        }
        throw BE6.A0k();
    }
}
