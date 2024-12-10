package X;

import android.view.View;

/* renamed from: X.1bk  reason: invalid class name and case insensitive filesystem */
public class C29181bk implements View.OnAttachStateChangeListener {
    public void onViewDetachedFromWindow(View view) {
    }

    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AnonymousClass1HF.A0U(view);
    }
}
