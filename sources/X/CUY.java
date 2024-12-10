package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

public final class CUY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public StaticLayout A0L;
    public CharSequence A0M;
    public boolean A0N;
    public boolean A0O;
    public final float A0P;
    public final float A0Q;
    public final float A0R;
    public final float A0S;
    public final float A0T;
    public final Paint A0U;
    public final TextPaint A0V;

    public CUY(Context context) {
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 16843287;
        A1W[1] = 16843288;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, A1W, 0, 0);
        this.A0S = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0T = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) C108965cb.A08(context).densityDpi) * 2.0f) / 160.0f);
        this.A0P = round;
        this.A0R = round;
        this.A0Q = round;
        TextPaint textPaint = new TextPaint();
        this.A0V = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint A062 = AnonymousClass3MW.A06();
        this.A0U = A062;
        A062.setAntiAlias(true);
        C108945cZ.A1L(A062);
    }
}
