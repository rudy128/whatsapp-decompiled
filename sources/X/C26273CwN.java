package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDelegateWrapper;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CwN  reason: case insensitive filesystem */
public class C26273CwN {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public HandlerThread A04;
    public ScaleGestureDetector A05;
    public CPP A06;
    public C26565D4f A07;
    public CW9 A08;
    public CU3 A09;
    public C26016CqX A0A;
    public CTE A0B;
    public WeakReference A0C;
    public boolean A0D = false;
    public boolean A0E;
    public final Handler A0F = C17890vO.A0D();
    public final CWV A0G;
    public final List A0H;
    public final List A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final Map A0M;
    public final Set A0N;
    public final Set A0O;
    public final Set A0P;
    public final Set A0Q;
    public final TouchGesturesListener$HitTestCallback A0R = new DB1(this);

    public static long A00(C26273CwN cwN, Gesture.GestureType gestureType) {
        long j = cwN.A03;
        cwN.A03 = 1 + j;
        Map map = cwN.A0K;
        Long valueOf = Long.valueOf(j);
        map.put(gestureType, valueOf);
        cwN.A0L.put(valueOf, C24270ByT.HIT_TESTING);
        return j;
    }

    public static void A01(C26273CwN cwN) {
        List list = cwN.A0I;
        LinkedHashSet<MotionEvent> linkedHashSet = new LinkedHashSet<>(list);
        list.clear();
        cwN.A0N.addAll(linkedHashSet);
        for (MotionEvent motionEvent : linkedHashSet) {
            WeakReference weakReference = cwN.A0C;
            if (!(weakReference == null || weakReference.get() == null)) {
                C108945cZ.A0O(weakReference).dispatchTouchEvent(motionEvent);
            }
        }
    }

    public static void A02(C26273CwN cwN) {
        cwN.A0K.clear();
        cwN.A0L.clear();
        cwN.A0M.clear();
        cwN.A0I.clear();
        cwN.A0O.clear();
        cwN.A0N.clear();
        cwN.A0H.clear();
        cwN.A0D = false;
        cwN.A01 = 0;
        cwN.A00 = 0;
    }

    public static void A03(C26273CwN cwN) {
        Set set = cwN.A0Q;
        set.clear();
        if (cwN.A0B.A05) {
            set.add(Gesture.GestureType.TAP);
        }
        if (cwN.A0B.A01) {
            set.add(Gesture.GestureType.PAN);
        }
        if (cwN.A0B.A02) {
            set.add(Gesture.GestureType.PINCH);
        }
        if (cwN.A0B.A04) {
            set.add(Gesture.GestureType.ROTATE);
        }
        if (cwN.A0B.A00) {
            set.add(Gesture.GestureType.LONG_PRESS);
        }
        if (cwN.A0B.A03) {
            set.add(Gesture.GestureType.RAW_TOUCH);
            C26016CqX cqX = cwN.A0A;
            if (cqX != null) {
                cqX.A08 = AnonymousClass000.A0i();
            }
        }
    }

    public static void A04(C26273CwN cwN, Gesture.GestureType gestureType) {
        Object remove;
        Object remove2;
        Map map = cwN.A0K;
        if (map.containsKey(gestureType) && (remove = map.remove(gestureType)) != null && (remove2 = cwN.A0L.remove(remove)) != null && remove2 == C24270ByT.GESTURE_IS_HANDLED_BY_ENGINE) {
            cwN.A00--;
        }
        Set set = cwN.A0O;
        if (set.contains(gestureType)) {
            set.remove(gestureType);
        }
    }

    public static void A05(C26273CwN cwN, Gesture gesture) {
        int ordinal;
        Set set;
        List list;
        Map map = cwN.A0L;
        if (map.containsKey(Long.valueOf(gesture.id)) && (ordinal = ((C24270ByT) C108965cb.A0o(map, gesture.id)).ordinal()) != 2) {
            if (ordinal == 3) {
                for (TouchGesturesDelegateWrapper addGestureEvent : cwN.A0G.A03) {
                    addGestureEvent.addGestureEvent(gesture);
                }
                Gesture.GestureState gestureState = gesture.gestureState;
                if (gestureState == Gesture.GestureState.ENDED || gestureState == Gesture.GestureState.CANCELLED || gestureState == Gesture.GestureState.FAILED) {
                    Object gestureType = gesture.getGestureType();
                    if (gestureType == Gesture.GestureType.RAW_TOUCH) {
                        set = cwN.A0P;
                        gestureType = Long.valueOf(gesture.id);
                    } else {
                        set = cwN.A0O;
                    }
                    set.add(gestureType);
                }
            } else if (ordinal != 0) {
                Map map2 = cwN.A0M;
                if (!map2.containsKey(Long.valueOf(gesture.id))) {
                    list = AnonymousClass8BR.A14();
                    map2.put(Long.valueOf(gesture.id), list);
                } else {
                    list = (List) C108965cb.A0o(map2, gesture.id);
                }
                list.add(gesture);
            } else {
                cwN.A01++;
                map.put(Long.valueOf(gesture.id), C24270ByT.WAIT_HIT_TEST_RESULT);
                for (TouchGesturesDelegateWrapper enqueueForHitTest : cwN.A0G.A03) {
                    enqueueForHitTest.enqueueForHitTest(gesture, cwN.A0R);
                }
            }
        }
    }

    public static void A06(C26273CwN cwN, TouchEvent touchEvent) {
        for (TouchGesturesDelegateWrapper addTouchEvent : cwN.A0G.A03) {
            addTouchEvent.addTouchEvent(touchEvent);
        }
    }

    public static void A07(C26273CwN cwN, Long l) {
        Object remove = cwN.A0L.remove(l);
        if (remove != null && remove == C24270ByT.GESTURE_IS_HANDLED_BY_ENGINE) {
            cwN.A00--;
        }
        Set set = cwN.A0P;
        if (set.contains(l)) {
            set.remove(l);
        }
    }

    public static boolean A08(C26273CwN cwN, long j) {
        Map map = cwN.A0L;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf) || map.get(valueOf) != C24270ByT.GESTURE_IS_HANDLED_BY_CLIENT) {
            return false;
        }
        return true;
    }

    public C26273CwN(CWV cwv) {
        this.A0G = cwv;
        this.A0Q = C17880vN.A12();
        this.A0B = new CTE(false, false, false, false, false, false, false);
        this.A0K = C17880vN.A11();
        this.A0L = C17880vN.A11();
        this.A0J = C17880vN.A11();
        this.A0M = C17880vN.A11();
        this.A0I = AnonymousClass8BR.A14();
        this.A0H = AnonymousClass8BR.A14();
        this.A0O = C17880vN.A12();
        this.A0P = C17880vN.A12();
        this.A0N = C17880vN.A14();
    }
}
