package X;

/* renamed from: X.8X3  reason: invalid class name */
public final class AnonymousClass8X3 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X3() {
        super(C165638bW.DEFAULT_INSTANCE);
    }

    public static C165638bW A00(C23624Bmt bmt, AnonymousClass8X3 r2) {
        r2.A0G();
        r2.A0E();
        C165638bW r22 = (C165638bW) r2.A00;
        C23577Bm6 A0C = bmt.A0C();
        int i = C165638bW.DOCUMENT_MESSAGE_FIELD_NUMBER;
        A0C.getClass();
        r22.media_ = A0C;
        return r22;
    }

    public void A0G() {
        C165638bW r2 = (C165638bW) C17880vN.A0G(this);
        int i = C165638bW.DOCUMENT_MESSAGE_FIELD_NUMBER;
        r2.bitField0_ |= 256;
        r2.hasMediaAttachment_ = true;
    }
}
