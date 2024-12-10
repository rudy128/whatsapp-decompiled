package X;

/* renamed from: X.2Az  reason: invalid class name and case insensitive filesystem */
public final class C45672Az extends C23624Bmt implements C22356B4k {
    public C45672Az() {
        super(AnonymousClass2BQ.DEFAULT_INSTANCE);
    }

    public void A0G(int i) {
        AnonymousClass2BQ r1 = (AnonymousClass2BQ) C17880vN.A0G(this);
        int i2 = AnonymousClass2BQ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 1;
        r1.id_ = i;
    }

    public void A0H(long j) {
        AnonymousClass2BQ r1 = (AnonymousClass2BQ) C17880vN.A0G(this);
        int i = AnonymousClass2BQ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 16;
        r1.timestamp_ = j;
    }

    public void A0I(DSQ dsq) {
        AnonymousClass2BQ r1 = (AnonymousClass2BQ) C17880vN.A0G(this);
        int i = AnonymousClass2BQ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 4;
        r1.privateKey_ = dsq;
    }

    public void A0J(DSQ dsq) {
        AnonymousClass2BQ r1 = (AnonymousClass2BQ) C17880vN.A0G(this);
        int i = AnonymousClass2BQ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.publicKey_ = dsq;
    }

    public void A0K(DSQ dsq) {
        AnonymousClass2BQ r1 = (AnonymousClass2BQ) C17880vN.A0G(this);
        int i = AnonymousClass2BQ.ID_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.signature_ = dsq;
    }
}
