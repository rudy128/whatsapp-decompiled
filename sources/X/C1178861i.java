package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.61i  reason: invalid class name and case insensitive filesystem */
public class C1178861i extends C144187Gi {
    public final /* synthetic */ C1606689l A00;
    public final /* synthetic */ C34991lS A01;
    public final /* synthetic */ C35021lW A02;
    public final /* synthetic */ AnonymousClass705 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1178861i(C1606689l r1, C1606689l r2, C34991lS r3, C35021lW r4, AnonymousClass705 r5, Integer num, String str, String str2, String str3) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = num;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C34991lS r1 = this.A01;
        C35021lW r3 = this.A02;
        C35071lb A002 = ((C131566lJ) r1.A01.get()).A00(r3);
        AnonymousClass7GZ r5 = new AnonymousClass7GZ(this.A00, r3, r1.A02, r1.A00);
        AnonymousClass705 r6 = this.A03;
        if (r6 == null) {
            r6 = AnonymousClass705.A00();
        }
        A002.CBX(r5, r6, num, this.A04, this.A07, this.A06, this.A05, publicKey, x509Certificate);
    }
}
