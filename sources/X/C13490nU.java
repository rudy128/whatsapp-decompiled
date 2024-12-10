package X;

/* renamed from: X.0nU  reason: invalid class name and case insensitive filesystem */
public final class C13490nU extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C26251Cvq $bodyLarge;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ long $prefixColor;
    public final /* synthetic */ float $prefixSuffixAlphaProgress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13490nU(C26251Cvq cvq, AnonymousClass1OS r3, float f, int i, long j) {
        super(2);
        this.$prefixSuffixAlphaProgress = f;
        this.$prefixColor = j;
        this.$bodyLarge = cvq;
        this.$prefix = r3;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r17, int i) {
        C17130tn r9 = r17;
        if ((i & 11) != 2 || !r9.BZO()) {
            C17090tj A00 = AnonymousClass0EZ.A00(C17090tj.A00, this.$prefixSuffixAlphaProgress);
            long j = this.$prefixColor;
            C26251Cvq cvq = this.$bodyLarge;
            AnonymousClass1OS r11 = this.$prefix;
            int i2 = this.$$dirty;
            C16870tM A002 = C04870Pg.A00(r9, AnonymousClass000.A0c(r9), false);
            Object A1B = AnonymousClass001.A1B(r9);
            Object A0t = AnonymousClass000.A0t(r9);
            Object BFh = r9.BFh(AnonymousClass0OD.A0B);
            C18090vk A003 = C05030Qc.A00();
            AnonymousClass04D A004 = AnonymousClass0LO.A00(A00);
            r9.COE();
            AnonymousClass0VR r2 = (AnonymousClass0VR) r9;
            if (r2.A0K) {
                r9.BHe(A003);
            } else {
                r9.CRc();
            }
            r2.A0O = false;
            AnonymousClass0EM.A00(r9, A002, C05030Qc.A04());
            AnonymousClass0EM.A00(r9, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r9, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r9, BFh, C05030Qc.A07());
            A004.invoke(AnonymousClass0OT.A00(r9), r9, 0);
            r9.COB(2058660585);
            AnonymousClass0PE.A02(r9, cvq, r11, (i2 >> 18) & 896, 0, j);
            AnonymousClass0VR.A0K(r2);
            return;
        }
        r9.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
