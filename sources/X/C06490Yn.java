package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0Yn  reason: invalid class name and case insensitive filesystem */
public class C06490Yn implements Runnable {
    public final /* synthetic */ AnonymousClass0Rj A00;

    public C06490Yn(AnonymousClass0Rj r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0Rj r3 = this.A00;
        AnonymousClass0Rj.A00(r3);
        View view = r3.A07;
        if (view.isEnabled() && !view.isLongClickable() && r3.A03()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            r3.A03 = true;
        }
    }
}
