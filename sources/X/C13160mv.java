package X;

import androidx.compose.ui.layout.LayoutIdElement;

/* renamed from: X.0mv  reason: invalid class name and case insensitive filesystem */
public final class C13160mv extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ AnonymousClass1OS $container;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13160mv(AnonymousClass1OS r2, int i) {
        super(2);
        this.$container = r2;
        this.$$dirty1 = i;
    }

    public final void A00(C17130tn r12, int i) {
        if ((i & 11) != 2 || !r12.BZO()) {
            LayoutIdElement layoutIdElement = new LayoutIdElement("Container");
            AnonymousClass1OS r6 = this.$container;
            int i2 = this.$$dirty1;
            C16870tM A00 = C04870Pg.A00(r12, AnonymousClass000.A0c(r12), true);
            Object A1B = AnonymousClass001.A1B(r12);
            Object A0t = AnonymousClass000.A0t(r12);
            Object BFh = r12.BFh(AnonymousClass0OD.A0B);
            C18090vk A002 = C05030Qc.A00();
            AnonymousClass04D A003 = AnonymousClass0LO.A00(layoutIdElement);
            r12.COE();
            AnonymousClass0VR r3 = (AnonymousClass0VR) r12;
            if (r3.A0K) {
                r12.BHe(A002);
            } else {
                r12.CRc();
            }
            r3.A0O = false;
            AnonymousClass0EM.A00(r12, A00, C05030Qc.A04());
            AnonymousClass0EM.A00(r12, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r12, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r12, BFh, C05030Qc.A07());
            A003.invoke(AnonymousClass0OT.A00(r12), r12, 0);
            r6.invoke(r12, AnonymousClass001.A15(r12, i2));
            AnonymousClass0VR.A0K(r3);
            return;
        }
        r12.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
