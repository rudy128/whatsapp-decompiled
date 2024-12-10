package X;

import android.view.ViewParent;

/* renamed from: X.0Ym  reason: invalid class name and case insensitive filesystem */
public class C06480Ym implements Runnable {
    public final /* synthetic */ AnonymousClass0Rj A00;

    public C06480Ym(AnonymousClass0Rj r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
