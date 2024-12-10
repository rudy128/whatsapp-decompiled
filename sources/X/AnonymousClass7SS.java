package X;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7SS  reason: invalid class name */
public final class AnonymousClass7SS implements C22821Di {
    public final /* synthetic */ C1606789m A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ C144177Gh A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ KeyPair A05;
    public final /* synthetic */ PublicKey A06;
    public final /* synthetic */ X509Certificate A07;

    public AnonymousClass7SS(C1606789m r1, AnonymousClass705 r2, C144177Gh r3, Integer num, String str, KeyPair keyPair, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = keyPair;
        this.A04 = str;
        this.A01 = r2;
        this.A07 = x509Certificate;
        this.A06 = publicKey;
        this.A03 = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u r11 = (C1193567u) obj;
        C18070vi.A0d(r11, 0);
        C1606789m r1 = this.A00;
        C144177Gh r3 = this.A02;
        C1606789m r5 = r1;
        C144177Gh r6 = r3;
        r11.A00 = new AnonymousClass7SA(r5, r6, this.A04, this.A05, 0);
        AnonymousClass705 r2 = this.A01;
        X509Certificate x509Certificate = this.A07;
        r11.A01 = new C21534Alh((Object) r1, (Object) r2, (Object) r3, (Object) this.A03, (Object) this.A06, (Object) x509Certificate, 4);
        return C27621Wu.A00;
    }
}
