package X;

/* renamed from: X.8X1  reason: invalid class name */
public final class AnonymousClass8X1 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X1() {
        super(C166388co.DEFAULT_INSTANCE);
    }

    public void A0G() {
        C166388co A0P = AnonymousClass8BS.A0P(this);
        A0P.bitField0_ &= -17;
        A0P.participant_ = C166388co.DEFAULT_INSTANCE.participant_;
    }

    public void A0H(long j) {
        C166388co A0X = C17880vN.A0X(this);
        A0X.bitField0_ |= 4;
        A0X.messageTimestamp_ = j;
    }

    public void A0I(C179859Ke r3) {
        C166388co A0X = C17880vN.A0X(this);
        A0X.messageStubType_ = r3.value;
        A0X.bitField0_ |= 16384;
    }

    public void A0J(String str) {
        C166388co A0X = C17880vN.A0X(this);
        str.getClass();
        EE9 ee9 = A0X.messageStubParameters_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            A0X.messageStubParameters_ = ee9;
        }
        ee9.add(str);
    }

    public void A0K(String str) {
        C166388co A0X = C17880vN.A0X(this);
        str.getClass();
        A0X.bitField0_ |= 16;
        A0X.participant_ = str;
    }
}
