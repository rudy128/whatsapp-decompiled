package X;

import android.view.ScaleGestureDetector;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Map;

/* renamed from: X.D4f  reason: case insensitive filesystem */
public class C26565D4f implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final /* synthetic */ C26273CwN A05;

    public C26565D4f(C26273CwN cwN) {
        this.A05 = cwN;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f;
        long j;
        C26273CwN cwN = this.A05;
        C26016CqX cqX = cwN.A0A;
        if (cqX != null) {
            cqX.A01(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), this.A03, this.A04);
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan();
        float f2 = this.A00;
        if (f2 > 0.0f) {
            f = currentSpan / f2;
        } else {
            f = 1.0f;
        }
        Map map = cwN.A0K;
        if (!map.containsKey(Gesture.GestureType.PINCH) && C108945cZ.A00(1.0f, f) < 0.1f) {
            return true;
        }
        cwN.A0E = true;
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        Gesture.GestureType gestureType = Gesture.GestureType.PINCH;
        if (map.containsKey(gestureType)) {
            j = C17880vN.A05(map.get(gestureType));
            if (C26273CwN.A08(cwN, j)) {
                return true;
            }
        } else {
            j = C26273CwN.A00(cwN, gestureType);
            C26273CwN.A05(cwN, new PinchGesture(j, f, focusX, focusY, Gesture.GestureState.BEGAN, true, this.A01, this.A02));
        }
        C26273CwN.A05(cwN, new PinchGesture(j, f, focusX, focusY, Gesture.GestureState.CHANGED, true, this.A01, this.A02));
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C26273CwN cwN = this.A05;
        if (cwN.A0A == null) {
            return false;
        }
        this.A03 = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        this.A04 = focusY;
        C26016CqX cqX = cwN.A0A;
        float f = this.A03;
        cqX.A0E = false;
        Float f2 = cqX.A0A;
        if (f2 == null) {
            f2 = Float.valueOf(f);
            cqX.A0A = f2;
            cqX.A0B = Float.valueOf(focusY);
        }
        cqX.A02 = f - f2.floatValue();
        cqX.A03 = focusY - cqX.A0B.floatValue();
        cqX.A09 = null;
        C26273CwN cwN2 = cqX.A0H.A02;
        cwN2.A0E = true;
        cqX.A09 = BE8.A0V(Gesture.GestureType.PAN, cwN2.A0Q);
        boolean contains = cwN.A0Q.contains(Gesture.GestureType.PINCH);
        if (contains) {
            this.A00 = scaleGestureDetector.getCurrentSpan();
        }
        return contains;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float f;
        C26273CwN cwN = this.A05;
        C26016CqX cqX = cwN.A0A;
        if (cqX != null) {
            cqX.A0E = true;
            cqX.A09 = null;
        }
        Map map = cwN.A0K;
        Gesture.GestureType gestureType = Gesture.GestureType.PINCH;
        if (map.containsKey(gestureType)) {
            long A052 = C17880vN.A05(map.get(gestureType));
            if (C26273CwN.A08(cwN, A052)) {
                cwN.A0O.add(gestureType);
                return;
            }
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            float f2 = this.A00;
            if (f2 > 0.0f) {
                f = currentSpan / f2;
            } else {
                f = 1.0f;
            }
            C26273CwN.A05(cwN, new PinchGesture(A052, f, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), Gesture.GestureState.ENDED, true, this.A01, this.A02));
        }
    }
}
