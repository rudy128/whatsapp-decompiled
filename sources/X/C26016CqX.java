package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import java.util.Map;

/* renamed from: X.CqX  reason: case insensitive filesystem */
public class C26016CqX {
    public static final int A0K = ViewConfiguration.getLongPressTimeout();
    public static final int A0L = ViewConfiguration.getTapTimeout();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public MotionEvent A05;
    public Boolean A06 = false;
    public Boolean A07 = false;
    public Boolean A08 = false;
    public Boolean A09;
    public Float A0A;
    public Float A0B;
    public Float A0C;
    public Float A0D;
    public boolean A0E;
    public final Handler A0F = C17890vO.A0D();
    public final GestureDetector A0G;
    public final CW9 A0H;
    public final Runnable A0I = C27082DTh.A00(this, 5);
    public final Map A0J;

    public static void A00(C26016CqX cqX, float f, float f2, float f3, float f4, long j) {
        CW9 cw9 = cqX.A0H;
        float f5 = f3;
        float f6 = f4;
        long j2 = j;
        TouchEvent touchEvent = new TouchEvent(f5, f6, j2, TouchEvent.TouchEventType.UP, System.currentTimeMillis(), true, cw9.A00, cw9.A01);
        C26273CwN cwN = cw9.A02;
        C26273CwN.A06(cwN, touchEvent);
        Map map = cwN.A0J;
        Number number = (Number) map.remove(Long.valueOf(j2));
        if (number == null) {
            return;
        }
        if (!map.isEmpty() || !C26273CwN.A08(cwN, number.longValue())) {
            C26273CwN.A05(cwN, new RawTouchGesture(number.longValue(), f3 - f, f4 - f2, f5, f6, Gesture.GestureState.ENDED, true, cw9.A00, cw9.A01));
        } else {
            cwN.A0P.add(number);
        }
    }

    public void A01(float f, float f2, float f3, float f4) {
        long j;
        Boolean bool = this.A09;
        if (bool != null && bool.booleanValue()) {
            float f5 = f - this.A02;
            this.A0A = Float.valueOf(f5);
            float f6 = f2 - this.A03;
            this.A0B = Float.valueOf(f6);
            Float f7 = this.A0C;
            if (f7 == null) {
                f7 = Float.valueOf(f3);
                this.A0C = f7;
                this.A0D = Float.valueOf(f4);
            }
            CW9 cw9 = this.A0H;
            float floatValue = f7.floatValue();
            float floatValue2 = this.A0D.floatValue();
            C26273CwN cwN = cw9.A02;
            Map map = cwN.A0K;
            Gesture.GestureType gestureType = Gesture.GestureType.PAN;
            if (map.containsKey(gestureType)) {
                j = C17880vN.A05(map.get(gestureType));
                if (C26273CwN.A08(cwN, j)) {
                    return;
                }
            } else {
                j = C26273CwN.A00(cwN, gestureType);
                C26273CwN.A05(cwN, new PanGesture(j, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.BEGAN, true, cw9.A00, cw9.A01));
            }
            C26273CwN.A05(cwN, new PanGesture(j, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.CHANGED, true, cw9.A00, cw9.A01));
        }
    }

    public void A02(float f, float f2, long j) {
        CW9 cw9 = this.A0H;
        float f3 = f;
        float f4 = f2;
        long j2 = j;
        TouchEvent touchEvent = new TouchEvent(f3, f4, j2, TouchEvent.TouchEventType.DOWN, System.currentTimeMillis(), true, cw9.A00, cw9.A01);
        C26273CwN cwN = cw9.A02;
        C26273CwN.A06(cwN, touchEvent);
        Map map = cwN.A0J;
        Long valueOf = Long.valueOf(j2);
        if (!map.containsKey(valueOf)) {
            long j3 = cwN.A03;
            cwN.A03 = 1 + j3;
            Long valueOf2 = Long.valueOf(j3);
            map.put(valueOf, valueOf2);
            cwN.A0L.put(valueOf2, C24270ByT.HIT_TESTING);
            C26273CwN.A05(cwN, new RawTouchGesture(j3, 0.0f, 0.0f, f3, f4, Gesture.GestureState.BEGAN, true, cw9.A00, cw9.A01));
        }
    }

    public C26016CqX(Context context, Handler handler, CW9 cw9) {
        GestureDetector gestureDetector = new GestureDetector(context, new C26562D4c(this), handler);
        this.A0G = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0H = cw9;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A04 = scaledTouchSlop * scaledTouchSlop;
        this.A0J = C17880vN.A11();
    }
}
