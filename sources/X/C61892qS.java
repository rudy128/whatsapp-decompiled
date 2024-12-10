package X;

/* renamed from: X.2qS  reason: invalid class name and case insensitive filesystem */
public class C61892qS {
    public final AnonymousClass2BQ A00;

    public C53262cF A00() {
        try {
            AnonymousClass2BQ r1 = this.A00;
            return new C53262cF(new C58242kN(r1.privateKey_.A06()), C63962tz.A01(r1.publicKey_.A06()));
        } catch (C22511Ak e) {
            throw new AssertionError(e);
        }
    }

    public C61892qS(byte[] bArr) {
        this.A00 = (AnonymousClass2BQ) C23577Bm6.A07(AnonymousClass2BQ.DEFAULT_INSTANCE, bArr);
    }

    public C61892qS(C53262cF r5, byte[] bArr, int i, long j) {
        C45672Az r3 = (C45672Az) AnonymousClass2BQ.DEFAULT_INSTANCE.A0N();
        r3.A0G(i);
        byte[] A002 = r5.A01.A00();
        r3.A0J(DSQ.A01(A002, 0, A002.length));
        byte[] bArr2 = r5.A00.A00;
        r3.A0I(DSQ.A01(bArr2, 0, bArr2.length));
        r3.A0K(DSQ.A01(bArr, 0, bArr.length));
        r3.A0H(j);
        this.A00 = (AnonymousClass2BQ) r3.A0C();
    }
}
