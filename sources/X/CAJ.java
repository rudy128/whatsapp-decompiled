package X;

public abstract class CAJ {
    public static void A00(C25752ClM clM, float f, int i) {
        int i2;
        if (f > 1.0f) {
            clM.A0A = i;
            i2 = (int) (((float) i) / f);
            clM.A08 = i2;
        } else {
            clM.A08 = i;
            i2 = i;
            i = (int) (((float) i) * f);
            clM.A0A = i;
        }
        int i3 = i;
        int i4 = i % 16;
        if (i4 != 0) {
            i3 = i + (16 - i4);
        }
        int i5 = (int) (((float) i2) * (((float) i3) / ((float) i)));
        clM.A08 = i5;
        clM.A0A = i3;
        int i6 = i5 % 16;
        if (i6 != 0) {
            i5 += 16 - i6;
        }
        clM.A08 = i5;
    }
}
