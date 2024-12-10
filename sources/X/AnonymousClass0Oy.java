package X;

/* renamed from: X.0Oy  reason: invalid class name */
public abstract class AnonymousClass0Oy {
    public static final int A00(long j) {
        return (int) (C05100Qk.A06(C03090Go.A0G, j) >>> 32);
    }

    public static final long A01(float f, long j, long j2) {
        C03710Kf r10 = C03090Go.A02;
        long A06 = C05100Qk.A06(r10, j);
        long j3 = j2;
        long A062 = C05100Qk.A06(r10, j3);
        float A01 = C05100Qk.A01(A06);
        float A04 = C05100Qk.A04(A06);
        float A03 = C05100Qk.A03(A06);
        float A02 = C05100Qk.A02(A06);
        float A012 = C05100Qk.A01(A062);
        float A042 = C05100Qk.A04(A062);
        float A032 = C05100Qk.A03(A062);
        float A022 = C05100Qk.A02(A062);
        float f2 = 1.0f - f;
        return C05100Qk.A06(AnonymousClass001.A11(j3), A03(r10, AnonymousClass000.A00(f2, A04, f, A042), AnonymousClass000.A00(f2, A03, f, A032), AnonymousClass000.A00(f2, A02, f, A022), AnonymousClass000.A00(f2, A01, f, A012)));
    }

    public static final long A02(long j, long j2) {
        float f;
        float f2;
        C02540Ek r0 = C05100Qk.A06;
        int i = (int) (j2 & 63);
        C03710Kf[] r13 = C03090Go.A0K;
        long A06 = C05100Qk.A06(r13[i], j);
        float A01 = C05100Qk.A01(j2);
        float A012 = C05100Qk.A01(A06);
        float f3 = 1.0f - A012;
        float f4 = (f3 * A01) + A012;
        float A04 = C05100Qk.A04(A06);
        float A042 = C05100Qk.A04(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = ((A04 * A012) + ((A042 * A01) * f3)) / f4;
        }
        float A03 = C05100Qk.A03(A06);
        float A032 = C05100Qk.A03(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = ((A03 * A012) + ((A032 * A01) * f3)) / f4;
        }
        float A02 = C05100Qk.A02(A06);
        float A022 = C05100Qk.A02(j2);
        if (f4 != 0.0f) {
            f5 = ((A02 * A012) + ((A022 * A01) * f3)) / f4;
        }
        return A03(r13[i], f, f2, f5, f4);
    }

    public static final long A03(C03710Kf r13, float f, float f2, float f3, float f4) {
        long A00;
        float f5 = f3;
        float f6 = f4;
        float A05 = r13.A05(0);
        if (f <= r13.A04(0) && A05 <= f) {
            float A052 = r13.A05(1);
            if (f2 <= r13.A04(1) && A052 <= f2) {
                float A053 = r13.A05(2);
                if (f3 <= r13.A04(2) && A053 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (r13.A08()) {
                        A00 = (((long) ((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
                    } else if (((int) (r13.A01 >> 32)) == 3) {
                        int i = r13.A00;
                        if (i != -1) {
                            float f7 = C06360Ya.A00;
                            short A002 = C02550El.A00(f);
                            short A003 = C02550El.A00(f2);
                            long j = (((long) A003) & 65535) << 32;
                            A00 = j | ((((long) A002) & 65535) << 48) | ((((long) C02550El.A00(f5)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i) & 63);
                        } else {
                            throw AnonymousClass000.A0k("Unknown color space, please use a color space in ColorSpaces");
                        }
                    } else {
                        throw AnonymousClass000.A0k("Color only works with ColorSpaces with 3 components");
                    }
                    C02540Ek r0 = C05100Qk.A06;
                    return A00;
                }
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("red = ");
        A10.append(f);
        A10.append(", green = ");
        A10.append(f2);
        A10.append(", blue = ");
        A10.append(f5);
        A10.append(", alpha = ");
        A10.append(f6);
        throw AnonymousClass000.A0k(AnonymousClass001.A1E(r13, " outside the range for ", A10));
    }
}
