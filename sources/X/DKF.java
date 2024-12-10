package X;

import java.nio.charset.Charset;

public final class DKF implements E9H {
    public final C23450BhF A00;

    public static void A00(Object obj, int i, int i2) {
        C23450BhF bhF = ((DKF) obj).A00;
        bhF.A05((i << 3) | 5);
        bhF.A06(i2);
    }

    public static void A01(Object obj, int i, long j) {
        C23450BhF bhF = ((DKF) obj).A00;
        bhF.A05((i << 3) | 1);
        bhF.A0A(j);
    }

    public static void A02(Object obj, int i, long j) {
        C23450BhF bhF = ((DKF) obj).A00;
        bhF.A05(i << 3);
        bhF.A09(j);
    }

    public final void CT1(int i, double d) {
        C23450BhF bhF = this.A00;
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        bhF.A05((i << 3) | 1);
        bhF.A0A(doubleToRawLongBits);
    }

    public final void CT2(int i, float f) {
        C23450BhF bhF = this.A00;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        bhF.A05((i << 3) | 5);
        bhF.A06(floatToRawIntBits);
    }

    public final void CTB(EAD ead, Object obj, int i) {
        C23450BhF bhF = this.A00;
        C28663EDa eDa = (C28663EDa) obj;
        C25876Cnk.A06(bhF, i);
        bhF.A05(DK6.A06(ead, eDa));
        ead.CT7(bhF.A01, eDa);
    }

    public final void CTM(EAD ead, Object obj, int i) {
        C23450BhF bhF = this.A00;
        int i2 = i << 3;
        bhF.A05(i2 | 3);
        ead.CT7(bhF.A01, obj);
        bhF.A05(i2 | 4);
    }

    public DKF(C23450BhF bhF) {
        Charset charset = C25462CgF.A00;
        this.A00 = bhF;
        bhF.A01 = this;
    }
}
