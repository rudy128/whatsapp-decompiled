package X;

import androidx.compose.ui.CompositionLocalMapInjectionElement;

/* renamed from: X.0pb  reason: invalid class name and case insensitive filesystem */
public final class C14800pb extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C17090tj $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14800pb(C17090tj r2) {
        super(3);
        this.$modifier = r2;
    }

    public final void A00(C17130tn r6, C17130tn r7) {
        int i = ((AnonymousClass0VR) r7).A01;
        C17090tj r2 = this.$modifier;
        if (r2 != C17090tj.A00) {
            r2 = C04470Nn.A00(r7, AnonymousClass0EW.A00(new CompositionLocalMapInjectionElement(r7.BPs()), r2));
        }
        r6.COB(509942095);
        AnonymousClass0EM.A00(r6, r2, C05030Qc.A05());
        AnonymousClass1OS A01 = C05030Qc.A01();
        AnonymousClass0VR r22 = (AnonymousClass0VR) r6;
        if (r22.A0K || !C18070vi.A18(r6.CER(), Integer.valueOf(i))) {
            r6.BCJ(AnonymousClass000.A0r(r6, i), A01);
        }
        AnonymousClass0VR.A0R(r22, false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        A00(((AnonymousClass0OT) obj).A00, AnonymousClass000.A0b(obj2, obj3));
        return C27621Wu.A00;
    }
}
