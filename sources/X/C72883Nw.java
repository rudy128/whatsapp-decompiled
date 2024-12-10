package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3Nw  reason: invalid class name and case insensitive filesystem */
public final class C72883Nw extends GestureDetector.SimpleOnGestureListener {
    public final View A00;
    public final C108005ay A01;

    public C72883Nw(View view, C108005ay r3) {
        C18070vi.A0d(view, 1);
        this.A00 = view;
        this.A01 = r3;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        super.onSingleTapConfirmed(motionEvent);
        this.A01.C5l(this.A00);
        return true;
    }

    public static GestureDetector A00(Context context, View view, Object obj, int i) {
        return new GestureDetector(context, new C72883Nw(view, new C94654ky(obj, i)));
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return this.A01.Bs8();
    }
}
