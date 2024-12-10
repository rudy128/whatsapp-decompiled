package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Xp  reason: invalid class name and case insensitive filesystem */
public abstract class C124246Xp {
    public static final Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.RGB_565);
        Canvas A0E = C108955ca.A0E(createBitmap);
        drawable.setBounds(0, 0, A0E.getWidth(), A0E.getHeight());
        drawable.draw(A0E);
        return createBitmap;
    }
}
