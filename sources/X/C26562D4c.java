package X;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* renamed from: X.D4c  reason: case insensitive filesystem */
public class C26562D4c implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ C26016CqX A00;

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public C26562D4c(C26016CqX cqX) {
        this.A00 = cqX;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C26016CqX cqX = this.A00;
        int i = C26016CqX.A0K;
        MotionEvent motionEvent2 = cqX.A05;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        cqX.A05 = MotionEvent.obtain(motionEvent);
        Handler handler = cqX.A0F;
        Runnable runnable = cqX.A0I;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, (long) (C26016CqX.A0L + C26016CqX.A0K));
        cqX.A07 = AnonymousClass000.A0i();
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float y;
        C26016CqX cqX = this.A00;
        int i = C26016CqX.A0K;
        if (cqX.A0E && !cqX.A06.booleanValue()) {
            cqX.A0F.removeCallbacks(cqX.A0I);
            cqX.A07 = false;
            float x = motionEvent2.getX();
            float y2 = motionEvent2.getY();
            Boolean bool = cqX.A09;
            if (bool == null) {
                if (motionEvent != null) {
                    cqX.A0C = Float.valueOf(motionEvent.getX());
                    y = motionEvent.getY();
                } else {
                    cqX.A0C = Float.valueOf(motionEvent2.getX());
                    y = motionEvent2.getY();
                }
                cqX.A0D = Float.valueOf(y);
                C26273CwN cwN = cqX.A0H.A02;
                cwN.A0E = true;
                bool = BE8.A0V(Gesture.GestureType.PAN, cwN.A0Q);
                cqX.A09 = bool;
                Float f3 = cqX.A0A;
                if (f3 == null) {
                    f3 = Float.valueOf(x);
                    cqX.A0A = f3;
                    cqX.A0B = Float.valueOf(y2);
                }
                cqX.A02 = x - f3.floatValue();
                cqX.A03 = y2 - cqX.A0B.floatValue();
            }
            if (bool.booleanValue()) {
                cqX.A01(x, y2, cqX.A0C.floatValue(), cqX.A0D.floatValue());
                return true;
            }
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C26016CqX cqX = this.A00;
        int i = C26016CqX.A0K;
        if (cqX.A06.booleanValue()) {
            return false;
        }
        if (cqX.A0C == null || cqX.A0A == null) {
            return cqX.A0H.A00(motionEvent);
        }
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        C26016CqX cqX = this.A00;
        int i = C26016CqX.A0K;
        CW9 cw9 = cqX.A0H;
        cw9.A02.A0D = true;
        cw9.A00(motionEvent);
        return true;
    }
}
