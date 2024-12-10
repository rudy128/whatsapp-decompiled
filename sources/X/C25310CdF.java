package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.CdF  reason: case insensitive filesystem */
public abstract class C25310CdF {
    public static final C3F A00(Resources resources, Drawable drawable, Integer num, int i) {
        if (drawable != null) {
            return A01(drawable);
        }
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                return A01(resources.getDrawable(i));
            }
            return new C22827BRf(typedValue.data);
        } else if (num != null) {
            return new C22827BRf(num.intValue());
        } else {
            return null;
        }
    }

    public static final C3F A01(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof ColorDrawable) {
            return new C22827BRf(((ColorDrawable) drawable).getColor());
        }
        return new C22829BRh(drawable);
    }
}
