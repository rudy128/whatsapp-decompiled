package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: X.3Zq  reason: invalid class name and case insensitive filesystem */
public final class C74353Zq extends AnonymousClass1LG {
    public final float A00;

    public Animator A03(ViewGroup viewGroup, C62392rK r9, C62392rK r10) {
        View view;
        float f;
        float f2;
        if (r10 != null) {
            view = r10.A00;
        } else {
            view = null;
        }
        if (!(view instanceof TextView) || view == null || r9 == null) {
            return null;
        }
        Map map = r9.A02;
        Map map2 = r10.A02;
        if (map.get("android:textSize:size") != null) {
            Object obj = map.get("android:textSize:size");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Float");
            f = AnonymousClass000.A04(obj);
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textSize:size") != null) {
            Object obj2 = map2.get("android:textSize:size");
            C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Float");
            f2 = AnonymousClass000.A04(obj2);
        } else {
            f2 = this.A00;
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C72473Md.A1a(f, f2));
        C88754aj.A00(ofFloat, view, 5);
        return ofFloat;
    }

    public void A0Q(C62392rK r4) {
        C18070vi.A0d(r4, 0);
        Map map = r4.A02;
        C18070vi.A0W(map);
        map.put("android:textSize:size", Float.valueOf(this.A00));
    }

    public void A0S(C62392rK r4) {
        C18070vi.A0d(r4, 0);
        View view = r4.A00;
        if (view instanceof TextView) {
            C18070vi.A0z(view, "null cannot be cast to non-null type android.widget.TextView");
            Map map = r4.A02;
            C18070vi.A0W(map);
            map.put("android:textSize:size", Float.valueOf(((TextView) view).getTextSize()));
        }
    }

    public C74353Zq(float f) {
        this.A00 = f;
    }
}
