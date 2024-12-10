package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7QY  reason: invalid class name */
public final class AnonymousClass7QY implements Runnable {
    public final int A00;
    public final int A01;
    public final C1606789m A02;
    public final AnonymousClass705 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final PublicKey A07;
    public final X509Certificate A08;
    public final /* synthetic */ C35081lc A09;

    public AnonymousClass7QY(C1606789m r2, AnonymousClass705 r3, C35081lc r4, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate, int i, int i2) {
        C18070vi.A0d(publicKey, 3);
        this.A09 = r4;
        this.A08 = x509Certificate;
        this.A07 = publicKey;
        this.A01 = i;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i2;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public void run() {
        C35081lc r1 = this.A09;
        X509Certificate x509Certificate = this.A08;
        PublicKey publicKey = this.A07;
        Integer valueOf = Integer.valueOf(this.A01);
        r1.A0C(this.A02, this.A03, valueOf, this.A06, this.A05, this.A04, publicKey, x509Certificate, this.A00);
    }
}
