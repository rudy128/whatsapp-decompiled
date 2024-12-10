package X;

import android.view.MotionEvent;
import com.whatsapp.WaTextView;

/* renamed from: X.3ta  reason: invalid class name and case insensitive filesystem */
public final class C78753ta extends AnonymousClass3uO {
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setBubbleResolver(C108355bZ r3) {
        C18070vi.A0d(r3, 0);
        this.A0f = null;
        this.A09 = r3;
        WaTextView waTextView = this.A2r;
        if (waTextView != null) {
            waTextView.setBackground(r3.BQF());
        }
    }
}
