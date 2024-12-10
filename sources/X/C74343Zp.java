package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.3Zp  reason: invalid class name and case insensitive filesystem */
public final class C74343Zp extends AnonymousClass1LG {
    public final int A00;

    public Animator A03(ViewGroup viewGroup, C62392rK r9, C62392rK r10) {
        int i;
        int i2;
        if (r9 == null || r10 == null) {
            return null;
        }
        View view = r10.A00;
        Map map = r9.A02;
        Map map2 = r10.A02;
        if (map.get("prop:translation:topMargin") != null) {
            Object obj = map.get("prop:translation:topMargin");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Int");
            i = AnonymousClass000.A0M(obj);
        } else {
            i = 1;
        }
        if (map2.get("prop:translation:topMargin") != null) {
            Object obj2 = map2.get("prop:translation:topMargin");
            C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Int");
            i2 = AnonymousClass000.A0M(obj2);
        } else {
            i2 = this.A00;
        }
        if (i == i2) {
            return null;
        }
        ValueAnimator A09 = C72483Me.A09(i, i2);
        A09.addUpdateListener(new C88694ad(view, i, 2));
        return A09;
    }

    public void A0Q(C62392rK r4) {
        C18070vi.A0d(r4, 0);
        Map map = r4.A02;
        C18070vi.A0W(map);
        map.put("prop:translation:topMargin", Integer.valueOf(this.A00));
    }

    public void A0S(C62392rK r4) {
        C18070vi.A0d(r4, 0);
        Map map = r4.A02;
        C18070vi.A0W(map);
        map.put("prop:translation:topMargin", Integer.valueOf(C72463Mc.A0P(r4.A00).topMargin));
    }

    public C74343Zp(int i) {
        this.A00 = i;
    }
}
