package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.31m  reason: invalid class name and case insensitive filesystem */
public final class C679531m implements C72383Ls {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C57632jO A01;
    public final /* synthetic */ C35091ld A02;

    public void BrC(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A01.A00(exc);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A01.A00(exc);
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        X509Certificate x509Certificate3 = x509Certificate;
        C18070vi.A0d(x509Certificate3, 0);
        PublicKey publicKey2 = publicKey;
        if (publicKey == null || num == null) {
            this.A01.A00(AnonymousClass000.A0n("passwordPublicKey or passwordKeyId is null"));
            return;
        }
        C35091ld r1 = this.A02;
        AnonymousClass732 A022 = r1.A00.A02();
        if (A022 == null) {
            this.A01.A00(AnonymousClass000.A0n("waffle user is null"));
            return;
        }
        C35081lc r8 = r1.A02;
        long j = this.A00;
        int intValue = num.intValue();
        new AnonymousClass705(3, C20113A7w.A0L);
        C35081lc.A03(A022, new C70353As(this.A01), r8, Long.valueOf(j), "md_auth_at", publicKey2, x509Certificate3, intValue);
    }

    public C679531m(C57632jO r1, C35091ld r2, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }
}
