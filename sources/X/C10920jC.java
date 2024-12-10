package X;

/* renamed from: X.0jC  reason: invalid class name and case insensitive filesystem */
public final class C10920jC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10920jC(C26224CvE cvE, C22821Di r3) {
        super(1);
        this.$value = cvE;
        this.$onValueChange = r3;
    }

    public final void A00(C26224CvE cvE) {
        if (!C18070vi.A18(this.$value, cvE)) {
            this.$onValueChange.invoke(cvE);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C26224CvE) obj);
        return C27621Wu.A00;
    }
}
