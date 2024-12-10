package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.1Xs  reason: invalid class name and case insensitive filesystem */
public abstract class C27811Xs {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1Yq] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.1Yq] */
    public static C28051Yq A00(int i) {
        if (i == 0 || i != 1) {
            return new Object();
        }
        return new Object();
    }

    public static void A03(View view, C27801Xq r3) {
        AnonymousClass1Z8 r0 = r3.A01.A0J;
        if (r0 != null && r0.A04) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += AnonymousClass1Xr.A00((View) parent);
            }
            C28131Yz r1 = r3.A01;
            if (r1.A02 != f) {
                r1.A02 = f;
                C27801Xq.A03(r3);
            }
        }
    }

    public static void A01(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C27801Xq) {
            A03(view, (C27801Xq) background);
        }
    }

    public static void A02(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C27801Xq) {
            ((C27801Xq) background).A0C(f);
        }
    }
}
