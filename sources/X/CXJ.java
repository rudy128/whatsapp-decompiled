package X;

import java.nio.FloatBuffer;

public class CXJ {
    public static final FloatBuffer A07;
    public static final FloatBuffer A08;
    public static final FloatBuffer A09;
    public static final FloatBuffer A0A;
    public static final FloatBuffer A0B;
    public static final FloatBuffer A0C;
    public static final float[] A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public static final float[] A0G;
    public static final float[] A0H;
    public static final float[] A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public FloatBuffer A05;
    public FloatBuffer A06;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0H = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0I = fArr2;
        float[] fArr3 = C26070Crk.A00;
        FloatBuffer A0i = BEB.A0i(fArr, 24);
        A0i.position(0);
        A0B = A0i;
        FloatBuffer A0i2 = BEB.A0i(fArr2, 24);
        A0i2.position(0);
        A0C = A0i2;
        float[] fArr4 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0F = fArr4;
        float[] fArr5 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        A0G = fArr5;
        FloatBuffer A0i3 = BEB.A0i(fArr4, 32);
        A0i3.position(0);
        A09 = A0i3;
        FloatBuffer A0i4 = BEB.A0i(fArr5, 32);
        A0i4.position(0);
        A0A = A0i4;
        float[] fArr6 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0D = fArr6;
        float[] fArr7 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0E = fArr7;
        FloatBuffer A0i5 = BEB.A0i(fArr6, 32);
        A0i5.position(0);
        A07 = A0i5;
        FloatBuffer A0i6 = BEB.A0i(fArr7, 32);
        A0i6.position(0);
        A08 = A0i6;
    }

    public String toString() {
        String str;
        Integer num = this.A04;
        if (num == null) {
            return "[Drawable2d: ...]";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[Drawable2d: ");
        switch (num.intValue()) {
            case 1:
                str = "RECTANGLE";
                break;
            case 2:
                str = "FULL_RECTANGLE";
                break;
            default:
                str = "TRIANGLE";
                break;
        }
        return BEA.A0m(str, A10);
    }
}
