package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.D4k  reason: case insensitive filesystem */
public final class C26570D4k implements View.OnAttachStateChangeListener {
    public final D7U A00;
    public final WeakReference A01;

    public void onViewAttachedToWindow(View view) {
        C18070vi.A0d(view, 0);
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.A01.get();
        IBinder A002 = C24511C7f.A00(activity);
        if (activity != null && A002 != null) {
            this.A00.A02(activity, A002);
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public C26570D4k(Activity activity, D7U d7u) {
        this.A00 = d7u;
        this.A01 = AnonymousClass3MW.A0z(activity);
    }
}
