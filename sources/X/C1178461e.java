package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.61e  reason: invalid class name and case insensitive filesystem */
public class C1178461e extends C144187Gi {
    public final /* synthetic */ C1606689l A00;
    public final /* synthetic */ C34991lS A01;
    public final /* synthetic */ C35021lW A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1178461e(C1606689l r1, C1606689l r2, C34991lS r3, C35021lW r4) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C34991lS r1 = this.A01;
        C35021lW r3 = this.A02;
        ((C131566lJ) r1.A01.get()).A00(r3).CBW(new AnonymousClass7GZ(this.A00, r3, r1.A02, r1.A00), AnonymousClass705.A00(), num, publicKey, x509Certificate);
    }
}
