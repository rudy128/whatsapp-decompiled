package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.5fN  reason: invalid class name and case insensitive filesystem */
public final class C110365fN extends FrameLayout {
    public final /* synthetic */ AnonymousClass6Ga A00;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        if (motionEvent.getAction() == 1) {
            C108985cd.A0x(this.A00.A0E, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110365fN(Context context, AnonymousClass6Ga r2) {
        super(context);
        this.A00 = r2;
    }
}
