package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.4e6  reason: invalid class name and case insensitive filesystem */
public final class C90454e6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final AnonymousClass1KB A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public C90454e6(View view, AnonymousClass1KB r3, Runnable runnable) {
        C18070vi.A0d(runnable, 3);
        this.A01 = r3;
        this.A02 = AnonymousClass3MW.A0z(view);
        this.A03 = AnonymousClass3MW.A0z(runnable);
    }

    public void onGlobalLayout() {
        int width;
        View view = (View) this.A02.get();
        if (view != null && (width = view.getWidth()) != 0 && width != this.A00) {
            this.A00 = width;
            Runnable runnable = (Runnable) this.A03.get();
            if (runnable != null) {
                AnonymousClass1KB r0 = this.A01;
                r0.A0I(runnable);
                r0.A0J(runnable);
            }
        }
    }
}
