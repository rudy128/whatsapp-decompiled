package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6O8  reason: invalid class name */
public final class AnonymousClass6O8 extends C144197Gj {
    public final /* synthetic */ C1606789m A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ C1418477e A02;
    public final /* synthetic */ C1418477e A03;
    public final /* synthetic */ C1418477e A04;
    public final /* synthetic */ C1418477e A05;
    public final /* synthetic */ C1418477e A06;
    public final /* synthetic */ C1418477e A07;
    public final /* synthetic */ C35081lc A08;
    public final /* synthetic */ Integer A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6O8(C1606789m r1, AnonymousClass705 r2, C1418477e r3, C1418477e r4, C1418477e r5, C1418477e r6, C1418477e r7, C1418477e r8, C35081lc r9, Integer num) {
        super(r1);
        this.A00 = r1;
        this.A08 = r9;
        this.A02 = r3;
        this.A09 = num;
        this.A04 = r4;
        this.A03 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r8;
        this.A01 = r2;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        X509Certificate x509Certificate3 = x509Certificate;
        C18070vi.A0h(x509Certificate3, x509Certificate2);
        C35081lc r8 = this.A08;
        C1418477e r2 = this.A02;
        Integer num2 = this.A09;
        C18070vi.A0b(publicKey);
        int A032 = AnonymousClass3MY.A03(num);
        C35081lc.A04(this.A00, this.A01, r2, this.A04, this.A03, this.A06, this.A07, this.A05, r8, num2, publicKey, x509Certificate3, A032);
    }
}
