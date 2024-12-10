package X;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.0FX  reason: invalid class name */
public abstract class AnonymousClass0FX {
    public static final AnonymousClass0WQ A00(Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, (Resources.Theme) null);
        C18070vi.A0z(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return new AnonymousClass0WQ(((BitmapDrawable) drawable).getBitmap());
    }
}
