package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2;

/* renamed from: X.0L5  reason: invalid class name */
public abstract class AnonymousClass0L5 {
    public static final boolean A01(C05120Qm r6, boolean z) {
        C16910tQ A05;
        C04940Pp r0 = r6.A03;
        if (!(r0 == null || (A05 = r0.A05()) == null)) {
            AnonymousClass0NU A00 = AnonymousClass0E6.A00(A05);
            long A0B = r6.A0B(z);
            float f = A00.A01;
            float f2 = A00.A02;
            float A01 = AnonymousClass0QY.A01(A0B);
            if (f <= A01 && A01 <= f2) {
                float f3 = A00.A03;
                float f4 = A00.A00;
                float A02 = AnonymousClass0QY.A02(A0B);
                if (f3 > A02 || A02 > f4) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void A00(C05120Qm r11, C17130tn r12, C24245By3 by3, int i, boolean z) {
        C17130tn r5 = r12;
        r12.COC(-1344558920);
        boolean z2 = z;
        boolean A1Y = AnonymousClass001.A1Y(r12, Boolean.valueOf(z), r11);
        Object CER = r12.CER();
        if (A1Y || CER == AnonymousClass0MH.A00) {
            CER = new AnonymousClass0VG(r11, z);
            r12.CRH(CER);
        }
        AnonymousClass0VR.A0T(r12);
        C16850tK r3 = (C16850tK) CER;
        AnonymousClass0VM r4 = new AnonymousClass0VM(r11, z);
        boolean A05 = C26260Cw5.A05(r11.A0E().A01());
        int i2 = i << 3;
        AnonymousClass0Q8.A03(r4, r5, AnonymousClass0PB.A01(C17090tj.A00, r3, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(r3, (C30391dr) null)), by3, (i2 & 112) | (i2 & 896), z2, A05);
        C05660Vf BKF = r12.BKF();
        if (BKF != null) {
            BKF.A03(new C13420nN(r11, by3, i, z));
        }
    }
}
