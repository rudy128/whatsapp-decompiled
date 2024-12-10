package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6O5  reason: invalid class name */
public final class AnonymousClass6O5 extends C144197Gj {
    public final /* synthetic */ AnonymousClass732 A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ C35081lc A02;

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C18070vi.A0d(x509Certificate, 0);
        C18070vi.A0b(publicKey);
        int A03 = AnonymousClass3MY.A03(num);
        AnonymousClass705 r6 = new AnonymousClass705(0, C20113A7w.A0L);
        C1606789m r5 = this.A01;
        this.A02.A0A(this.A00, r5, r6, publicKey, x509Certificate, A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6O5(AnonymousClass732 r1, C1606789m r2, C35081lc r3) {
        super(r2);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
