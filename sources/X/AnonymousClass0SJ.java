package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0SJ  reason: invalid class name */
public class AnonymousClass0SJ implements C15940rS {
    public Drawable BHQ(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        try {
            return AnonymousClass060.A02(context, theme, context.getResources(), attributeSet, xmlPullParser);
        } catch (Exception e) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
            return null;
        }
    }
}
