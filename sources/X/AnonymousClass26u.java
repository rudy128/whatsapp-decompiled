package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.26u  reason: invalid class name */
public final class AnonymousClass26u extends InsetDrawable {
    public final PorterDuffColorFilter A00 = new PorterDuffColorFilter(-1, PorterDuff.Mode.DST);

    public AnonymousClass26u(Drawable drawable) {
        super(drawable, 0);
        A00();
    }

    private final void A00() {
        super.setColorFilter(this.A00);
        super.setTintList((ColorStateList) null);
        super.setTintMode(PorterDuff.Mode.DST);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        A00();
    }

    public void setTintList(ColorStateList colorStateList) {
        A00();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        A00();
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        A00();
    }
}
