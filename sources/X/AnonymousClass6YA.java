package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* renamed from: X.6YA  reason: invalid class name */
public abstract class AnonymousClass6YA {
    public static final SpannableStringBuilder A00(Context context, int i, int i2, int i3) {
        Drawable A00 = C24261Jm.A00(context, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (A00 != null) {
            spannableStringBuilder.append(' ').append(' ');
            A00.setBounds(0, 0, i, i);
            A00.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            spannableStringBuilder.setSpan(new ImageSpan(A00), 1, 2, 33);
        }
        return spannableStringBuilder;
    }
}
