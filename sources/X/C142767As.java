package X;

import android.view.View;

/* renamed from: X.7As  reason: invalid class name and case insensitive filesystem */
public class C142767As implements C71963Ka {
    public final int A00;

    public C142767As(int i) {
        this.A00 = i;
    }

    public final void CPn(View view, float f) {
        switch (this.A00) {
            case 0:
                if (f < 0.0f || f >= 1.0f) {
                    view.setTranslationX(0.0f);
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    return;
                }
                view.setTranslationX((-f) * C108945cZ.A03(view));
                view.setAlpha(Math.max(0.0f, 1.0f - f));
                float max = Math.max(0.0f, 1.0f - (f * 0.3f));
                view.setScaleX(max);
                view.setScaleY(max);
                return;
            case 1:
                boolean z = true;
                if (f != 0.0f) {
                    if (f == 1.0f || f == -1.0f) {
                        z = false;
                    } else {
                        return;
                    }
                }
                AnonymousClass1Xr.A05(view, z);
                view.requestLayout();
                return;
            default:
                if (f >= -1.0f && f <= 1.0f) {
                    view.setPivotX(C108945cZ.A03(view) * 0.5f);
                    view.setPivotY(C108945cZ.A04(view));
                    view.setRotation(f * 18.75f);
                    return;
                }
                return;
        }
    }
}
