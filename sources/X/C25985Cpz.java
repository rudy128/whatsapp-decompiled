package X;

import android.graphics.Color;

/* renamed from: X.Cpz  reason: case insensitive filesystem */
public class C25985Cpz {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public static C25985Cpz A01(int i) {
        float f;
        float[] fArr = new float[7];
        C25619Ciz ciz = C25619Ciz.A0A;
        float A002 = C25456Cg8.A00(Color.red(i));
        float A003 = C25456Cg8.A00(Color.green(i));
        float A004 = C25456Cg8.A00(Color.blue(i));
        float[][] fArr2 = C25456Cg8.A02;
        float[] fArr3 = fArr2[0];
        float[] fArr4 = fArr2[1];
        float[] fArr5 = fArr2[2];
        float f2 = (A002 * fArr5[0]) + (A003 * fArr5[1]) + (A004 * fArr5[2]);
        float[] fArr6 = {BE6.A03(fArr3, A004, BE6.A03(fArr3, A003, fArr3[0] * A002, 1), 2), BE6.A03(fArr4, A004, BE6.A03(fArr4, A003, fArr4[0] * A002, 1), 2), f2};
        float[][] fArr7 = C25456Cg8.A03;
        float f3 = fArr6[0];
        float[] fArr8 = fArr7[0];
        float f4 = fArr6[1];
        float A032 = BE6.A03(fArr8, f2, BE6.A03(fArr8, f4, fArr8[0] * f3, 1), 2);
        float[] fArr9 = fArr7[1];
        float A033 = BE6.A03(fArr9, f2, BE6.A03(fArr9, f4, fArr9[0] * f3, 1), 2);
        float[] fArr10 = fArr7[2];
        float[] fArr11 = ciz.A09;
        float f5 = fArr11[0] * A032;
        float f6 = fArr11[1] * A033;
        float f7 = fArr11[2] * ((f3 * fArr10[0]) + (f4 * fArr10[1]) + (f2 * fArr10[2]));
        float f8 = ciz.A02;
        float pow = (float) Math.pow(((double) (Math.abs(f5) * f8)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f6) * f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (f8 * Math.abs(f7))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f9 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f10 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = (((signum * 20.0f) + f11) + (21.0f * signum3)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f10, (double) f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = (3.1415927f * atan2) / 180.0f;
        float f15 = ciz.A00;
        float f16 = ciz.A01;
        float pow4 = ((float) Math.pow((double) ((f13 * ciz.A05) / f15), (double) (f16 * ciz.A08))) * 100.0f;
        float f17 = f15 + 4.0f;
        float f18 = ciz.A03;
        float sqrt = (4.0f / f16) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * f17 * f18;
        if (((double) atan2) < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) ciz.A04), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ciz.A06) * ciz.A07) * ((float) BE9.A00(f9, f10))) / (f12 + 0.305f)), 0.9d));
        float sqrt2 = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        float f19 = f18 * sqrt2;
        float log = ((float) Math.log((double) ((0.0228f * f19) + 1.0f))) * 43.85965f;
        double d2 = (double) f14;
        float cos = ((float) Math.cos(d2)) * log;
        float sin = log * ((float) Math.sin(d2));
        fArr6[0] = atan2;
        fArr6[1] = sqrt2;
        fArr[0] = pow4;
        fArr[1] = sqrt;
        fArr[2] = f19;
        fArr[3] = ((float) Math.sqrt((double) ((pow5 * f16) / f17))) * 50.0f;
        fArr[4] = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        fArr[5] = cos;
        fArr[6] = sin;
        return new C25985Cpz(fArr6[0], fArr6[1], fArr[0], fArr[4], fArr[5], sin);
    }

    public static C25985Cpz A00(float f, float f2, float f3) {
        float f4 = f3;
        float log = ((float) Math.log((((double) (f2 * C25619Ciz.A0A.A03)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (double) ((3.1415927f * f3) / 180.0f);
        return new C25985Cpz(f4, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public int A02(C25619Ciz ciz) {
        float f;
        float f2 = this.A02;
        if (((double) f2) != 0.0d) {
            double d = (double) this.A04;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                C25619Ciz ciz2 = ciz;
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) ciz2.A04), 0.73d), 1.1111111111111112d);
                double d2 = (double) ((this.A03 * 3.1415927f) / 180.0f);
                float cos = ((float) (Math.cos(d2 + 2.0d) + 3.8d)) * 0.25f * 3846.1538f * ciz2.A06 * ciz2.A07;
                float pow2 = (ciz2.A00 * ((float) Math.pow(((double) this.A04) / 100.0d, (1.0d / ((double) ciz2.A01)) / ((double) ciz2.A08)))) / ciz2.A05;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f3 = (((0.305f + pow2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f4 = cos2 * f3;
                float f5 = f3 * sin;
                float f6 = pow2 * 460.0f;
                float f7 = ((f6 + (451.0f * f4)) + (288.0f * f5)) / 1403.0f;
                float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
                float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
                double abs = (double) Math.abs(f7);
                float signum = Math.signum(f7);
                float f10 = 100.0f / ciz2.A02;
                float pow3 = signum * f10 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs))), 2.380952380952381d));
                double abs2 = (double) Math.abs(f8);
                float signum2 = Math.signum(f8) * f10 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs2 * 27.13d) / (400.0d - abs2))), 2.380952380952381d));
                double abs3 = (double) Math.abs(f9);
                float signum3 = Math.signum(f9) * f10 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs3))), 2.380952380952381d));
                float[] fArr = ciz2.A09;
                float f11 = pow3 / fArr[0];
                float f12 = signum2 / fArr[1];
                float f13 = signum3 / fArr[2];
                float[][] fArr2 = C25456Cg8.A01;
                float[] fArr3 = fArr2[0];
                float A032 = BE6.A03(fArr3, f13, BE6.A03(fArr3, f12, fArr3[0] * f11, 1), 2);
                float[] fArr4 = fArr2[1];
                float A033 = BE6.A03(fArr4, f13, BE6.A03(fArr4, f12, fArr4[0] * f11, 1), 2);
                float[] fArr5 = fArr2[2];
                return AnonymousClass1Z2.A02((double) A032, (double) A033, (double) ((f11 * fArr5[0]) + (f12 * fArr5[1]) + (f13 * fArr5[2])));
            }
        }
        f = 0.0f;
        C25619Ciz ciz22 = ciz;
        float pow4 = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) ciz22.A04), 0.73d), 1.1111111111111112d);
        double d22 = (double) ((this.A03 * 3.1415927f) / 180.0f);
        float cos3 = ((float) (Math.cos(d22 + 2.0d) + 3.8d)) * 0.25f * 3846.1538f * ciz22.A06 * ciz22.A07;
        float pow22 = (ciz22.A00 * ((float) Math.pow(((double) this.A04) / 100.0d, (1.0d / ((double) ciz22.A01)) / ((double) ciz22.A08)))) / ciz22.A05;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f32 = (((0.305f + pow22) * 23.0f) * pow4) / (((cos3 * 23.0f) + ((11.0f * pow4) * cos22)) + ((pow4 * 108.0f) * sin2));
        float f42 = cos22 * f32;
        float f52 = f32 * sin2;
        float f62 = pow22 * 460.0f;
        float f72 = ((f62 + (451.0f * f42)) + (288.0f * f52)) / 1403.0f;
        float f82 = ((f62 - (891.0f * f42)) - (261.0f * f52)) / 1403.0f;
        float f92 = ((f62 - (f42 * 220.0f)) - (f52 * 6300.0f)) / 1403.0f;
        double abs4 = (double) Math.abs(f72);
        float signum4 = Math.signum(f72);
        float f102 = 100.0f / ciz22.A02;
        float pow32 = signum4 * f102 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs4 * 27.13d) / (400.0d - abs4))), 2.380952380952381d));
        double abs22 = (double) Math.abs(f82);
        float signum22 = Math.signum(f82) * f102 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs22 * 27.13d) / (400.0d - abs22))), 2.380952380952381d));
        double abs32 = (double) Math.abs(f92);
        float signum32 = Math.signum(f92) * f102 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs32 * 27.13d) / (400.0d - abs32))), 2.380952380952381d));
        float[] fArr6 = ciz22.A09;
        float f112 = pow32 / fArr6[0];
        float f122 = signum22 / fArr6[1];
        float f132 = signum32 / fArr6[2];
        float[][] fArr22 = C25456Cg8.A01;
        float[] fArr32 = fArr22[0];
        float A0322 = BE6.A03(fArr32, f132, BE6.A03(fArr32, f122, fArr32[0] * f112, 1), 2);
        float[] fArr42 = fArr22[1];
        float A0332 = BE6.A03(fArr42, f132, BE6.A03(fArr42, f122, fArr42[0] * f112, 1), 2);
        float[] fArr52 = fArr22[2];
        return AnonymousClass1Z2.A02((double) A0322, (double) A0332, (double) ((f112 * fArr52[0]) + (f122 * fArr52[1]) + (f132 * fArr52[2])));
    }

    public C25985Cpz(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A03 = f;
        this.A02 = f2;
        this.A04 = f3;
        this.A05 = f4;
        this.A00 = f5;
        this.A01 = f6;
    }
}
