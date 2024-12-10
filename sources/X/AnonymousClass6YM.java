package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.6YM  reason: invalid class name */
public abstract class AnonymousClass6YM {
    public static boolean A00 = true;

    public static void A00(Matrix matrix, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, C108995ce.A03(imageView), C72473Md.A04(imageView));
                imageView.invalidate();
            }
        } else if (A00) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
