package X;

/* renamed from: X.0po  reason: invalid class name and case insensitive filesystem */
public final class C14930po extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AnonymousClass1OS $placeholder;
    public final /* synthetic */ float $placeholderAlphaProgress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14930po(C16110rj r2, AnonymousClass0NY r3, AnonymousClass1OS r4, float f, int i, int i2, boolean z, boolean z2) {
        super(3);
        this.$placeholderAlphaProgress = f;
        this.$colors = r3;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = r2;
        this.$$dirty1 = i;
        this.$placeholder = r4;
        this.$$dirty = i2;
    }

    public final void A00(C17130tn r23, C17090tj r24, int i) {
        int i2;
        C17090tj r2 = r24;
        C18070vi.A0d(r2, 0);
        C17130tn r15 = r23;
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Q(r15, r2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !r15.BZO()) {
            C17090tj A00 = AnonymousClass0EZ.A00(r2, this.$placeholderAlphaProgress);
            AnonymousClass0NY r9 = this.$colors;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            C16110rj r6 = this.$interactionSource;
            AnonymousClass1OS r4 = this.$placeholder;
            int i3 = this.$$dirty;
            C16870tM A002 = C04870Pg.A00(r15, AnonymousClass000.A0c(r15), false);
            Object A1B = AnonymousClass001.A1B(r15);
            Object A0t = AnonymousClass000.A0t(r15);
            Object BFh = r15.BFh(AnonymousClass0OD.A0B);
            C18090vk A003 = C05030Qc.A00();
            AnonymousClass04D A004 = AnonymousClass0LO.A00(A00);
            r15.COE();
            AnonymousClass0VR r22 = (AnonymousClass0VR) r15;
            if (r22.A0K) {
                r15.BHe(A003);
            } else {
                r15.CRc();
            }
            r22.A0O = false;
            AnonymousClass0EM.A00(r15, A002, C05030Qc.A04());
            AnonymousClass0EM.A00(r15, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r15, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r15, BFh, C05030Qc.A07());
            A004.invoke(AnonymousClass0OT.A00(r15), r15, 0);
            r15.COB(2058660585);
            AnonymousClass1OS r17 = r4;
            AnonymousClass0PE.A02(r15, ((C04690Oj) r15.BFh(C04050Lq.A00)).A00(), r17, (i3 >> 9) & 896, 0, AnonymousClass000.A0V(r9.A03(r6, r15, z, z2)));
            AnonymousClass0VR.A0K(r22);
            return;
        }
        r15.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        A00((C17130tn) obj2, (C17090tj) obj, AnonymousClass000.A0M(obj3));
        return C27621Wu.A00;
    }
}
