package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.6Vx  reason: invalid class name and case insensitive filesystem */
public abstract class C123806Vx {
    public static void A00(WaImageView waImageView, int i) {
        boolean z = true;
        if (!(i == 3 || i == 1)) {
            z = false;
        }
        Drawable drawable = waImageView.getDrawable();
        if (!z || drawable == null) {
            AnonymousClass3MW.A1R(waImageView);
            waImageView.setRotation(((float) i) * -90.0f);
            return;
        }
        waImageView.setRotation(0.0f);
        waImageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix A0J = C108945cZ.A0J();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int A03 = C108995ce.A03(waImageView);
        int A04 = C72473Md.A04(waImageView);
        int i2 = intrinsicWidth * A03;
        int i3 = A04 * intrinsicHeight;
        float f = (float) A04;
        float f2 = f;
        float f3 = (float) intrinsicWidth;
        float f4 = f3;
        if (i2 > i3) {
            f = (float) A03;
            f3 = (float) intrinsicHeight;
        }
        float f5 = f / f3;
        float f6 = (float) intrinsicHeight;
        A0J.setRotate(((float) i) * -90.0f, f4 / 2.0f, f6 / 2.0f);
        A0J.postScale(f5, f5);
        A0J.postTranslate((float) Math.round((((float) A03) - (f4 * f5)) * 0.5f), (float) Math.round((f2 - (f6 * f5)) * 0.5f));
        waImageView.setImageMatrix(A0J);
    }
}
