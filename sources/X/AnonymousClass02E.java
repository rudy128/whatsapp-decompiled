package X;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.02E  reason: invalid class name */
public abstract class AnonymousClass02E {
    public static AnonymousClass0S2 A01(AnonymousClass01V r2, Object obj) {
        AnonymousClass0S2 r1 = new AnonymousClass0S2(r2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, r1);
        return r1;
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
