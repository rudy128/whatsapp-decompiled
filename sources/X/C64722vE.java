package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2vE  reason: invalid class name and case insensitive filesystem */
public final class C64722vE implements View.OnTouchListener {
    public long A00;
    public long A01;
    public final AnonymousClass11P A02;

    public C64722vE(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.A00 = SystemClock.elapsedRealtime();
            return false;
        }
    }
}
