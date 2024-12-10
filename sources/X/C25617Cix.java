package X;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.Cix  reason: case insensitive filesystem */
public class C25617Cix {
    public float A00;
    public float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;

    public C25617Cix(float f, float f2, int i, float f3, int i2, float f4) {
        this.A06 = i;
        this.A04 = f3;
        this.A05 = f4;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = A00(0.3f, f3, f4, i2);
        this.A08 = A00(0.5f, f3 * 1.5f, 1.5f * f4, i2);
        this.A09 = A00(0.8f, f3 * 2.0f, f4 * 2.0f, i2);
    }

    public static Paint A00(float f, float f2, float f3, int i) {
        Paint A062 = AnonymousClass3MW.A06();
        A062.setAntiAlias(false);
        C108945cZ.A1L(A062);
        A062.setDither(true);
        float max = Math.max(f2, f3);
        int[] A1W = C108945cZ.A1W();
        C25346Ce5.A01(A1W, f, i, 0);
        C25346Ce5.A01(A1W, 0.0f, i, 1);
        A062.setShader(new RadialGradient(0.0f, 0.0f, max, A1W, (float[]) null, Shader.TileMode.CLAMP));
        return A062;
    }
}
