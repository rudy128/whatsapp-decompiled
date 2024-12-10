package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.4GF  reason: invalid class name */
public abstract class AnonymousClass4GF {
    public static final Bitmap A00(Context context, String str, int i, int i2, int i3) {
        C18070vi.A0d(context, 0);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        C18070vi.A0X(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Paint A06 = AnonymousClass3MW.A06();
        AnonymousClass3MZ.A1D(i2, A06);
        float f = (float) i;
        canvas.drawOval(0.0f, 0.0f, f, f, A06);
        Paint A062 = AnonymousClass3MW.A06();
        A062.setColor(i3);
        float f2 = f / 2.0f;
        A062.setTextSize(f2);
        A062.setTextAlign(Paint.Align.CENTER);
        A062.setTypeface(C43421zm.A00());
        canvas.drawText(str, f2, f2 - ((A062.descent() + A062.ascent()) / 2.0f), A062);
        return createBitmap;
    }
}
