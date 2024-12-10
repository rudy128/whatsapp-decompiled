package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.Cs7  reason: case insensitive filesystem */
public final class C26089Cs7 {
    public static final float A00 = ((float) Math.sqrt(5.0d));
    public static final C26089Cs7 A01 = new Object();

    public static final void A00(View view, DOZ doz, DFL dfl) {
        C18070vi.A0d(view, 0);
        DNR dnr = (DNR) C26272CwJ.A04(doz, dfl);
        if (dnr == null) {
            C25913CoX.A01("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
            return;
        }
        dnr.A0E = false;
        view.getViewTreeObserver().removeOnPreDrawListener(dnr.A0C);
        dnr.A0B = null;
        view.setAlpha(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        float A002 = C72463Mc.A00(doz.A00);
        view.setCameraDistance(A002 * A002 * -1280.0f * A00);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        if (!dnr.A0F) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            view.resetPivot();
            return;
        }
        view.setPivotX((C108945cZ.A03(view) * 50.0f) / 100.0f);
        view.setPivotY((C108945cZ.A04(view) * 50.0f) / 100.0f);
    }

    public static final void A01(View view, DNR dnr) {
        float A03 = C108945cZ.A03(view);
        float f = dnr.A09;
        if (dnr.A0I) {
            f = BE7.A01(f, A03);
        }
        view.setTranslationX(f);
        float A04 = C108945cZ.A04(view);
        float f2 = dnr.A0A;
        if (dnr.A0J) {
            f2 = BE7.A01(f2, A04);
        }
        view.setTranslationY(f2);
        if (dnr.A0F) {
            float A032 = C108945cZ.A03(view);
            float f3 = dnr.A02;
            if (dnr.A0G) {
                f3 = BE7.A01(f3, A032);
            }
            view.setPivotX(f3);
            float A042 = C108945cZ.A04(view);
            float f4 = dnr.A03;
            if (dnr.A0H) {
                f4 = BE7.A01(f4, A042);
            }
            view.setPivotY(f4);
        }
    }
}
