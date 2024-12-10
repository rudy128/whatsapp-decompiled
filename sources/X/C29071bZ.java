package X;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.1bZ  reason: invalid class name and case insensitive filesystem */
public class C29071bZ extends AnonymousClass1LH {
    public static ObjectAnimator A02(View view, C29071bZ r4, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C25446Cfx.A02.A04(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C25446Cfx.A01, new float[]{f2});
        ofFloat.addListener(new C449925o(view));
        r4.A0N(new C453828t(view, r4, 0));
        return ofFloat;
    }

    public C29071bZ(int i) {
        if ((i & -4) == 0) {
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public C29071bZ() {
    }
}
