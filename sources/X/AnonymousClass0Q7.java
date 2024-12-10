package X;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.ui.layout.LayoutIdElement;

/* renamed from: X.0Q7  reason: invalid class name */
public abstract class AnonymousClass0Q7 {
    public static final float A00(AnonymousClass0tB r1, C24246By4 by4) {
        if (by4 == C24246By4.Ltr) {
            return r1.BDx(by4);
        }
        return r1.BDp(by4);
    }

    public static final float A01(AnonymousClass0tB r1, C24246By4 by4) {
        if (by4 == C24246By4.Ltr) {
            return r1.BDp(by4);
        }
        return r1.BDx(by4);
    }

    public static final C17090tj A02(AnonymousClass0tB r2, C17090tj r3) {
        return r3.CP5(new PaddingValuesElement(r2, new C09550gt(r2)));
    }

    public static C17090tj A03(C17130tn r5, C16340s6 r6) {
        C17090tj A02 = A02(new C05560Us(16.0f, 4.0f, 16.0f, 0.0f), C05130Qo.A03(r6, C05130Qo.A0A(new LayoutIdElement("Supporting"), 16.0f, Float.NaN)));
        r5.COB(733328855);
        return A02;
    }

    public static final C17090tj A04(C17090tj r8, float f) {
        return r8.CP5(new PaddingElement(new C09540gs(f), (AnonymousClass1Y1) null, f, f, f, f, true));
    }

    public static final C17090tj A05(C17090tj r8, float f, float f2) {
        return r8.CP5(new PaddingElement(new C10240i1(f, f2), (AnonymousClass1Y1) null, f, f2, f, f2, true));
    }

    public static final C17090tj A06(C17090tj r8, float f, float f2, float f3, float f4) {
        return r8.CP5(new PaddingElement(new C10460iN(f, f2, f3, f4), (AnonymousClass1Y1) null, f, f2, f3, f4, true));
    }
}
