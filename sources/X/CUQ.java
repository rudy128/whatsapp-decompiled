package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public class CUQ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Path A0E;
    public boolean A0F;
    public int[] A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final RectF A0K = AnonymousClass3MW.A08();

    public CUQ() {
        Paint A062 = AnonymousClass3MW.A06();
        this.A0J = A062;
        Paint A063 = AnonymousClass3MW.A06();
        this.A0H = A063;
        Paint A064 = AnonymousClass3MW.A06();
        this.A0I = A064;
        this.A04 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 0.0f;
        this.A08 = 5.0f;
        this.A00 = 1.0f;
        this.A09 = 255;
        A062.setStrokeCap(Paint.Cap.SQUARE);
        A062.setAntiAlias(true);
        AnonymousClass3MW.A1P(A062);
        C108945cZ.A1L(A063);
        A063.setAntiAlias(true);
        A064.setColor(0);
    }
}
