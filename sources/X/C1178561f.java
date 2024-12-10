package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.61f  reason: invalid class name and case insensitive filesystem */
public class C1178561f extends C144187Gi {
    public final /* synthetic */ C1606689l A00;
    public final /* synthetic */ C34991lS A01;
    public final /* synthetic */ C35021lW A02;
    public final /* synthetic */ AnonymousClass705 A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1178561f(C1606689l r1, C1606689l r2, C34991lS r3, C35021lW r4, AnonymousClass705 r5, String str) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = str;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C34991lS r1 = this.A01;
        C35021lW r3 = this.A02;
        C35071lb A002 = ((C131566lJ) r1.A01.get()).A00(r3);
        AnonymousClass732 A003 = r1.A00(r3);
        AnonymousClass7GZ r6 = new AnonymousClass7GZ(this.A00, r3, r1.A02, r1.A00);
        AnonymousClass705 r7 = this.A03;
        if (r7 == null) {
            r7 = AnonymousClass705.A00();
        }
        A002.CBb(A003, r6, r7, num, this.A04, publicKey, x509Certificate);
    }
}
