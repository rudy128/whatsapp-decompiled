package X;

import android.view.View;

/* renamed from: X.BMc  reason: case insensitive filesystem */
public abstract class C22715BMc extends C24493C6l {
    public static boolean A00 = true;

    public float A00(View view) {
        if (A00) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        return view.getAlpha();
    }

    public void A04(View view, float f) {
        if (A00) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        view.setAlpha(f);
    }
}
