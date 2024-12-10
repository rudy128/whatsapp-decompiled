package X;

import java.util.Arrays;

/* renamed from: X.0Qd  reason: invalid class name and case insensitive filesystem */
public final class C05040Qd {
    public final float[] A00;

    public static final void A04(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                fArr[(i2 * 4) + i] = f;
                i2++;
            } while (i2 < 4);
        }
    }

    public static final void A05(float[] fArr, float f, float f2) {
        AnonymousClass001.A1V(fArr, (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12], (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13], (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14], (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15]);
    }

    public static final void A06(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float A002 = AnonymousClass002.A00(fArr3, fArr4, 0, 0);
        float A003 = AnonymousClass002.A00(fArr3, fArr4, 0, 1);
        float A004 = AnonymousClass002.A00(fArr3, fArr4, 0, 2);
        float A005 = AnonymousClass002.A00(fArr3, fArr4, 0, 3);
        float A006 = AnonymousClass002.A00(fArr3, fArr4, 1, 0);
        float A007 = AnonymousClass002.A00(fArr3, fArr4, 1, 1);
        float A008 = AnonymousClass002.A00(fArr3, fArr4, 1, 2);
        float A009 = AnonymousClass002.A00(fArr3, fArr4, 1, 3);
        float A0010 = AnonymousClass002.A00(fArr3, fArr4, 2, 0);
        float A0011 = AnonymousClass002.A00(fArr3, fArr4, 2, 1);
        float A0012 = AnonymousClass002.A00(fArr3, fArr4, 2, 2);
        float A0013 = AnonymousClass002.A00(fArr3, fArr4, 2, 3);
        float A0014 = AnonymousClass002.A00(fArr3, fArr4, 3, 0);
        float A0015 = AnonymousClass002.A00(fArr3, fArr4, 3, 1);
        float A0016 = AnonymousClass002.A00(fArr3, fArr4, 3, 2);
        float A0017 = AnonymousClass002.A00(fArr3, fArr4, 3, 3);
        fArr3[0] = A002;
        fArr3[1] = A003;
        fArr3[2] = A004;
        fArr3[3] = A005;
        AnonymousClass001.A1U(fArr3, A006, A007, A008, A009);
        fArr3[8] = A0010;
        fArr3[9] = A0011;
        fArr3[10] = A0012;
        fArr3[11] = A0013;
        AnonymousClass001.A1V(fArr3, A0014, A0015, A0016, A0017);
    }

    public boolean equals(Object obj) {
        return A07(obj, this.A00);
    }

    public static final void A02(C02100Cs r11, float[] fArr) {
        float f = r11.A01;
        float f2 = r11.A03;
        long A0p = AnonymousClass001.A0p(f, f2);
        long j = AnonymousClass0QY.A03;
        long A002 = A00(fArr, A0p);
        float f3 = r11.A00;
        long A003 = A00(fArr, AnonymousClass001.A0p(f, f3));
        float f4 = r11.A02;
        long A004 = A00(fArr, AnonymousClass001.A0p(f4, f2));
        long A005 = A00(fArr, AnonymousClass001.A0p(f4, f3));
        r11.A01 = Math.min(Math.min(AnonymousClass0QY.A01(A002), AnonymousClass0QY.A01(A003)), Math.min(AnonymousClass0QY.A01(A004), AnonymousClass0QY.A01(A005)));
        r11.A03 = Math.min(Math.min(AnonymousClass0QY.A02(A002), AnonymousClass0QY.A02(A003)), Math.min(AnonymousClass0QY.A02(A004), AnonymousClass0QY.A02(A005)));
        r11.A02 = Math.max(Math.max(AnonymousClass0QY.A01(A002), AnonymousClass0QY.A01(A003)), Math.max(AnonymousClass0QY.A01(A004), AnonymousClass0QY.A01(A005)));
        r11.A00 = Math.max(Math.max(AnonymousClass0QY.A02(A002), AnonymousClass0QY.A02(A003)), Math.max(AnonymousClass0QY.A02(A004), AnonymousClass0QY.A02(A005)));
    }

    public static void A03(StringBuilder sb, float[] fArr, int i) {
        sb.append(fArr[i]);
        sb.append(' ');
    }

    public static boolean A07(Object obj, float[] fArr) {
        if (!(obj instanceof C05040Qd) || !C18070vi.A18(fArr, ((C05040Qd) obj).A00)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ float[] A08() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ C05040Qd(float[] fArr) {
        this.A00 = fArr;
    }

    public static final long A00(float[] fArr, long j) {
        float A01 = AnonymousClass0QY.A01(j);
        float A02 = AnonymousClass0QY.A02(j);
        float f = 1.0f / (((fArr[3] * A01) + (fArr[7] * A02)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return AnonymousClass001.A0p(((fArr[0] * A01) + (fArr[4] * A02) + fArr[12]) * f, f * ((fArr[1] * A01) + (fArr[5] * A02) + fArr[13]));
    }

    public static String A01(float[] fArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n            |");
        A10.append(fArr[0]);
        A10.append(' ');
        A03(A10, fArr, 1);
        A03(A10, fArr, 2);
        A10.append(fArr[3]);
        A10.append("|\n            |");
        A03(A10, fArr, 4);
        A03(A10, fArr, 5);
        A03(A10, fArr, 6);
        A10.append(fArr[7]);
        A10.append("|\n            |");
        A03(A10, fArr, 8);
        A03(A10, fArr, 9);
        A03(A10, fArr, 10);
        A10.append(fArr[11]);
        A10.append("|\n            |");
        A03(A10, fArr, 12);
        A03(A10, fArr, 13);
        A03(A10, fArr, 14);
        A10.append(fArr[15]);
        return AnonymousClass1Y7.A01(AnonymousClass000.A0y("|\n        ", A10));
    }
}
