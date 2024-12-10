package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.7G5  reason: invalid class name */
public final class AnonymousClass7G5 implements C107345Zi {
    public final Bitmap A00;
    public final Integer A01;

    public AnonymousClass7G5(Bitmap bitmap, Integer num) {
        C18070vi.A0d(bitmap, 1);
        this.A00 = bitmap;
        this.A01 = num;
    }

    public Drawable BQt(Context context) {
        C18070vi.A0d(context, 0);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), this.A00);
        Integer num = this.A01;
        if (num != null) {
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
            return bitmapDrawable;
        }
        bitmapDrawable.clearColorFilter();
        return bitmapDrawable;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7G5) {
                AnonymousClass7G5 r5 = (AnonymousClass7G5) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ColorFilterBitmapDrawableProvider(bitmap=");
        A10.append(this.A00);
        A10.append(", colorFilter=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
