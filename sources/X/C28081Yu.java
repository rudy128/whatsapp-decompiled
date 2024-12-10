package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.1Yu  reason: invalid class name and case insensitive filesystem */
public abstract class C28081Yu {
    public static void A00(ColorStateList colorStateList, ImageView imageView) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C28091Yv.A01(colorStateList, imageView);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && C28091Yv.A00(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void A01(PorterDuff.Mode mode, ImageView imageView) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C28091Yv.A02(mode, imageView);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && C28091Yv.A00(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
