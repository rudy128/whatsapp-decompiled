package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.C9h  reason: case insensitive filesystem */
public abstract class C24561C9h {
    public static final void A00(Drawable drawable, TextView textView) {
        if (textView.getTextCursorDrawable() != drawable) {
            textView.setTextCursorDrawable(drawable);
        }
    }
}
