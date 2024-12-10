package X;

/* renamed from: X.0jF  reason: invalid class name and case insensitive filesystem */
public final class C10950jF extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C28644ECa $density;
    public final /* synthetic */ C17330uU $magnifierSize$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10950jF(C17330uU r2, C28644ECa eCa) {
        super(1);
        this.$density = eCa;
        this.$magnifierSize$delegate = r2;
    }

    public final void A00(long j) {
        C17330uU r3 = this.$magnifierSize$delegate;
        C28644ECa eCa = this.$density;
        C15240qJ.A02(r3, C25293Ccv.A00(eCa.CG9(C26200CuV.A01(j)), eCa.CG9(C26200CuV.A00(j))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((C26200CuV) obj).A03());
        return C27621Wu.A00;
    }
}
