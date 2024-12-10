package X;

import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

public class CW9 {
    public float A00;
    public float A01;
    public final /* synthetic */ C26273CwN A02;

    public CW9(C26273CwN cwN) {
        this.A02 = cwN;
    }

    public boolean A00(MotionEvent motionEvent) {
        C26273CwN cwN = this.A02;
        if (!cwN.A0Q.contains(Gesture.GestureType.TAP)) {
            cwN.A0E = true;
            if (cwN.A00 != 0 || cwN.A01 != 0) {
                return false;
            }
            C26273CwN.A01(cwN);
            return false;
        }
        C26273CwN.A05(cwN, new Gesture(C26273CwN.A00(cwN, Gesture.GestureType.TAP), motionEvent.getX(), motionEvent.getY(), Gesture.GestureState.ENDED, true, this.A00, this.A01));
        return true;
    }
}
