package X;

/* renamed from: X.0i9  reason: invalid class name and case insensitive filesystem */
public final class C10320i9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ C17330uU $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10320i9(C17330uU r2, float f) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((AnonymousClass0QG) obj).A00;
        float A02 = AnonymousClass0QG.A02(j);
        float f = this.$labelProgress;
        float f2 = A02 * f;
        float A00 = AnonymousClass0QG.A00(j) * f;
        if (!(AnonymousClass0QG.A02(((AnonymousClass0QG) this.$labelSize.getValue()).A00) == f2 && AnonymousClass0QG.A00(((AnonymousClass0QG) this.$labelSize.getValue()).A00) == A00)) {
            this.$labelSize.setValue(new AnonymousClass0QG(AnonymousClass001.A0p(f2, A00)));
        }
        return C27621Wu.A00;
    }
}
