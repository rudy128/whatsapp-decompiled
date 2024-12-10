package X;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.material3.SurfaceKt$Surface$1$2;

/* renamed from: X.0ni  reason: invalid class name and case insensitive filesystem */
public final class C13630ni extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ AnonymousClass0JY $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ float $shadowElevation;
    public final /* synthetic */ C16370s9 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13630ni(AnonymousClass0JY r2, C17090tj r3, C16370s9 r4, AnonymousClass1OS r5, float f, float f2, int i, long j) {
        super(2);
        this.$modifier = r3;
        this.$shape = r4;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$changed = i;
        this.$border = r2;
        this.$shadowElevation = f2;
        this.$content = r5;
    }

    public final void A00(C17130tn r13, int i) {
        C17090tj r2;
        if ((i & 11) != 2 || !r13.BZO()) {
            C17090tj r5 = this.$modifier;
            C16370s9 r6 = this.$shape;
            long A00 = AnonymousClass0Pu.A00(r13, this.$absoluteElevation, this.$color);
            AnonymousClass0JY r22 = this.$border;
            float f = this.$shadowElevation;
            long j = AnonymousClass0GB.A00;
            C17090tj A01 = AnonymousClass0Pu.A01(r5, r6, f, j, j);
            if (r22 != null) {
                r2 = new BorderModifierNodeElement(r22.A01, r6, r22.A00);
            } else {
                r2 = C17090tj.A00;
            }
            C17090tj A012 = AnonymousClass0PB.A01(AnonymousClass0PD.A02(AnonymousClass0LF.A01(C02190Db.A00(A01.CP5(r2), r6, A00), r6), C12600m1.A00, false), C27621Wu.A00, new SurfaceKt$Surface$1$2((C30391dr) null));
            AnonymousClass1OS r62 = this.$content;
            int i2 = this.$$changed;
            C16870tM A002 = C04870Pg.A00(r13, AnonymousClass000.A0c(r13), true);
            Object A1B = AnonymousClass001.A1B(r13);
            Object A0t = AnonymousClass000.A0t(r13);
            Object BFh = r13.BFh(AnonymousClass0OD.A0B);
            C18090vk A003 = C05030Qc.A00();
            AnonymousClass04D A004 = AnonymousClass0LO.A00(A012);
            r13.COE();
            AnonymousClass0VR r3 = (AnonymousClass0VR) r13;
            if (r3.A0K) {
                r13.BHe(A003);
            } else {
                r13.CRc();
            }
            r3.A0O = false;
            AnonymousClass0EM.A00(r13, A002, C05030Qc.A04());
            AnonymousClass0EM.A00(r13, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r13, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r13, BFh, C05030Qc.A07());
            A004.invoke(AnonymousClass0OT.A00(r13), r13, 0);
            r62.invoke(r13, AnonymousClass001.A15(r13, i2));
            AnonymousClass0VR.A0K(r3);
            return;
        }
        r13.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
