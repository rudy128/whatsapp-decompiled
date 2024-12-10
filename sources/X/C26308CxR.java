package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.CxR  reason: case insensitive filesystem */
public class C26308CxR implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26308CxR(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            ((View) this.A02).setVisibility(8);
            ((View) this.A01).setVisibility(0);
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            ((View) this.A02).setVisibility(8);
            ((View) this.A01).setVisibility(0);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        if (this.A00 == 0) {
            BFC bfc = (BFC) this.A01;
            CUQ cuq = (CUQ) this.A02;
            bfc.A02(cuq, 1.0f, true);
            cuq.A07 = cuq.A04;
            cuq.A05 = cuq.A01;
            cuq.A06 = cuq.A03;
            int[] iArr = cuq.A0G;
            int length = (cuq.A0C + 1) % iArr.length;
            cuq.A0C = length;
            cuq.A0D = iArr[length];
            if (bfc.A04) {
                bfc.A04 = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                if (cuq.A0F) {
                    cuq.A0F = false;
                    return;
                }
                return;
            }
            bfc.A01 += 1.0f;
        }
    }

    public void onAnimationStart(Animator animator) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((View) obj).setVisibility(8);
            ((View) this.A02).setVisibility(0);
            return;
        }
        ((BFC) obj).A01 = 0.0f;
    }
}
