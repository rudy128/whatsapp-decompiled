package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.25s  reason: invalid class name and case insensitive filesystem */
public class C450325s extends AnimatorListenerAdapter implements AnonymousClass3M3 {
    public boolean A00 = false;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public final boolean A05;

    public C450325s(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        this.A05 = true;
        A00(true);
    }

    public void C9G(AnonymousClass1LG r1) {
    }

    public void C9I() {
        A00(false);
    }

    public void C9J() {
        A00(true);
    }

    public void C9K(AnonymousClass1LG r1) {
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    private void A00(boolean z) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z && (viewGroup = this.A04) != null) {
            this.A01 = z;
            C61132pB.A01(viewGroup, z);
        }
    }

    public void C9H(AnonymousClass1LG r4) {
        if (!this.A00) {
            C25446Cfx.A02.A05(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
        r4.A0O(this);
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            C25446Cfx.A02.A05(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    public void onAnimationPause(Animator animator) {
        if (!this.A00) {
            C25446Cfx.A02.A05(this.A03, this.A02);
        }
    }

    public void onAnimationResume(Animator animator) {
        if (!this.A00) {
            C25446Cfx.A02.A05(this.A03, 0);
        }
    }
}
