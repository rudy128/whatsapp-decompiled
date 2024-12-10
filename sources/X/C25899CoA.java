package X;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.CoA  reason: case insensitive filesystem */
public abstract class C25899CoA {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static float A00(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C7O.A00(velocityTracker, i);
        }
        CS5 cs5 = (CS5) A00.get(velocityTracker);
        if (cs5 == null || i != 26) {
            return 0.0f;
        }
        return cs5.A00;
    }

    public static void A01(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = A00;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new CS5());
            }
            CS5 cs5 = (CS5) map.get(velocityTracker);
            long eventTime = motionEvent.getEventTime();
            int i = cs5.A02;
            if (i != 0 && eventTime - cs5.A04[cs5.A01] > 40) {
                i = 0;
                cs5.A02 = 0;
                cs5.A00 = 0.0f;
            }
            int i2 = (cs5.A01 + 1) % 20;
            cs5.A01 = i2;
            if (i != 20) {
                cs5.A02 = i + 1;
            }
            cs5.A03[i2] = motionEvent.getAxisValue(26);
            cs5.A04[cs5.A01] = eventTime;
        }
    }
}
