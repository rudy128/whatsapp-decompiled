package X;

/* renamed from: X.0jH  reason: invalid class name and case insensitive filesystem */
public final class C10970jH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ long $labelSize;
    public final /* synthetic */ AnonymousClass0tB $paddingValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10970jH(AnonymousClass0tB r2, long j) {
        super(1);
        this.$labelSize = j;
        this.$paddingValues = r2;
    }

    public final void A00(C17480uj r11) {
        float f;
        C18070vi.A0d(r11, 0);
        float A02 = AnonymousClass0QG.A02(this.$labelSize);
        if (A02 > 0.0f) {
            float CPQ = r11.CPQ(4.0f);
            float CPQ2 = r11.CPQ(this.$paddingValues.BDp(r11.getLayoutDirection())) - CPQ;
            float f2 = A02 + CPQ2 + (2.0f * CPQ);
            if (r11.getLayoutDirection().ordinal() == 1) {
                long BZL = r11.BZL();
                f = AnonymousClass0QG.A02(BZL) - f2;
                float A022 = AnonymousClass0QG.A02(BZL);
                if (CPQ2 < 0.0f) {
                    CPQ2 = 0.0f;
                }
                f2 = A022 - CPQ2;
            } else {
                f = CPQ2;
                if (CPQ2 < 0.0f) {
                    f = 0.0f;
                }
            }
            float A00 = AnonymousClass0QG.A00(this.$labelSize);
            AnonymousClass0t6 BQs = r11.BQs();
            long BZL2 = BQs.BZL();
            AnonymousClass0WZ.A00(BQs).BF0(f, (-A00) / 2.0f, f2, A00 / 2.0f, 0);
            r11.BJR();
            AnonymousClass001.A1P(BQs, BZL2);
            return;
        }
        r11.BJR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17480uj) obj);
        return C27621Wu.A00;
    }
}
