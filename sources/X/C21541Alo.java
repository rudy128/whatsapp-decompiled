package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.Alo  reason: case insensitive filesystem */
public final /* synthetic */ class C21541Alo implements C18090vk {
    public final /* synthetic */ C1606789m A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ C144177Gh A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ PublicKey A04;
    public final /* synthetic */ X509Certificate A05;

    public final Object invoke() {
        C144177Gh r0 = this.A02;
        X509Certificate x509Certificate = this.A05;
        PublicKey publicKey = this.A04;
        r0.CBW(this.A00, this.A01, this.A03, publicKey, x509Certificate);
        return C27621Wu.A00;
    }

    public /* synthetic */ C21541Alo(C1606789m r1, AnonymousClass705 r2, C144177Gh r3, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A02 = r3;
        this.A05 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r1;
        this.A01 = r2;
    }
}
