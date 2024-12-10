package X;

/* renamed from: X.8Wh  reason: invalid class name and case insensitive filesystem */
public final class C163778Wh extends C23624Bmt implements C22356B4k {
    public C163778Wh() {
        super(C164878aD.DEFAULT_INSTANCE);
    }

    public void A0G(C163788Wi r5) {
        C164878aD r3 = (C164878aD) C17880vN.A0G(this);
        C23577Bm6 A0C = r5.A0C();
        int i = C164878aD.PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER;
        A0C.getClass();
        EE9 ee9 = r3.peerDataOperationResult_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r3.peerDataOperationResult_ = ee9;
        }
        ee9.add(A0C);
    }
}
