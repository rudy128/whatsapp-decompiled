package X;

import android.graphics.Bitmap;

/* renamed from: X.6LI  reason: invalid class name */
public class AnonymousClass6LI extends A34 {
    public Bitmap[] A00;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i = 0;
        while (true) {
            Bitmap[] bitmapArr = this.A00;
            if (i >= bitmapArr.length) {
                return null;
            }
            Bitmap bitmap = bitmapArr[i];
            if (bitmap != null) {
                bitmap.recycle();
                bitmapArr[i] = null;
            }
            i++;
        }
    }
}
