package X;

import android.content.Context;
import android.graphics.Color;

/* renamed from: X.1Z8  reason: invalid class name */
public class AnonymousClass1Z8 {
    public static final int A05 = ((int) Math.round(5.1000000000000005d));
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public int A00(int i, float f) {
        float f2;
        int i2;
        if (!this.A04 || AnonymousClass1Z2.A06(i, 255) != this.A01) {
            return i;
        }
        float f3 = this.A00;
        if (f3 <= 0.0f || f <= 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = Math.min(((((float) Math.log1p((double) (f / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i);
        int A002 = AnonymousClass1ZA.A00(f2, AnonymousClass1Z2.A06(i, 255), this.A03);
        if (f2 > 0.0f && (i2 = this.A02) != 0) {
            A002 = AnonymousClass1Z2.A05(AnonymousClass1Z2.A06(i2, A05), A002);
        }
        return AnonymousClass1Z2.A06(A002, alpha);
    }

    public AnonymousClass1Z8(Context context) {
        boolean A032 = AnonymousClass1Z9.A03(context, 2130969434, false);
        int A012 = AnonymousClass1ZA.A01(context, 2130969433, 0);
        int A013 = AnonymousClass1ZA.A01(context, 2130969432, 0);
        int A014 = AnonymousClass1ZA.A01(context, 2130969148, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.A04 = A032;
        this.A03 = A012;
        this.A02 = A013;
        this.A01 = A014;
        this.A00 = f;
    }
}
