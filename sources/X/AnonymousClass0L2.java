package X;

import android.content.Context;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.0L2  reason: invalid class name */
public abstract class AnonymousClass0L2 {
    public static final boolean A01(AnonymousClass0CI r2, C24246By4 by4, boolean z) {
        boolean z2 = !z;
        if (by4 != C24246By4.Rtl || r2 == AnonymousClass0CI.Vertical) {
            return z2;
        }
        return !z2;
    }

    public static final AnonymousClass0t9 A00(C17130tn r4) {
        AnonymousClass0t9 r1;
        r4.COB(1809802212);
        C17090tj r0 = C02880Ft.A00;
        r4.COB(-1476348564);
        Context context = (Context) r4.BFh(AnonymousClass0PK.A01);
        AnonymousClass0JZ r2 = (AnonymousClass0JZ) r4.BFh(C02910Fw.A00);
        if (r2 != null) {
            boolean A1Y = AnonymousClass001.A1Y(r4, context, r2);
            Object CER = r4.CER();
            if (A1Y || CER == AnonymousClass0MH.A00) {
                CER = new AndroidEdgeEffectOverscrollEffect(context, r2);
                AnonymousClass0VR.A0V(r4, CER);
            }
            AnonymousClass0VR.A0T(r4);
            r1 = (AnonymousClass0t9) CER;
        } else {
            r1 = AnonymousClass0UJ.A00;
        }
        AnonymousClass0VR.A0L((AnonymousClass0VR) r4);
        return r1;
    }
}
