package X;

/* renamed from: X.9zC  reason: invalid class name and case insensitive filesystem */
public class C198959zC {
    public final AZ2 A00;

    public C29621ca A01(byte[] bArr) {
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[3];
        AZ2 az2 = this.A00;
        AnonymousClass8BV.A1M("key-type", az2.A03, r3);
        AnonymousClass8BV.A1N("key-version", az2.A04, r3);
        C17890vO.A12("provider", az2.A05, r3);
        return new C29621ca("pin", AZ2.A00(az2, bArr), r3);
    }

    public C198959zC(AZ2 az2) {
        this.A00 = az2;
    }

    public static void A00(C198959zC r4, C198169xt r5, AnonymousClass1O5 r6, byte[] bArr, AnonymousClass1MD[] r8) {
        r5.A02.A0I(r6, new C29621ca(r4.A01(bArr), "account", r8), "set", C20113A7w.A0L);
    }
}
