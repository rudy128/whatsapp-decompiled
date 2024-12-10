package X;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.1Z1  reason: invalid class name */
public class AnonymousClass1Z1 {
    public static final float[] A08 = {0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] A09 = {0.0f, 0.5f, 1.0f};
    public static final int[] A0A = new int[4];
    public static final int[] A0B = new int[3];
    public int A00;
    public int A01;
    public int A02;
    public final Paint A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07 = new Path();

    public AnonymousClass1Z1() {
        Paint paint = new Paint();
        this.A06 = paint;
        this.A05 = new Paint();
        A00(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.A04 = new Paint(paint2);
    }

    public void A00(int i) {
        int A062 = AnonymousClass1Z2.A06(i, 68);
        this.A02 = A062;
        this.A01 = AnonymousClass1Z2.A06(i, 20);
        this.A00 = i & 16777215;
        this.A05.setColor(A062);
    }
}
