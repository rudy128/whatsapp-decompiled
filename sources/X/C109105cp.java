package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.5cp  reason: invalid class name and case insensitive filesystem */
public class C109105cp extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C109105cp(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ((View) this.A02).setClipBounds((Rect) null);
                return;
            case 1:
                MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass6A8) this.A01).A06;
                if (mediaViewBaseFragment.A1B() != null) {
                    mediaViewBaseFragment.A2L(true, true);
                    ((C1600787a) this.A02).C9F(true);
                    return;
                }
                return;
            case 2:
                ((MediaViewFragment) this.A01).A2O((AnonymousClass21V) this.A02);
                return;
            case 3:
                C108945cZ.A1P(this.A02);
                super.onAnimationEnd(animator);
                return;
            case 4:
                C1406472j r1 = (C1406472j) this.A02;
                C139986zl A012 = C1406472j.A01(r1);
                if (A012 != null) {
                    C1406472j.A02(r1, A012);
                    ((Animator) this.A01).removeListener(this);
                    return;
                }
                return;
            case 5:
                WaTextView waTextView = ((AnonymousClass72I) this.A02).A03;
                waTextView.setAlpha(1.0f);
                waTextView.setVisibility(4);
                AnonymousClass7J1 r12 = (AnonymousClass7J1) this.A01;
                r12.A07 = new C121226Iq(r12);
                r12.A0B = false;
                return;
            case 6:
                C109945eR r2 = (C109945eR) this.A01;
                if (r2.A09 < 0.15f) {
                    C109945eR.A01(r2);
                }
                Runnable runnable = (Runnable) this.A02;
                if (runnable != null) {
                    r2.post(runnable);
                    return;
                }
                return;
            default:
                C109945eR r13 = (C109945eR) this.A01;
                r13.A03();
                r13.post((Runnable) this.A02);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (6 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        C109945eR r1 = (C109945eR) this.A01;
        r1.setVisibility(0);
        r1.A0d = true;
    }
}
