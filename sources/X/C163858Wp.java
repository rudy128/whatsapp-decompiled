package X;

/* renamed from: X.8Wp  reason: invalid class name and case insensitive filesystem */
public final class C163858Wp extends C23624Bmt implements C22356B4k {
    public C163858Wp() {
        super(C164288Yg.DEFAULT_INSTANCE);
    }

    public void A0G(C165328ax r3) {
        C164288Yg r1 = (C164288Yg) C17880vN.A0G(this);
        int i = C164288Yg.HIDE_LOCKED_CHATS_FIELD_NUMBER;
        r3.getClass();
        r1.secretCode_ = r3;
        r1.bitField0_ |= 2;
    }

    public void A0H(boolean z) {
        C164288Yg r1 = (C164288Yg) C17880vN.A0G(this);
        int i = C164288Yg.HIDE_LOCKED_CHATS_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.hideLockedChats_ = z;
    }
}
