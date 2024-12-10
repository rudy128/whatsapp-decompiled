package X;

import java.security.cert.CertificateExpiredException;

/* renamed from: X.31k  reason: invalid class name and case insensitive filesystem */
public class C679331k implements C22542BBz {
    public final /* synthetic */ C679431l A00;

    public C679331k(C679431l r1) {
        this.A00 = r1;
    }

    public void BrC(Exception exc) {
        this.A00.A02.Bsw(exc);
    }

    public void Bsw(Exception exc) {
        this.A00.A02.Bsw(exc);
    }

    public void C7n(Integer num, String str, String str2, String str3, String str4) {
        try {
            C679431l r0 = this.A00;
            C35041lY.A00(r0.A01, r0.A02, r0.A03, num, str, str2, str3, str4);
        } catch (CertificateExpiredException e) {
            this.A00.A02.Bsw(e);
        }
    }
}
