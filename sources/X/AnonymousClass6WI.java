package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.6WI  reason: invalid class name */
public abstract class AnonymousClass6WI {
    public static Bitmap A00(Drawable... drawableArr) {
        int length = drawableArr.length;
        if (length == 0) {
            return null;
        }
        Bitmap A0H = C108945cZ.A0H(Math.max(drawableArr[0].getIntrinsicWidth(), 0), Math.max(drawableArr[0].getIntrinsicHeight(), 0));
        Canvas A0I = C108945cZ.A0I(A0H);
        int i = 0;
        do {
            Drawable drawable = drawableArr[i];
            drawable.setBounds(0, 0, Math.max(drawable.getIntrinsicWidth(), 0), Math.max(drawable.getIntrinsicHeight(), 0));
            drawable.draw(A0I);
            i++;
        } while (i < length);
        return A0H;
    }
}
