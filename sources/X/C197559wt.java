package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.9wt  reason: invalid class name and case insensitive filesystem */
public abstract class C197559wt {
    public static Paint A00;
    public static Paint A01;
    public static Paint A02;
    public static Paint A03;
    public static Paint A04;
    public static TextPaint A05;
    public static TextPaint A06;

    public static final Paint A00(Context context) {
        Paint paint = A00;
        if (paint == null) {
            paint = new Paint();
            paint.setARGB(255, 255, 255, 255);
            paint.setTextSize(AnonymousClass8BR.A01(context, 12.0f));
            paint.setTextAlign(Paint.Align.LEFT);
            Typeface typeface = C180519Mw.A00;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
                C180519Mw.A00 = typeface;
            }
            C17960vV.A07(typeface);
            C18070vi.A0X(typeface);
            paint.setTypeface(typeface);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(8.0f);
            A00 = paint;
        }
        return paint;
    }

    public static final Paint A01(Context context) {
        Paint paint = A04;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        paint2.setARGB(255, 255, 255, 255);
        paint2.setTextSize(AnonymousClass8BR.A01(context, 10.0f));
        paint2.setTextAlign(Paint.Align.LEFT);
        paint2.setTypeface(Typeface.DEFAULT);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(6.0f);
        A04 = paint2;
        return paint2;
    }
}
