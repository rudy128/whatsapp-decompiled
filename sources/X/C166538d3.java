package X;

import android.view.View;

/* renamed from: X.8d3  reason: invalid class name and case insensitive filesystem */
public final class C166538d3 extends C180769Nv implements View.OnAttachStateChangeListener {
    public final View A00;

    public C166538d3(View view) {
        C18070vi.A0d(view, 1);
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        A01();
    }

    public void onViewDetachedFromWindow(View view) {
        A02();
    }
}
