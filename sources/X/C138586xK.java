package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.6xK  reason: invalid class name and case insensitive filesystem */
public class C138586xK {
    public C1419677q A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final PointF A04 = new PointF();
    public final PointF A05 = new PointF();
    public final PointF A06 = new PointF();

    public static void A00(PointF pointF, MotionEvent motionEvent) {
        pointF.set(0.0f, 0.0f);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            pointF.x += motionEvent.getX(i);
            pointF.y += motionEvent.getY(i);
        }
        float f = (float) pointerCount;
        pointF.x /= f;
        pointF.y /= f;
    }

    public C138586xK(Context context, C1419677q r3) {
        this.A00 = r3;
        this.A03 = ViewConfiguration.get(context).getScaledPagingTouchSlop() / 4;
    }
}
