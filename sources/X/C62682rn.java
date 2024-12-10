package X;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.2rn  reason: invalid class name and case insensitive filesystem */
public abstract class C62682rn {
    public static ColorFilter A00(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static boolean A02(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void A01(Resources.Theme theme, Resources resources, Drawable drawable, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
