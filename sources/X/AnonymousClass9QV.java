package X;

import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;

/* renamed from: X.9QV  reason: invalid class name */
public abstract class AnonymousClass9QV {
    public static final byte[] A00(byte[] bArr, boolean z) {
        if (z && bArr != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i = options.outHeight;
                if (options.outWidth > 300 || i > 300) {
                    return null;
                }
            } catch (IllegalArgumentException e) {
                Log.w("ThumbnailConverter: Failed to decode thumbnail", e);
            }
        }
        return bArr;
    }
}
