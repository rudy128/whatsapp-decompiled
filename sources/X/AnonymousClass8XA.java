package X;

/* renamed from: X.8XA  reason: invalid class name */
public final class AnonymousClass8XA extends C23624Bmt implements C22568BDj {
    public AnonymousClass8XA() {
        super(C166438ct.DEFAULT_INSTANCE);
    }

    public long BTk() {
        return ((C166438ct) this.A00).keyId_;
    }

    public void A0G(long j) {
        C166438ct r1 = (C166438ct) C17880vN.A0G(this);
        int i = C166438ct.CLIENT_SECRET_KEY_DATA_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.keyId_ = j;
    }

    public void A0H(DSQ dsq) {
        C166438ct r1 = (C166438ct) C17880vN.A0G(this);
        int i = C166438ct.CLIENT_SECRET_KEY_DATA_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.clientSecretKeyData_ = dsq;
    }
}
