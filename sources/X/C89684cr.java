package X;

import android.view.View;

/* renamed from: X.4cr  reason: invalid class name and case insensitive filesystem */
public final class C89684cr implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass1F9 A01;
    public final /* synthetic */ AnonymousClass3RI A02;

    public void onViewAttachedToWindow(View view) {
    }

    public C89684cr(View view, AnonymousClass1F9 r2, AnonymousClass3RI r3) {
        this.A00 = view;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void onViewDetachedFromWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        this.A01.getLifecycle().A06(this.A02.getViewModel());
    }
}
