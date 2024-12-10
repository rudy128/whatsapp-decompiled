package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public class DFH implements AnonymousClass0sS {
    public final /* synthetic */ D8L A00;

    public DFH(D8L d8l) {
        this.A00 = d8l;
    }

    public Boolean Bw3(MotionEvent motionEvent, View view) {
        D54 d54 = this.A00.A00;
        if (d54 == null || !d54.A07) {
            return null;
        }
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            d54.A00 = motionEvent.getX();
            d54.A01 = motionEvent.getY();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                d54.A02 = true;
            }
        }
        if (motionEvent.getAction() != 2 || (C108945cZ.A00(motionEvent.getX(), d54.A00) <= 10.0f && C108945cZ.A00(motionEvent.getY(), d54.A01) <= 10.0f)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
