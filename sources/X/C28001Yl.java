package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.1Yl  reason: invalid class name and case insensitive filesystem */
public class C28001Yl {
    public int A00 = 0;
    public int A01 = 1;
    public long A02;
    public long A03;
    public TimeInterpolator A04 = null;

    public C28001Yl(long j) {
        this.A02 = j;
        this.A03 = 150;
    }

    public void A00(Animator animator) {
        animator.setStartDelay(this.A02);
        animator.setDuration(this.A03);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass1YW.A02;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.A00);
            valueAnimator.setRepeatMode(this.A01);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28001Yl) {
            C28001Yl r7 = (C28001Yl) obj;
            if (this.A02 == r7.A02 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A01 == r7.A01) {
                TimeInterpolator timeInterpolator = this.A04;
                if (timeInterpolator == null) {
                    timeInterpolator = AnonymousClass1YW.A02;
                }
                Class<?> cls = timeInterpolator.getClass();
                TimeInterpolator timeInterpolator2 = r7.A04;
                if (timeInterpolator2 == null) {
                    timeInterpolator2 = AnonymousClass1YW.A02;
                }
                return cls.equals(timeInterpolator2.getClass());
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.A02;
        long j2 = this.A03;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass1YW.A02;
        }
        return ((((i + timeInterpolator.getClass().hashCode()) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.A02);
        sb.append(" duration: ");
        sb.append(this.A03);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass1YW.A02;
        }
        sb.append(timeInterpolator.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.A00);
        sb.append(" repeatMode: ");
        sb.append(this.A01);
        sb.append("}\n");
        return sb.toString();
    }
}
