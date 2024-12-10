package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.1HC  reason: invalid class name */
public final class AnonymousClass1HC {
    public final WeakReference A00;

    public long A00() {
        View view = (View) this.A00.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public void A01() {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void A02() {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public void A03(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public void A04(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
    }

    public void A05(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
    }

    public void A06(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().translationX(f);
        }
    }

    public void A07(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public void A08(long j) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public void A09(long j) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    public void A0A(Interpolator interpolator) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public void A0B(AnonymousClass1HM r5) {
        C109165cv r0;
        View view = (View) this.A00.get();
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (r5 != null) {
                r0 = new C109165cv(this, r5, view, 0);
            } else {
                r0 = null;
            }
            animate.setListener(r0);
        }
    }

    public void A0C(AnonymousClass5WU r4) {
        C88704ae r1;
        View view = (View) this.A00.get();
        if (view != null) {
            if (r4 != null) {
                r1 = new C88704ae(view, r4, 0);
            } else {
                r1 = null;
            }
            view.animate().setUpdateListener(r1);
        }
    }

    public AnonymousClass1HC(View view) {
        this.A00 = new WeakReference(view);
    }
}
