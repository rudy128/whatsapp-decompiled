package X;

import androidx.compose.ui.layout.LayoutIdElement;

/* renamed from: X.0p8  reason: invalid class name and case insensitive filesystem */
public final class C14510p8 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ AnonymousClass1OS $container;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ C17330uU $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14510p8(AnonymousClass0tB r2, C17330uU r3, AnonymousClass1OS r4, int i) {
        super(2);
        this.$labelSize = r3;
        this.$contentPadding = r2;
        this.$container = r4;
        this.$$dirty1 = i;
    }

    public static final C17090tj A00(AnonymousClass0tB r1, C17090tj r2, long j) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r1, 2);
        return C04490Np.A02(r2, new C10970jH(r1, j));
    }

    public final void A01(C17130tn r12, int i) {
        if ((i & 11) != 2 || !r12.BZO()) {
            C17090tj A00 = A00(this.$contentPadding, new LayoutIdElement("Container"), ((AnonymousClass0QG) this.$labelSize.getValue()).A00);
            AnonymousClass1OS r6 = this.$container;
            int i2 = this.$$dirty1;
            C16870tM A002 = C04870Pg.A00(r12, AnonymousClass000.A0c(r12), true);
            Object A1B = AnonymousClass001.A1B(r12);
            Object A0t = AnonymousClass000.A0t(r12);
            Object BFh = r12.BFh(AnonymousClass0OD.A0B);
            C18090vk A003 = C05030Qc.A00();
            AnonymousClass04D A004 = AnonymousClass0LO.A00(A00);
            r12.COE();
            AnonymousClass0VR r3 = (AnonymousClass0VR) r12;
            if (r3.A0K) {
                r12.BHe(A003);
            } else {
                r12.CRc();
            }
            r3.A0O = false;
            AnonymousClass0EM.A00(r12, A002, C05030Qc.A04());
            AnonymousClass0EM.A00(r12, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r12, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r12, BFh, C05030Qc.A07());
            A004.invoke(AnonymousClass0OT.A00(r12), r12, 0);
            r6.invoke(r12, AnonymousClass001.A15(r12, i2));
            AnonymousClass0VR.A0K(r3);
            return;
        }
        r12.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A01((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
