package X;

/* renamed from: X.0jn  reason: invalid class name and case insensitive filesystem */
public final class C11290jn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $maxHeight;
    public final /* synthetic */ int $maxWidth;
    public final /* synthetic */ AnonymousClass0XJ[] $placeables;
    public final /* synthetic */ C06080Ww this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11290jn(C06080Ww r2, AnonymousClass0XJ[] r3, int i, int i2) {
        super(1);
        this.$placeables = r3;
        this.this$0 = r2;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    public final void A00() {
        AnonymousClass0XJ[] r8 = this.$placeables;
        C06080Ww r7 = this.this$0;
        int i = this.$maxWidth;
        int i2 = this.$maxHeight;
        for (AnonymousClass0XJ r2 : r8) {
            if (r2 != null) {
                long BC1 = r7.A00.A01.BC1(C24246By4.Ltr, C25293Ccv.A00(r2.A01, r2.A00), C25293Ccv.A00(i, i2));
                AnonymousClass0QZ.A03(r2, 0.0f, AnonymousClass000.A0G(BC1), AnonymousClass000.A0H(BC1));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
