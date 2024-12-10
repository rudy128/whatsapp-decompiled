package X;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.02c  reason: invalid class name and case insensitive filesystem */
public abstract class C004902c {
    public static final void A01(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static final void A03(C18090vk r1) {
        C18070vi.A0d(r1, 0);
        r1.invoke();
    }

    public static final AnonymousClass0S1 A00(C18090vk r1) {
        return new AnonymousClass0S1(r1);
    }

    public static final void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
