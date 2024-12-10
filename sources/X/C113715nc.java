package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.5nc  reason: invalid class name and case insensitive filesystem */
public final class C113715nc extends AnonymousClass1LG {
    public Animator A03(ViewGroup viewGroup, C62392rK r8, C62392rK r9) {
        if (r8 == null || r9 == null) {
            return null;
        }
        Object obj = r8.A02.get("calling:header:ui:anim:change_alpha:alpha");
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Float");
        float A04 = AnonymousClass000.A04(obj);
        Object obj2 = r9.A02.get("calling:header:ui:anim:change_alpha:alpha");
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Float");
        float A042 = AnonymousClass000.A04(obj2);
        if (A04 != A042) {
            return ObjectAnimator.ofFloat(r9.A00, View.ALPHA, C72473Md.A1a(A04, A042));
        }
        return null;
    }

    public void A0Q(C62392rK r4) {
        C18070vi.A0d(r4, 0);
        Map map = r4.A02;
        C18070vi.A0W(map);
        map.put("calling:header:ui:anim:change_alpha:alpha", Float.valueOf(r4.A00.getAlpha()));
    }

    public void A0S(C62392rK r4) {
        C18070vi.A0d(r4, 0);
        Map map = r4.A02;
        C18070vi.A0W(map);
        map.put("calling:header:ui:anim:change_alpha:alpha", Float.valueOf(r4.A00.getAlpha()));
    }
}
