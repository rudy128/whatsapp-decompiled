package X;

/* renamed from: X.093  reason: invalid class name */
public final class AnonymousClass093 extends AnonymousClass0XW implements C17670v2 {
    public AnonymousClass0tB A00;

    public /* synthetic */ int BjB(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A00(r2, r3, this, i);
    }

    public /* synthetic */ int BjE(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A01(r2, r3, this, i);
    }

    public /* synthetic */ int Bjx(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A02(r2, r3, this, i);
    }

    public /* synthetic */ int Bk0(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A03(r2, r3, this, i);
    }

    public C16820tH Bja(C17500ul r6, C17530uo r7, long j) {
        if (Float.compare(this.A00.BDp(r7.getLayoutDirection()), 0.0f) < 0 || Float.compare(this.A00.BE0(), 0.0f) < 0 || Float.compare(this.A00.BDx(r7.getLayoutDirection()), 0.0f) < 0 || Float.compare(this.A00.BDk(), 0.0f) < 0) {
            throw AnonymousClass000.A0k("Padding must be non-negative");
        }
        int CG9 = r7.CG9(this.A00.BDp(r7.getLayoutDirection())) + r7.CG9(this.A00.BDx(r7.getLayoutDirection()));
        int CG92 = r7.CG9(this.A00.BE0()) + r7.CG9(this.A00.BDk());
        AnonymousClass0XJ Bjb = r6.Bjb(C26229CvL.A05(-CG9, -CG92, j));
        return r7.BhL(AnonymousClass1D7.A0I(), new C11170jb(this, r7, Bjb), C26229CvL.A01(j, Bjb.A01 + CG9), C26229CvL.A00(j, Bjb.A00 + CG92));
    }
}
