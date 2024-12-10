package X;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: X.Cic  reason: case insensitive filesystem */
public class C25597Cic {
    public final int A00;
    public final PublicKey A01;
    public final CertPath A02;
    public final X509Certificate A03;
    public final Date A04;
    public final DU9 A05;

    public C25597Cic(PublicKey publicKey, CertPath certPath, X509Certificate x509Certificate, Date date, DU9 du9, int i) {
        this.A05 = du9;
        this.A04 = date;
        this.A02 = certPath;
        this.A00 = i;
        this.A03 = x509Certificate;
        this.A01 = publicKey;
    }

    public static CertPathValidatorException A00(String str, Throwable th, C25597Cic cic) {
        return new CertPathValidatorException(str, th, cic.A02, cic.A00);
    }
}
