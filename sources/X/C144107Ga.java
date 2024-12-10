package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Ga  reason: invalid class name and case insensitive filesystem */
public final class C144107Ga implements C1606789m {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C35081lc A03;
    public final /* synthetic */ PublicKey A04;
    public final /* synthetic */ X509Certificate A05;

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A01.Bsw(exc);
    }

    public C144107Ga(C1606789m r1, AnonymousClass705 r2, C35081lc r3, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A03 = r3;
        this.A05 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public void BrA() {
        this.A01.BrA();
    }

    public void C7I(AnonymousClass732 r9) {
        C35081lc r1 = this.A03;
        X509Certificate x509Certificate = this.A05;
        C18070vi.A0b(r9);
        PublicKey publicKey = this.A04;
        r1.CBd(r9, this.A01, this.A02, Integer.valueOf(this.A00), publicKey, x509Certificate);
    }
}
