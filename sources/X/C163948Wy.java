package X;

/* renamed from: X.8Wy  reason: invalid class name and case insensitive filesystem */
public final class C163948Wy extends C23624Bmt implements C22356B4k {
    public C163948Wy() {
        super(C164608Zm.DEFAULT_INSTANCE);
    }

    public void A0G(int i) {
        C164608Zm r1 = (C164608Zm) C17880vN.A0G(this);
        int i2 = C164608Zm.ITERATION_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.iteration_ = i;
    }

    public void A0H(DSQ dsq) {
        C164608Zm r1 = (C164608Zm) C17880vN.A0G(this);
        int i = C164608Zm.ITERATION_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.seed_ = dsq;
    }
}
