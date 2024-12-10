package X;

/* renamed from: X.09f  reason: invalid class name and case insensitive filesystem */
public final class C016209f extends C03710Kf {
    public float A03(float f, float f2, float f3) {
        float f4;
        float A02 = ((C28851b7.A02(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (C28851b7.A02(f3, -128.0f, 128.0f) * 0.005f);
        if (A02 > 0.20689656f) {
            f4 = A02 * A02;
        } else {
            A02 -= 0.13793103f;
            f4 = 0.12841855f;
        }
        return f4 * A02 * C03060Gl.A04[2];
    }

    public float A04(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    public float A05(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    public long A06(float f, float f2, float f3) {
        float f4;
        float f5;
        float A02 = (C28851b7.A02(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float A022 = (C28851b7.A02(f2, -128.0f, 128.0f) * 0.002f) + A02;
        if (A022 > 0.20689656f) {
            f4 = A022 * A022 * A022;
        } else {
            f4 = (A022 - 0.13793103f) * 0.12841855f;
        }
        if (A02 > 0.20689656f) {
            f5 = A02 * A02 * A02;
        } else {
            f5 = 0.12841855f * (A02 - 0.13793103f);
        }
        float[] fArr = C03060Gl.A04;
        return AnonymousClass001.A0p(f4 * fArr[0], f5 * fArr[1]);
    }

    public long A07(C03710Kf r8, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float[] fArr = C03060Gl.A04;
        float f8 = f / fArr[0];
        float f9 = f2 / fArr[1];
        float f10 = f3 / fArr[2];
        if (f8 > 0.008856452f) {
            f5 = (float) Math.pow((double) f8, 0.3333333432674408d);
        } else {
            f5 = (f8 * 7.787037f) + 0.13793103f;
        }
        if (f9 > 0.008856452f) {
            f6 = (float) Math.pow((double) f9, 0.3333333432674408d);
        } else {
            f6 = (f9 * 7.787037f) + 0.13793103f;
        }
        if (f10 > 0.008856452f) {
            f7 = (float) Math.pow((double) f10, 0.3333333432674408d);
        } else {
            f7 = (f10 * 7.787037f) + 0.13793103f;
        }
        return AnonymousClass0Oy.A03(r8, C28851b7.A02((116.0f * f6) - 16.0f, 0.0f, 100.0f), C28851b7.A02((f5 - f6) * 500.0f, -128.0f, 128.0f), C28851b7.A02((f6 - f7) * 200.0f, -128.0f, 128.0f), f4);
    }
}
