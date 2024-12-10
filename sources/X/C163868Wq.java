package X;

/* renamed from: X.8Wq  reason: invalid class name and case insensitive filesystem */
public final class C163868Wq extends C23624Bmt implements C22356B4k {
    public C163868Wq() {
        super(C166308cg.DEFAULT_INSTANCE);
    }

    public void A0G(long j) {
        C166308cg r1 = (C166308cg) C17880vN.A0G(this);
        int i = C166308cg.EXTRA_GUEST_COUNT_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.timestampMs_ = j;
    }

    public void A0H(AnonymousClass9K9 r3) {
        C166308cg r1 = (C166308cg) C17880vN.A0G(this);
        int i = C166308cg.EXTRA_GUEST_COUNT_FIELD_NUMBER;
        r1.response_ = r3.value;
        r1.bitField0_ |= 1;
    }
}
