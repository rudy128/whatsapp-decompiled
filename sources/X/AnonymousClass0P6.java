package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.0P6  reason: invalid class name */
public final class AnonymousClass0P6 {
    public static final boolean A02(AnonymousClass0C6 r1) {
        C22825BRd bRd = r1.A04;
        if (bRd == null) {
            return false;
        }
        if (!bRd.A01() || !bRd.A02()) {
            return bRd.A04();
        }
        return true;
    }

    public static final E4Q A00(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C18070vi.A0z(drawable, "null cannot be cast to non-null type com.facebook.fresco.vito.core.FrescoDrawableInterface");
            return (E4Q) drawable;
        }
        throw AnonymousClass000.A0n("imageView.drawable is null");
    }
}
