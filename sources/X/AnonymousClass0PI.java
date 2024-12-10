package X;

import androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1;

/* renamed from: X.0PI  reason: invalid class name */
public abstract class AnonymousClass0PI {
    public static final long A00;
    public static final AnonymousClass077 A01 = new AnonymousClass077(Float.NaN, Float.NaN);
    public static final AnonymousClass0U0 A02;
    public static final C16590sg A03 = AnonymousClass0MW.A00(C11970ky.A00, C11980kz.A00);

    static {
        long A0p = AnonymousClass001.A0p(0.01f, 0.01f);
        long j = AnonymousClass0QY.A03;
        A00 = A0p;
        A02 = AnonymousClass0U0.A01(AnonymousClass000.A0e(A0p));
    }

    public static final C17090tj A02(C17090tj r1, C18090vk r2, C22821Di r3) {
        return C04470Nn.A01(r1, AnonymousClass0O1.A01(), new C14830pe(r2, r3));
    }

    public static final C05780Vr A00(C17130tn r8, C18090vk r9) {
        r8.COB(-1589795249);
        Object A0u = AnonymousClass000.A0u(r8, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = C04950Pq.A01(r9);
            r8.CRH(A0u);
        }
        AnonymousClass0VR r6 = (AnonymousClass0VR) r8;
        AnonymousClass0VR.A0R(r6, false);
        C16300s2 r7 = (C16300s2) A0u;
        Object A0u2 = AnonymousClass000.A0u(r8, -492369756);
        if (A0u2 == obj) {
            A0u2 = new AnonymousClass0Q3(A03, AnonymousClass000.A0e(((AnonymousClass0QY) r7.getValue()).A00), AnonymousClass000.A0e(A00));
            r6.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r6, false);
        AnonymousClass0Q3 r4 = (AnonymousClass0Q3) A0u2;
        AnonymousClass0QC.A04(r8, C27621Wu.A00, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(r4, r7, (C30391dr) null));
        C05780Vr r0 = r4.A04;
        AnonymousClass0VR.A0R(r6, false);
        return r0;
    }
}
