package X;

/* renamed from: X.CjH  reason: case insensitive filesystem */
public final class C25631CjH {
    public static final C25631CjH A00 = new Object();
    public static final float[] A01 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static final Object[] A02;
    public static volatile AnonymousClass04B A03 = new AnonymousClass04B(10);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CjH, java.lang.Object] */
    static {
        Object[] objArr = new Object[0];
        A02 = objArr;
        synchronized (objArr) {
            int i = (int) (1.15f * 100.0f);
            A03.A02(i, new D6F(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            int i2 = (int) (1.3f * 100.0f);
            A03.A02(i2, new D6F(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            int i3 = (int) (1.5f * 100.0f);
            A03.A02(i3, new D6F(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            int i4 = (int) (1.8f * 100.0f);
            A03.A02(i4, new D6F(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            int i5 = (int) (2.0f * 100.0f);
            A03.A02(i5, new D6F(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((((float) A03.A01[0]) / 100.0f) - 0.01f <= 1.03f) {
            throw AnonymousClass000.A0n("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public final E79 A00(float f) {
        float f2;
        E79 e79;
        float f3;
        D6F d6f;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (100.0f * f);
        E79 e792 = (E79) AnonymousClass0LW.A00(A03, i);
        if (e792 != null) {
            return e792;
        }
        AnonymousClass04B r0 = A03;
        int A002 = AnonymousClass00Q.A00(r0.A01, r0.A00, i);
        if (A002 >= 0) {
            return (E79) A03.A02[A002];
        }
        int i2 = (-(A002 + 1)) - 1;
        int i3 = i2 + 1;
        if (i3 >= A03.A00) {
            d6f = new D6F(new float[]{1.0f}, new float[]{f});
        } else {
            if (i2 < 0) {
                float[] fArr = A01;
                e79 = new D6F(fArr, fArr);
                f2 = 1.0f;
            } else {
                f2 = ((float) A03.A01[i2]) / 100.0f;
                e79 = (E79) A03.A02[i2];
            }
            float f4 = ((float) A03.A01[i3]) / 100.0f;
            if (f2 == f4) {
                f3 = 0.0f;
            } else {
                f3 = (f - f2) / (f4 - f2);
            }
            float A012 = 0.0f + ((1.0f - 0.0f) * BE8.A01(1.0f, f3, 0.0f));
            E79 e793 = (E79) A03.A02[i3];
            float[] fArr2 = A01;
            float[] fArr3 = new float[9];
            int i4 = 0;
            do {
                float f5 = fArr2[i4];
                float BFu = e79.BFu(f5);
                fArr3[i4] = BFu + ((e793.BFu(f5) - BFu) * A012);
                i4++;
            } while (i4 < 9);
            d6f = new D6F(fArr2, fArr3);
        }
        synchronized (A02) {
            AnonymousClass04B A003 = A03.clone();
            A003.A02(i, d6f);
            A03 = A003;
        }
        return d6f;
    }
}
