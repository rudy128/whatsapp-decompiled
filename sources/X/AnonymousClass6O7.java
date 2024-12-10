package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6O7  reason: invalid class name */
public final class AnonymousClass6O7 extends C144197Gj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C35081lc A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C18070vi.A0d(x509Certificate, 0);
        C35081lc r0 = this.A03;
        C1606789m r1 = this.A01;
        AnonymousClass705 r2 = this.A02;
        int i = this.A00;
        Integer num2 = num;
        r0.A0C(r1, r2, num2, this.A06, this.A05, this.A04, publicKey, x509Certificate, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6O7(C1606789m r1, AnonymousClass705 r2, C35081lc r3, String str, String str2, String str3, int i) {
        super(r1);
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
    }
}
