package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6O6  reason: invalid class name */
public class AnonymousClass6O6 extends C144197Gj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6O6(AnonymousClass732 r1, C1606789m r2, AnonymousClass705 r3, C35081lc r4, int i) {
        super(r2);
        this.A00 = i;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r1;
        this.A02 = r3;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i = this.A00;
        X509Certificate x509Certificate3 = x509Certificate;
        C18070vi.A0d(x509Certificate3, 0);
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        switch (i) {
            case 0:
                AnonymousClass732 r0 = (AnonymousClass732) this.A03;
                C1418477e r3 = r0.A04;
                C18070vi.A0X(r3);
                C1606789m r1 = (C1606789m) this.A01;
                String A0m = C108985cd.A0m(r0.A05);
                C18070vi.A0b(publicKey2);
                int A032 = AnonymousClass3MY.A03(num2);
                C35081lc.A05(r1, (AnonymousClass705) this.A02, r3, (C35081lc) this.A04, A0m, publicKey2, x509Certificate3, A032);
                return;
            case 1:
                ((C35081lc) this.A04).CBd((AnonymousClass732) this.A03, (C1606789m) this.A01, (AnonymousClass705) this.A02, num2, publicKey2, x509Certificate3);
                return;
            case 2:
            case 3:
                C18070vi.A0b(publicKey2);
                int A033 = AnonymousClass3MY.A03(num2);
                ((C35081lc) this.A04).A0A((AnonymousClass732) this.A03, (C1606789m) this.A01, (AnonymousClass705) this.A02, publicKey2, x509Certificate3, A033);
                return;
            default:
                ((C35081lc) this.A04).CBe((AnonymousClass732) this.A03, (C1606789m) this.A01, (AnonymousClass705) this.A02, num2, publicKey2, x509Certificate3);
                return;
        }
    }
}
