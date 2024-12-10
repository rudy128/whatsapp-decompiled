package X;

import android.graphics.Bitmap;

/* renamed from: X.4Hr  reason: invalid class name and case insensitive filesystem */
public abstract class C84054Hr {
    public static final Bitmap A00(Bitmap bitmap, int i, int i2) {
        if (!(i == 0 || i2 == 0 || bitmap.getWidth() == 0 || bitmap.getHeight() == 0)) {
            float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
            if (min != 1.0f) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
                C18070vi.A0X(createScaledBitmap);
                if (!createScaledBitmap.equals(bitmap)) {
                    bitmap.recycle();
                }
                return createScaledBitmap;
            }
        }
        return bitmap;
    }
}
