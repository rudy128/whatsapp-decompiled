package X;

/* renamed from: X.8Wz  reason: invalid class name and case insensitive filesystem */
public final class C163958Wz extends C23624Bmt implements C22356B4k {
    public C163958Wz() {
        super(C166328ci.DEFAULT_INSTANCE);
    }

    @Deprecated
    public void A0G(AnonymousClass9K8 r3) {
        C166328ci r1 = (C166328ci) C17880vN.A0G(this);
        int i = C166328ci.INITIATED_BY_ME_FIELD_NUMBER;
        r1.initiator_ = r3.value;
        r1.bitField0_ |= 1;
    }

    public void A0H(AnonymousClass9KQ r3) {
        C166328ci r1 = (C166328ci) C17880vN.A0G(this);
        int i = C166328ci.INITIATED_BY_ME_FIELD_NUMBER;
        r1.trigger_ = r3.value;
        r1.bitField0_ |= 2;
    }

    public void A0I(boolean z) {
        C166328ci r1 = (C166328ci) C17880vN.A0G(this);
        int i = C166328ci.INITIATED_BY_ME_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.initiatedByMe_ = z;
    }
}
