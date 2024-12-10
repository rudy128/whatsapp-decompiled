package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.61h  reason: invalid class name and case insensitive filesystem */
public class C1178761h extends C144187Gi {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1178761h(AnonymousClass732 r1, C1606689l r2, C1606689l r3, C34991lS r4, AnonymousClass705 r5, int i) {
        super(r2);
        this.A00 = i;
        this.A01 = r4;
        this.A04 = r1;
        this.A02 = r3;
        this.A03 = r5;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i = this.A00;
        C34991lS r1 = (C34991lS) this.A01;
        AnonymousClass732 r6 = (AnonymousClass732) this.A04;
        C35021lW r3 = r6.A01;
        C35071lb A002 = ((C131566lJ) r1.A01.get()).A00(r3);
        AnonymousClass7GZ r7 = new AnonymousClass7GZ((C1606689l) this.A02, r3, r1.A02, r1.A00);
        AnonymousClass705 r8 = (AnonymousClass705) this.A03;
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        X509Certificate x509Certificate3 = x509Certificate;
        if (i != 0) {
            A002.CBd(r6, r7, r8, num2, publicKey2, x509Certificate3);
            return;
        }
        if (r8 == null) {
            r8 = AnonymousClass705.A00();
        }
        A002.CBe(r6, r7, r8, num2, publicKey2, x509Certificate3);
    }
}
