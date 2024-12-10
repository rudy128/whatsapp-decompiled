package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.3P8  reason: invalid class name */
public final class AnonymousClass3P8 extends FrameLayout {
    public final AnonymousClass4UQ A00;
    public final C74453a0 A01;

    public final AnonymousClass4UQ getBodyParametricStyleParameters() {
        return this.A00;
    }

    public final void setInitialProgress(int i) {
        AnonymousClass3Re.A01(this.A01, i, 0);
    }

    public final void setProgress(int i) {
        this.A01.setProgress(i);
    }

    public AnonymousClass3P8(Context context, AnonymousClass4UQ r7) {
        super(context);
        int i;
        this.A00 = r7;
        float f = r7.A00;
        if (f > 0.0f) {
            i = (int) (1.0f / f);
        } else {
            i = 100;
        }
        C74453a0 r3 = new C74453a0(context);
        r3.setThumb(C24261Jm.A00(context, 2131231109));
        r3.getThumb().setTint(r7.A02);
        r3.A00 = r7.A01;
        r3.A01 = r7.A03;
        r3.setThumbOffset(0);
        r3.setMax(i);
        this.A01 = r3;
        addView(r3, new ViewGroup.MarginLayoutParams(-1, -2));
    }
}
