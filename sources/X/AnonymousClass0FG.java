package X;

/* renamed from: X.0FG  reason: invalid class name */
public abstract class AnonymousClass0FG {
    public static final boolean A00(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = f5;
        float A01 = AnonymousClass000.A01(f, f6, f2, f17);
        float f18 = f;
        float A012 = AnonymousClass000.A01(f18, f7, f3, f17);
        float A013 = AnonymousClass000.A01(f18, f8, f4, f17);
        float f19 = f2;
        float A014 = AnonymousClass000.A01(f19, f7, f3, f6);
        float A015 = AnonymousClass000.A01(f19, f8, f4, f6);
        float A016 = AnonymousClass000.A01(f3, f8, f4, f7);
        float f20 = f13;
        float A017 = AnonymousClass000.A01(f9, f14, f10, f20);
        float A018 = AnonymousClass000.A01(f9, f15, f11, f20);
        float A019 = AnonymousClass000.A01(f9, f16, f12, f20);
        float A0110 = AnonymousClass000.A01(f10, f15, f11, f14);
        float A0111 = AnonymousClass000.A01(f10, f16, f12, f14);
        float A0112 = AnonymousClass000.A01(f11, f16, f12, f15);
        float A0113 = (((AnonymousClass000.A01(A01, A0112, A012, A0111) + (A013 * A0110)) + (A014 * A019)) - (A015 * A018)) + (A016 * A017);
        if (A0113 == 0.0f) {
            return false;
        }
        float f21 = 1.0f / A0113;
        fArr2[0] = (AnonymousClass000.A01(f6, A0112, f7, A0111) + (f8 * A0110)) * f21;
        fArr2[1] = (AnonymousClass000.A00(-f2, A0112, f3, A0111) - (f4 * A0110)) * f21;
        fArr2[2] = (AnonymousClass000.A01(f14, A016, f15, A015) + (f16 * A014)) * f21;
        fArr2[3] = (AnonymousClass000.A00(-f10, A016, f11, A015) - (f12 * A014)) * f21;
        float f22 = -f5;
        float f23 = f22;
        fArr2[4] = (AnonymousClass000.A00(f22, A0112, f7, A019) - (f8 * A018)) * f21;
        fArr2[5] = (AnonymousClass000.A01(A0112, f, f3, A019) + (f4 * A018)) * f21;
        float f24 = -f13;
        float f25 = f24;
        float f26 = A016;
        fArr2[6] = (AnonymousClass000.A00(f24, f26, f15, A013) - (f16 * A012)) * f21;
        fArr2[7] = (AnonymousClass000.A01(f26, f9, f11, A013) + (f12 * A012)) * f21;
        fArr2[8] = (AnonymousClass000.A01(f5, A0111, f6, A019) + (f8 * A017)) * f21;
        fArr2[9] = (AnonymousClass000.A00(-f, A0111, A019, f2) - (f4 * A017)) * f21;
        fArr2[10] = (AnonymousClass000.A01(f13, A015, f14, A013) + (f16 * A01)) * f21;
        fArr2[11] = (AnonymousClass000.A00(-f9, A015, A013, f10) - (f12 * A01)) * f21;
        fArr2[12] = (AnonymousClass000.A00(f23, A0110, f6, A018) - (f7 * A017)) * f21;
        fArr2[13] = (AnonymousClass000.A01(f, A0110, f2, A018) + (f3 * A017)) * f21;
        float f27 = A014;
        fArr2[14] = (AnonymousClass000.A00(f25, f27, f14, A012) - (f15 * A01)) * f21;
        fArr2[15] = (AnonymousClass000.A01(f9, f27, f10, A012) + (f11 * A01)) * f21;
        return true;
    }
}
