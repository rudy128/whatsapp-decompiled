package X;

import android.animation.ValueAnimator;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.74e  reason: invalid class name and case insensitive filesystem */
public class C1410774e implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C1410774e(C136986uj r1, float f, int i, int i2) {
        this.A01 = i2;
        this.A03 = r1;
        this.A00 = f;
        this.A02 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C109455dT r0;
        int i = this.A01;
        float f = this.A00;
        int i2 = this.A02;
        TitleBarView titleBarView = ((C136986uj) this.A03).A0I;
        float A002 = C108985cd.A00(valueAnimator);
        if (i != 0) {
            r0 = titleBarView.A0Q;
            if (r0 == null) {
                C18070vi.A11("penToolDrawable");
                throw null;
            }
        } else {
            r0 = titleBarView.A0R;
            if (r0 == null) {
                return;
            }
        }
        r0.A01 = f;
        r0.A02 = i2;
        r0.A00 = A002;
        r0.invalidateSelf();
    }
}
