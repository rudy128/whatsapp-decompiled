package X;

/* renamed from: X.0k5  reason: invalid class name and case insensitive filesystem */
public final class C11470k5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0Q3 $cursorAlpha;
    public final /* synthetic */ C03380Hv $cursorBrush;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11470k5(AnonymousClass0Q3 r2, C04940Pp r3, C03380Hv r4, EBT ebt, C26224CvE cvE) {
        super(1);
        this.$cursorAlpha = r2;
        this.$offsetMapping = ebt;
        this.$value = cvE;
        this.$state = r3;
        this.$cursorBrush = r4;
    }

    public final void A00(C17480uj r14) {
        AnonymousClass0NU r3;
        C26227CvJ A03;
        C17480uj r5 = r14;
        r14.BJR();
        float A02 = C28851b7.A02(AnonymousClass001.A05(this.$cursorAlpha.A04.A05), 0.0f, 1.0f);
        if (A02 != 0.0f) {
            int CB1 = this.$offsetMapping.CB1(AnonymousClass000.A0G(this.$value.A01()));
            AnonymousClass0NM A022 = C04940Pp.A02(this.$state);
            if (A022 == null || (A03 = A022.A03()) == null) {
                r3 = new AnonymousClass0NU(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                r3 = A03.A0K(CB1);
            }
            C16000rY r0 = C03990Lk.A00;
            float CPQ = r14.CPQ(2.0f);
            float f = CPQ / 2.0f;
            float f2 = r3.A01 + f;
            float A023 = AnonymousClass0QG.A02(r14.BZL()) - f;
            if (f2 > A023) {
                f2 = A023;
            }
            if (f2 < f) {
                f2 = f;
            }
            long A0p = AnonymousClass001.A0p(f2, r3.A03);
            long j = AnonymousClass0QY.A03;
            r5.BJb(this.$cursorBrush, CPQ, A02, A0p, AnonymousClass001.A0p(f2, r3.A00));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17480uj) obj);
        return C27621Wu.A00;
    }
}
