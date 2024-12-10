package X;

/* renamed from: X.8X2  reason: invalid class name */
public final class AnonymousClass8X2 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X2() {
        super(C166148cQ.DEFAULT_INSTANCE);
    }

    public void A0G(int i) {
        C166148cQ r1 = (C166148cQ) C17880vN.A0G(this);
        int i2 = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.chunkOrder_ = i;
    }

    public void A0H(int i) {
        C166148cQ r1 = (C166148cQ) C17880vN.A0G(this);
        int i2 = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.bitField0_ |= 4;
        r1.progress_ = i;
    }

    public void A0I(C45662Ay r5) {
        C166148cQ r3 = (C166148cQ) C17880vN.A0G(this);
        C23577Bm6 A0C = r5.A0C();
        int i = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        A0C.getClass();
        EE9 ee9 = r3.conversations_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r3.conversations_ = ee9;
        }
        ee9.add(A0C);
    }

    public void A0J(C166298cf r4) {
        C166148cQ r2 = (C166148cQ) C17880vN.A0G(this);
        int i = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r4.getClass();
        EE9 ee9 = r2.conversations_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r2.conversations_ = ee9;
        }
        ee9.add(r4);
    }

    public void A0K(AnonymousClass9KV r3) {
        C166148cQ r1 = (C166148cQ) C17880vN.A0G(this);
        int i = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        r1.syncType_ = r3.value;
        r1.bitField0_ |= 1;
    }

    public void A0L(Iterable iterable) {
        C166148cQ r2 = (C166148cQ) C17880vN.A0G(this);
        int i = C166148cQ.AI_WAIT_LIST_STATE_FIELD_NUMBER;
        EE9 ee9 = r2.phoneNumberToLidMappings_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r2.phoneNumberToLidMappings_ = ee9;
        }
        DND.A09(iterable, ee9);
    }
}
