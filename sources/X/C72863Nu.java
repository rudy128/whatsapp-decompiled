package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.3Nu  reason: invalid class name and case insensitive filesystem */
public class C72863Nu extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass4aY A00;

    public C72863Nu(AnonymousClass4aY r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass4aY r5 = this.A00;
        if (TextUtils.isEmpty(r5.A3Z.getText()) && Math.abs(f) < Math.abs(f2) && f2 < 0.0f) {
            C79863w9 r4 = (C79863w9) ((C79683vr) r5.A5E.get()).A06.get();
            AnonymousClass206 A0T = r5.A2b.A0T();
            if (A0T != null) {
                C85814Ov r1 = r5.A27;
                C18070vi.A0d(motionEvent, 0);
                FrameLayout frameLayout = r1.A04;
                C18100vl r12 = r1.A06;
                frameLayout.getGlobalVisibleRect((Rect) r12.getValue());
                if (((Rect) r12.getValue()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && r4.A01(A0T)) {
                    r4.A02(r5, A0T);
                    return true;
                }
            }
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }
}
