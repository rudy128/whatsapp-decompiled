package X;

/* renamed from: X.09h  reason: invalid class name and case insensitive filesystem */
public final class C016409h extends C03710Kf {
    public static final float[] A00;
    public static final float[] A01;
    public static final float[] A02;
    public static final float[] A03;

    public float A03(float f, float f2, float f3) {
        float A022 = C28851b7.A02(f, 0.0f, 1.0f);
        float A023 = C28851b7.A02(f2, -0.5f, 0.5f);
        float A024 = C28851b7.A02(f3, -0.5f, 0.5f);
        float[] fArr = A01;
        float A09 = AnonymousClass001.A09(fArr, A022, A023, A024);
        float A08 = AnonymousClass001.A08(fArr, A022, A023, A024);
        float A07 = AnonymousClass001.A07(fArr, A022, A023, A024);
        return AnonymousClass001.A07(A00, A09 * A09 * A09, A08 * A08 * A08, A07 * A07 * A07);
    }

    public float A04(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    public float A05(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    public long A06(float f, float f2, float f3) {
        float A022 = C28851b7.A02(f, 0.0f, 1.0f);
        float A023 = C28851b7.A02(f2, -0.5f, 0.5f);
        float A024 = C28851b7.A02(f3, -0.5f, 0.5f);
        float[] fArr = A01;
        float A09 = AnonymousClass001.A09(fArr, A022, A023, A024);
        float A08 = AnonymousClass001.A08(fArr, A022, A023, A024);
        float A07 = AnonymousClass001.A07(fArr, A022, A023, A024);
        float f4 = A09 * A09 * A09;
        float f5 = A08 * A08 * A08;
        float f6 = A07 * A07 * A07;
        float[] fArr2 = A00;
        float A092 = AnonymousClass001.A09(fArr2, f4, f5, f6);
        float A082 = AnonymousClass001.A08(fArr2, f4, f5, f6);
        return (((long) Float.floatToRawIntBits(A092)) << 32) | (((long) Float.floatToRawIntBits(A082)) & 4294967295L);
    }

    static {
        float[] A04 = C04960Pr.A04(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C04960Pr.A05(AnonymousClass0MZ.A01.A00, C03060Gl.A01.A00(), C03060Gl.A03.A00()));
        A02 = A04;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        A03 = fArr;
        A00 = C04960Pr.A03(A04);
        A01 = C04960Pr.A03(fArr);
    }

    public long A07(C03710Kf r11, float f, float f2, float f3, float f4) {
        float[] fArr = A02;
        float A09 = AnonymousClass001.A09(fArr, f, f2, f3);
        float A08 = AnonymousClass001.A08(fArr, f, f2, f3);
        float A07 = AnonymousClass001.A07(fArr, f, f2, f3);
        float signum = Math.signum(A09) * ((float) Math.pow((double) Math.abs(A09), 0.3333333432674408d));
        float signum2 = Math.signum(A08) * ((float) Math.pow((double) Math.abs(A08), 0.3333333432674408d));
        float signum3 = Math.signum(A07) * ((float) Math.pow((double) Math.abs(A07), 0.3333333432674408d));
        float[] fArr2 = A03;
        return AnonymousClass0Oy.A03(r11, AnonymousClass001.A09(fArr2, signum, signum2, signum3), AnonymousClass001.A08(fArr2, signum, signum2, signum3), AnonymousClass001.A07(fArr2, signum, signum2, signum3), f4);
    }
}
