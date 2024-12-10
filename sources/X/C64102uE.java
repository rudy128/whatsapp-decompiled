package X;

import android.animation.TypeEvaluator;

/* renamed from: X.2uE  reason: invalid class name and case insensitive filesystem */
public class C64102uE implements TypeEvaluator {
    public C63012sM[] A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        C63012sM[] r11 = (C63012sM[]) obj;
        C63012sM[] r12 = (C63012sM[]) obj2;
        if (C63382sy.A02(r11, r12)) {
            C63012sM[] r8 = this.A00;
            if (!C63382sy.A02(r8, r11)) {
                int length = r11.length;
                r8 = new C63012sM[length];
                for (int i = 0; i < length; i++) {
                    r8[i] = new C63012sM(r11[i]);
                }
                this.A00 = r8;
            }
            for (int i2 = 0; i2 < r11.length; i2++) {
                C63012sM r6 = r8[i2];
                C63012sM r5 = r11[i2];
                C63012sM r4 = r12[i2];
                r6.A00 = r5.A00;
                int i3 = 0;
                while (true) {
                    float[] fArr = r5.A01;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    r6.A01[i3] = (fArr[i3] * (1.0f - f)) + (r4.A01[i3] * f);
                    i3++;
                }
            }
            return r8;
        }
        throw AnonymousClass000.A0k("Can't interpolate between two incompatible pathData");
    }
}
