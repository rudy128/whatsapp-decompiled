package X;

import android.graphics.Point;

/* renamed from: X.CtJ  reason: case insensitive filesystem */
public final class C26152CtJ {
    public final DAE A00;
    public final C199339zp A01 = new Object();
    public final float[] A02 = C108945cZ.A1V();

    public static double A01(double d) {
        return (d + 180.0d) / 360.0d;
    }

    public static double A02(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public double A03(float f) {
        BIS bis = this.A00.A0Q;
        return (double) (f / (((float) bis.A0J) * bis.A0B));
    }

    public Point A04(C20269AEc aEc) {
        double d = aEc.A00;
        double d2 = aEc.A01;
        float[] fArr = this.A02;
        A08(fArr, A01(d2), A00(d));
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public C20269AEc A05(float f, float f2) {
        float[] fArr = this.A02;
        A0A(fArr, f, f2);
        return new C20269AEc(A02((double) fArr[1]), (((double) fArr[0]) * 360.0d) - 180.0d);
    }

    public C25216CbC A06() {
        DAE dae = this.A00;
        BIS bis = dae.A0Q;
        C20269AEc A05 = A05(0.0f, (float) (bis.A0D - dae.A04));
        C20269AEc A052 = A05((float) (bis.A0F - dae.A05), (float) (bis.A0D - dae.A04));
        C20269AEc A053 = A05(0.0f, (float) dae.A06);
        C20269AEc A054 = A05((float) (bis.A0F - dae.A05), (float) dae.A06);
        CZ0 cz0 = new CZ0();
        cz0.A01(A05);
        cz0.A01(A053);
        cz0.A01(A052);
        cz0.A01(A054);
        return new C25216CbC(A05, A052, A053, A054, cz0.A00());
    }

    public final void A07(C199339zp r9) {
        BIS bis = this.A00.A0Q;
        double d = bis.A03;
        double d2 = bis.A01;
        r9.A03 = d - d2;
        r9.A00 = d + d2;
        double d3 = bis.A02;
        double d4 = bis.A00;
        double d5 = d3 - d4;
        r9.A01 = d5;
        double d6 = d3 + d4;
        r9.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (double) ((int) Math.ceil(-d5));
            r9.A01 = d5 + ceil;
            r9.A02 = d6 + ceil;
        }
    }

    public void A08(float[] fArr, double d, double d2) {
        C199339zp r3 = this.A01;
        A07(r3);
        double d3 = r3.A01;
        if (d < d3 || d > r3.A02) {
            d += (double) ((int) Math.ceil(d3 - d));
            double d4 = r3.A02;
            if (d > d4) {
                double d5 = d - d4;
                double d6 = d - 1.0d;
                if (d3 - d6 < d5) {
                    d = d6;
                }
            }
        }
        A09(fArr, d, d2);
    }

    public void A09(float[] fArr, double d, double d2) {
        BIS bis = this.A00.A0Q;
        double d3 = bis.A02;
        C199339zp r6 = this.A01;
        A07(r6);
        double d4 = r6.A01;
        if (d4 > d3 || d3 > r6.A02) {
            d3 += (double) ((int) Math.ceil(d4 - d3));
        }
        float f = (float) bis.A0J;
        fArr[0] = ((float) (d - d3)) * f;
        fArr[1] = ((float) (d2 - bis.A03)) * f;
        bis.A0e.mapVectors(fArr);
        fArr[0] = fArr[0] + bis.A04;
        fArr[1] = fArr[1] + bis.A05;
    }

    public void A0A(float[] fArr, float f, float f2) {
        BIS bis = this.A00.A0Q;
        fArr[0] = f - bis.A04;
        fArr[1] = f2 - bis.A05;
        bis.A0f.mapVectors(fArr);
        double d = bis.A02;
        double d2 = (double) fArr[0];
        double d3 = (double) bis.A0J;
        double d4 = d + (d2 / d3);
        double d5 = bis.A03 + (((double) fArr[1]) / d3);
        if (d4 > 1.0d) {
            d4 -= 1.0d;
        } else if (d4 < 0.0d) {
            d4 += 1.0d;
        }
        fArr[0] = (float) d4;
        fArr[1] = (float) d5;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9zp, java.lang.Object] */
    public C26152CtJ(DAE dae) {
        this.A00 = dae;
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }
}
