package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.D4q  reason: case insensitive filesystem */
public final /* synthetic */ class C26576D4q implements View.OnHoverListener {
    public final /* synthetic */ DR0 A00;

    public final boolean onHover(View view, MotionEvent motionEvent) {
        DR0 dr0 = this.A00;
        if (!AnonymousClass1Y5.A0D(dr0.A0L.A0M()) || motionEvent.getActionMasked() != 10) {
            return false;
        }
        dr0.A05.requestFocus();
        dr0.A05.performClick();
        return true;
    }

    public /* synthetic */ C26576D4q(DR0 dr0) {
        this.A00 = dr0;
    }
}
