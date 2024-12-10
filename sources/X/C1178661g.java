package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.61g  reason: invalid class name and case insensitive filesystem */
public class C1178661g extends C144187Gi {
    public final /* synthetic */ C1606689l A00;
    public final /* synthetic */ C34991lS A01;
    public final /* synthetic */ C35021lW A02;
    public final /* synthetic */ AnonymousClass705 A03;
    public final /* synthetic */ Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1178661g(C1606689l r1, C1606689l r2, C34991lS r3, C35021lW r4, AnonymousClass705 r5, Object obj) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = obj;
        this.A00 = r2;
        this.A03 = r5;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C34991lS r1 = this.A01;
        C35021lW r3 = this.A02;
        C35071lb A002 = ((C131566lJ) r1.A01.get()).A00(r3);
        Object obj = this.A04;
        AnonymousClass7GZ r5 = new AnonymousClass7GZ(this.A00, r3, r1.A02, r1.A00);
        AnonymousClass705 r6 = this.A03;
        if (r6 == null) {
            r6 = AnonymousClass705.A00();
        }
        A002.CBY(r5, r6, num, obj, publicKey, x509Certificate);
    }
}
