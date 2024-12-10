package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4eP  reason: invalid class name and case insensitive filesystem */
public class C90644eP implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C90644eP(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
    }

    public boolean onPreDraw() {
        Drawable popupDrawable;
        if (this.A00 != 0) {
            AnonymousClass4VR r5 = (AnonymousClass4VR) this.A02;
            if (!r5.A0H) {
                C74323Zj r1 = (C74323Zj) this.A03;
                if (!r1.A09.A02 && !r1.A0A.A02) {
                    return false;
                }
                r5.A0H = true;
                r5.A02.requestLayout();
                return false;
            }
            AnonymousClass3MX.A1G(r5.A02, this);
            int i = r5.A02.getLayoutParams().height;
            int height = r5.A02.getHeight();
            r5.A02.getLayoutParams().height = this.A01;
            r5.A02.requestLayout();
            int transcriptMode = r5.A03.getTranscriptMode();
            AnonymousClass3OX r3 = new AnonymousClass3OX(this, i, height, 1);
            C74583bz r2 = new C74583bz(this, transcriptMode);
            r3.setDuration(300);
            r3.setAnimationListener(r2);
            r5.A02.startAnimation(r3);
            return false;
        }
        View view = (View) this.A03;
        AnonymousClass3MX.A1G(view, this);
        AnonymousClass3uP r22 = (AnonymousClass3uP) this.A02;
        int i2 = this.A01;
        if (i2 == 0) {
            popupDrawable = r22.getPopupDrawable();
        } else if (i2 != 1) {
            popupDrawable = r22.getPinAnimDrawable();
        } else {
            popupDrawable = r22.getKeepAnimDrawable();
        }
        C108875cR r0 = r22.A0k;
        if (r0 == null || popupDrawable == null) {
            return true;
        }
        r0.BC4(popupDrawable, view);
        return true;
    }
}
