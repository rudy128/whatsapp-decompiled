package X;

/* renamed from: X.8X5  reason: invalid class name */
public final class AnonymousClass8X5 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X5() {
        super(C164638Zp.DEFAULT_INSTANCE);
    }

    public static C164638Zp A00(A4X a4x) {
        AnonymousClass8X5 r3 = (AnonymousClass8X5) C164638Zp.DEFAULT_INSTANCE.A0N();
        byte[] bArr = a4x.A02;
        r3.A0H(DSQ.A01(bArr, 0, bArr.length));
        r3.A0G(a4x.A00);
        return (C164638Zp) r3.A0C();
    }

    public void A0G(int i) {
        C164638Zp r1 = (C164638Zp) C17880vN.A0G(this);
        int i2 = C164638Zp.INDEX_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.index_ = i;
    }

    public void A0H(DSQ dsq) {
        C164638Zp r1 = (C164638Zp) C17880vN.A0G(this);
        int i = C164638Zp.INDEX_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.key_ = dsq;
    }
}
