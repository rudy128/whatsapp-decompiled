package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.4G1  reason: invalid class name */
public abstract class AnonymousClass4G1 {
    public static final BitmapDrawable A00(Context context, float f) {
        Paint A0A = AnonymousClass3MZ.A0A();
        A0A.setTextSize(f);
        A0A.setTextAlign(Paint.Align.LEFT);
        Rect A07 = AnonymousClass3MW.A07();
        A0A.getTextBounds("👋", 0, "👋".length(), A07);
        Bitmap createBitmap = Bitmap.createBitmap(A07.width(), A07.height(), Bitmap.Config.ARGB_8888);
        C18070vi.A0X(createBitmap);
        new Canvas(createBitmap).drawText("👋", -((float) A07.left), -((float) A07.top), A0A);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
