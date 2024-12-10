package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.1XM  reason: invalid class name */
public abstract class AnonymousClass1XM {
    public static final void A00(Activity activity, C18100vl r7) {
        Class<Activity> cls = Activity.class;
        try {
            Method method = cls.getMethod("setDisablePreviewScreenshots", new Class[]{Boolean.TYPE});
            method.setAccessible(true);
            method.invoke(activity, new Object[]{r7.getValue()});
        } catch (Exception e) {
            Log.e("AppAuthManager/disablePreviewScreenshots Could not invoke setDisablePreviewScreenshots()", e);
        }
    }
}
