package X;

import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;

/* renamed from: X.31l  reason: invalid class name and case insensitive filesystem */
public class C679431l implements C22542BBz {
    public final /* synthetic */ C61672q4 A00;
    public final /* synthetic */ C35021lW A01;
    public final /* synthetic */ C72383Ls A02;
    public final /* synthetic */ C35041lY A03;

    public C679431l(C61672q4 r1, C35021lW r2, C72383Ls r3, C35041lY r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BrC(Exception exc) {
        PublicKey publicKey;
        C61672q4 r5 = this.A00;
        C72383Ls r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                if (str == null) {
                    publicKey = null;
                } else {
                    publicKey = C20059A5i.A03(str);
                }
                r4.C7m(r5.A02, publicKey, x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.BrC(exc);
    }

    public void Bsw(Exception exc) {
        PublicKey publicKey;
        C61672q4 r5 = this.A00;
        C72383Ls r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                if (str == null) {
                    publicKey = null;
                } else {
                    publicKey = C20059A5i.A03(str);
                }
                r4.C7m(r5.A02, publicKey, x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.Bsw(exc);
    }

    public void C7n(Integer num, String str, String str2, String str3, String str4) {
        try {
            C35041lY.A00(this.A01, this.A02, this.A03, num, str, str2, str3, str4);
        } catch (CertificateExpiredException unused) {
            C35041lY r2 = this.A03;
            C35031lX r0 = r2.A01;
            C35021lW r1 = this.A01;
            r0.A03(r1);
            Object obj = ((C52172aU) r2.A02.get()).A00.get(r1);
            C17960vV.A07(obj);
            ((C72183Ky) ((C18140vp) obj).get()).BKz(new C679331k(this));
        }
    }
}
