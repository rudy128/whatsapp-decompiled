package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.5nd  reason: invalid class name and case insensitive filesystem */
public class C113725nd extends AnonymousClass1LG {
    public static final String[] A00;

    /* JADX WARNING: type inference failed for: r2v2, types: [android.animation.TypeEvaluator, java.lang.Object, X.74Y] */
    public Animator A03(ViewGroup viewGroup, C62392rK r12, C62392rK r13) {
        ObjectAnimator objectAnimator = null;
        if (!(r12 == null || r13 == null)) {
            Map map = r12.A02;
            if (map.containsKey("android:clipBounds:clip")) {
                Map map2 = r13.A02;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Object obj = map2.get("android:clipBounds:clip");
                    boolean A1X = AnonymousClass000.A1X(obj);
                    if (!(rect == null && obj == null)) {
                        if (rect == null) {
                            rect = (Rect) map.get("android:clipBounds:bounds");
                        } else if (obj == null) {
                            obj = map2.get("android:clipBounds:bounds");
                        }
                        if (!rect.equals(obj)) {
                            View view = r13.A00;
                            view.setClipBounds(rect);
                            Rect A07 = AnonymousClass3MW.A07();
                            ? obj2 = new Object();
                            obj2.A00 = A07;
                            objectAnimator = ObjectAnimator.ofObject(view, C25446Cfx.A00, obj2, new Rect[]{rect, obj});
                            if (A1X) {
                                objectAnimator.addListener(new C109105cp(this, view, 0));
                                return objectAnimator;
                            }
                        }
                    }
                }
            }
        }
        return objectAnimator;
    }

    public static void A01(C62392rK r4) {
        View view = r4.A00;
        if (view.getVisibility() != 8) {
            Rect clipBounds = view.getClipBounds();
            Map map = r4.A02;
            map.put("android:clipBounds:clip", clipBounds);
            if (clipBounds == null) {
                map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    static {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "android:clipBounds:clip";
        A00 = A1Y;
    }

    public String[] A0V() {
        return A00;
    }

    public void A0Q(C62392rK r1) {
        A01(r1);
    }

    public void A0S(C62392rK r1) {
        A01(r1);
    }
}
