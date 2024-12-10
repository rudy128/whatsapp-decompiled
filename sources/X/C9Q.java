package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public abstract class C9Q {
    public static Bitmap A00(Bitmap bitmap, C26132Csv csv, int i, boolean z) {
        C26132Csv A01;
        int i2;
        int i3;
        Bitmap bitmap2;
        if (!AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread())) {
            Bitmap bitmap3 = bitmap;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (csv == null) {
                A01 = null;
            } else {
                A01 = C25314CdK.A01(new C26132Csv(width, height), csv);
            }
            if (!z && A01 == null && i == 0) {
                return bitmap;
            }
            Matrix A0J = C108945cZ.A0J();
            if (A01 != null) {
                i2 = A01.A02;
                i3 = A01.A01;
            } else {
                i2 = width;
                i3 = height;
            }
            if (i != 0) {
                A0J.postRotate((float) i);
            }
            if (z) {
                A0J.preScale(-1.0f, 1.0f);
            }
            try {
                bitmap2 = Bitmap.createBitmap(bitmap3, (width - i2) / 2, (height - i3) / 2, i2, i3, A0J, false);
            } catch (Throwable unused) {
                bitmap2 = null;
            }
            if (bitmap3 != bitmap2) {
                bitmap3.recycle();
            }
            return bitmap2;
        }
        throw AnonymousClass8BR.A0w("Method processBitmap must be invoked on a background thread");
    }
}
