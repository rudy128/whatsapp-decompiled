package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0SM  reason: invalid class name */
public class AnonymousClass0SM implements C15940rS {
    public Drawable BHQ(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) AnonymousClass0SM.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                A00(theme, context.getResources(), drawable, attributeSet, xmlPullParser);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
            }
        }
        return null;
    }

    public static void A00(Resources.Theme theme, Resources resources, Drawable drawable, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
