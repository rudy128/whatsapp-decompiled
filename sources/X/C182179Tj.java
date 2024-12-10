package X;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;

/* renamed from: X.9Tj  reason: invalid class name and case insensitive filesystem */
public abstract class C182179Tj {
    public static Certificate A00;

    static {
        try {
            A00 = C20010A3a.A01("signer.crt");
        } catch (CertificateException unused) {
        }
    }
}
