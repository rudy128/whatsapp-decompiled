package X;

/* renamed from: X.0LX  reason: invalid class name */
public abstract class AnonymousClass0LX {
    public static final float[] A00;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr = new float[101];
        A00 = fArr;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f7 = ((float) i) / 100.0f;
            float f8 = 1.0f;
            while (true) {
                f = ((f8 - f5) / 2.0f) + f5;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f9 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                if (((double) Math.abs(f9 - f7)) < 1.0E-5d) {
                    break;
                } else if (f9 > f7) {
                    f8 = f;
                } else {
                    f5 = f;
                }
            }
            fArr[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f10 = 1.0f;
            while (true) {
                float f11 = ((f10 - f6) / 2.0f) + f6;
                float f12 = 1.0f - f11;
                float f13 = (((f12 * 0.5f) + f11) * f11 * 3.0f * f12) + (f11 * f11 * f11);
                if (((double) Math.abs(f13 - f7)) < 1.0E-5d) {
                    break;
                } else if (f13 > f7) {
                    f10 = f11;
                } else {
                    f6 = f11;
                }
            }
        }
        fArr[100] = 1.0f;
    }

    public static final AnonymousClass0JW A00(float f) {
        float f2;
        float f3;
        int i = (int) (100.0f * f);
        if (i < 100) {
            float f4 = ((float) i) / 100.0f;
            int i2 = i + 1;
            float[] fArr = A00;
            float f5 = fArr[i];
            f3 = (fArr[i2] - f5) / ((((float) i2) / 100.0f) - f4);
            f2 = f5 + ((f - f4) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new AnonymousClass0JW(f2, f3);
    }
}
