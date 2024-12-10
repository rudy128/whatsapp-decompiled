package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cw3  reason: case insensitive filesystem */
public final class C26258Cw3 {
    public static final long A00 = TimeUnit.SECONDS.toMillis(1);
    public static final C26258Cw3 A01 = new Object();

    public static final long A00(Animator animator) {
        C18070vi.A0d(animator, 0);
        if (animator instanceof BED) {
            BED bed = (BED) animator;
            return (bed.A04 * ((long) bed.A00)) + A00(bed.A05);
        } else if (animator instanceof BEC) {
            List<Animator> list = ((BEC) animator).A02;
            ArrayList A0D = C29351c6.A0D(list);
            for (Animator A002 : list) {
                C17880vN.A1R(A0D, A00(A002));
            }
            Number number = (Number) C29431cG.A0W(A0D);
            if (number != null) {
                return number.longValue();
            }
            return 0;
        } else if (animator instanceof BER) {
            return ((ValueAnimator) animator).getCurrentPlayTime();
        } else {
            return 0;
        }
    }

    public static final long A01(Animator animator) {
        C18070vi.A0d(animator, 0);
        if (animator instanceof BED) {
            return ((BED) animator).getTotalDuration();
        }
        if (animator instanceof BEC) {
            return ((BEC) animator).getTotalDuration();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return animator.getTotalDuration();
        }
        return animator.getStartDelay() + animator.getDuration();
    }

    public static final Animator A02(DOZ doz, String str) {
        C18070vi.A0d(str, 1);
        return (Animator) ((AbstractMap) doz.A01(2131428149)).get(str);
    }

    public static final void A03(Animator animator, long j) {
        C18070vi.A0d(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A04(Animator animator, long j) {
        C18070vi.A0d(animator, 0);
        long j2 = j;
        if (animator instanceof BED) {
            BED bed = (BED) animator;
            long A05 = C28851b7.A05(j2, 0, bed.getDuration());
            long j3 = bed.A04;
            bed.A00 = (int) (A05 / j3);
            A04(bed.A05, A05 % j3);
        } else if (animator instanceof BEC) {
            for (Animator A04 : ((BEC) animator).A02) {
                A04(A04, j);
            }
        } else if (animator instanceof BER) {
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public static final void A05(Animator animator, DOZ doz, String str) {
        C18070vi.A0e(animator, 1, str);
        Animator animator2 = (Animator) ((AbstractMap) doz.A01(2131428149)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            C25913CoX.A01("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", AnonymousClass000.A1b(str, 1)));
        }
    }

    public final void A06(DOZ doz, String str, boolean z) {
        C18070vi.A0d(str, 1);
        Animator animator = (Animator) ((AbstractMap) doz.A01(2131428149)).get(str);
        if (animator != null) {
            if (!animator.isStarted()) {
                animator.addListener(new C26307CxQ(doz, str, z));
                animator.addPauseListener(new C26310CxT());
            }
            animator.start();
        }
    }
}
