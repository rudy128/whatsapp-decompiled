package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;

/* renamed from: X.6Wi  reason: invalid class name and case insensitive filesystem */
public abstract class C123916Wi {
    public static final Bitmap A00(Bitmap bitmap, int i, int i2) {
        String str;
        if (!(bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap = null;
            if (i > 0 && i2 > 0) {
                try {
                    return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError e) {
                    e = e;
                    str = "oom trying to create bitmap cache";
                    Log.i(str, e);
                    return bitmap;
                } catch (NullPointerException e2) {
                    e = e2;
                    str = "NPE trying to create bitmap cache";
                    Log.i(str, e);
                    return bitmap;
                }
            }
        }
        return bitmap;
    }
}
