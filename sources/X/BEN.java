package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class BEN extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BED A02;

    public void onAnimationCancel(Animator animator) {
        C18070vi.A0d(animator, 0);
        BED bed = this.A02;
        if (bed.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        bed.A00 = 0;
        bed.A01 = true;
        BED.A00(bed, new C27933DoV(bed));
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        C18070vi.A0d(animator, 0);
        BED bed = this.A02;
        if (bed.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = bed.A00 + 1;
        bed.A00 = i2;
        if (bed.A01 || ((i = this.A01) != -1 && i2 >= i)) {
            bed.A00 = 0;
            bed.A01 = false;
            BED.A00(bed, new C27934DoW(bed));
            return;
        }
        animator.start();
    }

    public BEN(BED bed, int i) {
        this.A02 = bed;
        this.A01 = i;
        this.A00 = bed.A05.getStartDelay();
    }

    public void onAnimationStart(Animator animator) {
        BED bed = this.A02;
        if (bed.A00 == 0) {
            BED.A00(bed, new C27935DoX(bed));
        }
    }
}
