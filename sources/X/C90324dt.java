package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.4dt  reason: invalid class name and case insensitive filesystem */
public class C90324dt implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C90324dt(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00 != 0) {
            C79093uR r2 = (C79093uR) this.A01;
            C108875cR r4 = (C108875cR) this.A03;
            boolean onTouchEvent = ((GestureDetector) ((AnonymousClass00H) this.A02).get()).onTouchEvent(motionEvent);
            if (!onTouchEvent && motionEvent.getAction() == 1 && r4 != null) {
                if (C18020vd.A05(C18040vf.A02, r2.A0F, 9405)) {
                    r4.BId();
                }
            }
            return onTouchEvent;
        }
        AnonymousClass3RS r3 = (AnonymousClass3RS) this.A01;
        if (motionEvent.getAction() != 4) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            float y = motionEvent.getY();
            FrameLayout frameLayout = r3.A06;
            if (y >= ((float) frameLayout.getTop()) && motionEvent.getY() <= ((float) frameLayout.getBottom())) {
                float x = motionEvent.getX();
                CircularRevealView circularRevealView = r3.A07;
                if (x >= ((float) circularRevealView.getLeft()) && motionEvent.getX() <= ((float) circularRevealView.getRight())) {
                    return false;
                }
            }
        }
        r3.dismiss();
        return true;
    }
}
