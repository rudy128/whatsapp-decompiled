package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: X.3Np  reason: invalid class name and case insensitive filesystem */
public class C72813Np extends ImageSpan {
    public WeakReference A00;

    public static CharSequence A03(Paint paint, Drawable drawable, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        Drawable drawable2 = drawable;
        if (charSequence instanceof SpannableStringBuilder) {
            A04(paint2, drawable2, (SpannableStringBuilder) charSequence2, -1, 0, 1);
            return charSequence2;
        }
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(AnonymousClass001.A1E(charSequence, "  ", AnonymousClass000.A10()));
        A04(paint2, drawable2, A09, -1, 0, 1);
        return A09;
    }

    public static SpannableStringBuilder A01(Paint paint, Drawable drawable, CharSequence charSequence, int i, int i2) {
        StringBuilder sb = new StringBuilder(" ".length() * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(" ");
        }
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(AnonymousClass001.A1E(charSequence, sb.toString(), AnonymousClass000.A10()));
        A04(paint, drawable, A09, i, 0, 1);
        return A09;
    }

    public static void A04(Paint paint, Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i <= 0) {
            i = (int) paint.getTextSize();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight(), i);
        spannableStringBuilder.setSpan(new ImageSpan(drawable), i2, i3, 33);
    }

    public Drawable A06() {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.A00 = AnonymousClass3MW.A0z(drawable2);
        return drawable2;
    }

    public static SpannableStringBuilder A00(Paint paint, Drawable drawable, CharSequence charSequence, int i) {
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(AnonymousClass001.A1E(charSequence, "  ", AnonymousClass000.A10()));
        A04(paint, drawable, A09, i, 0, 1);
        return A09;
    }

    public static SpannableStringBuilder A02(Paint paint, Drawable drawable, CharSequence charSequence, String str) {
        int indexOf = TextUtils.indexOf(charSequence, str);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(charSequence);
        A04(paint, drawable, A09, -1, indexOf, str.length() + indexOf);
        return A09;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C72483Me.A0i(canvas, paint, A06(), f, i4);
    }
}
