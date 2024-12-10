package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: X.CPw  reason: case insensitive filesystem */
public final class C24923CPw {
    public final Paint A00;
    public final Paint A01;
    public final TextPaint A02;

    public C24923CPw(Context context) {
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 16843287;
        A1W[1] = 16843288;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, A1W, 0, 0);
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        context.getResources().getDisplayMetrics();
        TextPaint textPaint = new TextPaint();
        this.A02 = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint A06 = AnonymousClass3MW.A06();
        this.A01 = A06;
        A06.setAntiAlias(true);
        C108945cZ.A1L(A06);
        Paint A062 = AnonymousClass3MW.A06();
        this.A00 = A062;
        A062.setAntiAlias(true);
        A062.setFilterBitmap(true);
    }
}
