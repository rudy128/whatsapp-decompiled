package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.03Q  reason: invalid class name */
public abstract class AnonymousClass03Q {
    public static AnonymousClass0S3 A01(Runnable runnable) {
        return new AnonymousClass0S3(runnable);
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void A03(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(View view) {
        return view.findOnBackInvokedDispatcher();
    }
}
