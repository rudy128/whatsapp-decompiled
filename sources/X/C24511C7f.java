package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.C7f  reason: case insensitive filesystem */
public abstract class C24511C7f {
    public static final IBinder A00(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }
}
