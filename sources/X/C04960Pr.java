package X;

/* renamed from: X.0Pr  reason: invalid class name and case insensitive filesystem */
public abstract class C04960Pr {
    public static void A00(float[] fArr, int i, float f, float f2, float f3) {
        fArr[i] = f3 + (f * f2);
    }

    public static final void A01(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        A00(fArr2, 0, fArr[6], f3, (fArr[0] * f) + (fArr[3] * f2));
        A00(fArr2, 1, fArr[7], f3, (fArr[1] * f) + (fArr[4] * f2));
        A00(fArr2, 2, fArr[8], f3, (fArr[2] * f) + (fArr[5] * f2));
    }

    public static final boolean A02(AnonymousClass0KO r4, AnonymousClass0KO r5) {
        return r4 == r5 || (Math.abs(r4.A00 - r5.A00) < 0.001f && Math.abs(r4.A01 - r5.A01) < 0.001f);
    }

    public static final float[] A03(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float A01 = AnonymousClass000.A01(f5, f9, f6, f8);
        float A012 = AnonymousClass000.A01(f6, f7, f4, f9);
        float A013 = AnonymousClass000.A01(f4, f8, f5, f7);
        float A00 = AnonymousClass000.A00(f, A01, f2, A012) + (f3 * A013);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = A01 / A00;
        fArr2[1] = A012 / A00;
        fArr2[2] = A013 / A00;
        fArr2[3] = AnonymousClass000.A01(f3, f8, f2, f9) / A00;
        fArr2[4] = AnonymousClass000.A01(f9, f, f3, f7) / A00;
        fArr2[5] = AnonymousClass000.A01(f7, f2, f8, f) / A00;
        fArr2[6] = AnonymousClass000.A01(f2, f6, f3, f5) / A00;
        fArr2[7] = AnonymousClass000.A01(f3, f4, f6, f) / A00;
        fArr2[8] = AnonymousClass000.A01(f, f5, f2, f4) / A00;
        return fArr2;
    }

    public static final float[] A04(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float f = fArr[3];
        float f2 = fArr2[1];
        float f3 = (fArr[0] * fArr2[0]) + (f * f2);
        float f4 = fArr[6];
        float f5 = fArr2[2];
        A00(fArr3, 0, f4, f5, f3);
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        A00(fArr3, 1, f9, f5, (f6 * f7) + (f2 * f8));
        float f10 = fArr[5];
        float f11 = fArr[8];
        A00(fArr3, 2, f5, f11, (fArr[2] * f7) + (fArr2[1] * f10));
        float f12 = fArr[0];
        float f13 = fArr2[4];
        float f14 = fArr2[5];
        A00(fArr3, 3, f4, f14, (fArr2[3] * f12) + (f * f13));
        float f15 = fArr[1];
        float f16 = fArr2[3];
        A00(fArr3, 4, f9, f14, AnonymousClass000.A00(f15, f16, f8, f13));
        float f17 = fArr[2];
        A00(fArr3, 5, f14, f11, (f16 * f17) + (f10 * fArr2[4]));
        float f18 = f12 * fArr2[6];
        float f19 = fArr[3];
        float f20 = fArr2[7];
        float f21 = fArr2[8];
        A00(fArr3, 6, f4, f21, f18 + (f19 * f20));
        float f22 = fArr2[6];
        A00(fArr3, 7, f9, f21, (f15 * f22) + (fArr[4] * f20));
        A00(fArr3, 8, f11, f21, (f17 * f22) + (fArr[5] * fArr2[7]));
        return fArr3;
    }

    public static final float[] A05(float[] fArr, float[] fArr2, float[] fArr3) {
        A01(fArr, fArr2);
        A01(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] A03 = A03(fArr);
        float f = fArr4[0];
        float f2 = fArr4[1];
        float f3 = fArr4[2];
        return A04(A03, new float[]{fArr4[0] * fArr[0], fArr4[1] * fArr[1], fArr4[2] * fArr[2], fArr[3] * f, fArr[4] * f2, fArr[5] * f3, f * fArr[6], f2 * fArr[7], f3 * fArr[8]});
    }
}
