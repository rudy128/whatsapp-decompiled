package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: X.1Yv  reason: invalid class name and case insensitive filesystem */
public abstract class C28091Yv {
    public static ColorStateList A00(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static void A01(ColorStateList colorStateList, ImageView imageView) {
        imageView.setImageTintList(colorStateList);
    }

    public static void A02(PorterDuff.Mode mode, ImageView imageView) {
        imageView.setImageTintMode(mode);
    }
}
