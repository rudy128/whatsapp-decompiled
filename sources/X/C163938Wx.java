package X;

/* renamed from: X.8Wx  reason: invalid class name and case insensitive filesystem */
public final class C163938Wx extends C23624Bmt implements C22356B4k {
    public C163938Wx() {
        super(C166048cG.DEFAULT_INSTANCE);
    }

    public void A0G(DSQ dsq) {
        C166048cG r1 = (C166048cG) C17880vN.A0G(this);
        int i = C166048cG.BOT_MESSAGE_SECRET_FIELD_NUMBER;
        dsq.getClass();
        r1.bitField0_ |= 4;
        r1.messageSecret_ = dsq;
    }

    public void A0H(C166118cN r3) {
        C166048cG r1 = (C166048cG) C17880vN.A0G(this);
        int i = C166048cG.BOT_MESSAGE_SECRET_FIELD_NUMBER;
        r3.getClass();
        r1.botMetadata_ = r3;
        r1.bitField0_ |= 64;
    }
}
