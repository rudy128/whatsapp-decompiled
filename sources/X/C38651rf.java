package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1rf  reason: invalid class name and case insensitive filesystem */
public class C38651rf extends ValueAnimator implements Choreographer.FrameCallback {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 2.14748365E9f;
    public float A03 = -2.14748365E9f;
    public float A04 = 1.0f;
    public long A05 = 0;
    public C39801tf A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public int A09 = 0;
    public boolean A0A = false;
    public final Set A0B = new CopyOnWriteArraySet();
    public final Set A0C = new CopyOnWriteArraySet();
    public final Set A0D = new CopyOnWriteArraySet();

    public void A05() {
        float A022;
        this.A07 = true;
        boolean z = false;
        if (this.A04 < 0.0f) {
            z = true;
        }
        for (Animator.AnimatorListener animatorListener : this.A0B) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        if (this.A04 < 0.0f) {
            A022 = A01();
        } else {
            A022 = A02();
        }
        A07((float) ((int) A022));
        this.A05 = 0;
        this.A09 = 0;
        A06();
    }

    public float A00() {
        C39801tf r0 = this.A06;
        if (r0 == null) {
            return 0.0f;
        }
        float f = this.A00;
        float f2 = r0.A02;
        return (f - f2) / (r0.A00 - f2);
    }

    public float A01() {
        C39801tf r2 = this.A06;
        if (r2 == null) {
            return 0.0f;
        }
        float f = this.A02;
        if (f == 2.14748365E9f) {
            return r2.A00;
        }
        return f;
    }

    public float A02() {
        C39801tf r2 = this.A06;
        if (r2 == null) {
            return 0.0f;
        }
        float f = this.A03;
        if (f == -2.14748365E9f) {
            return r2.A02;
        }
        return f;
    }

    public void A04() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.A0D) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void A06() {
        if (this.A07) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void A07(float f) {
        if (this.A01 != f) {
            float A022 = A02();
            float A012 = A01();
            PointF pointF = C40761vE.A00;
            float max = Math.max(A022, Math.min(A012, f));
            this.A01 = max;
            if (this.A08) {
                max = (float) Math.floor((double) max);
            }
            this.A00 = max;
            this.A05 = 0;
            A04();
        }
    }

    public void A08(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C39801tf r0 = this.A06;
            if (r0 == null) {
                f3 = -3.4028235E38f;
                f4 = Float.MAX_VALUE;
            } else {
                f3 = r0.A02;
                f4 = r0.A00;
            }
            PointF pointF = C40761vE.A00;
            float max = Math.max(f3, Math.min(f4, f));
            float max2 = Math.max(f3, Math.min(f4, f2));
            if (max != this.A03 || max2 != this.A02) {
                this.A03 = max;
                this.A02 = max2;
                A07((float) ((int) Math.max(max, Math.min(max2, this.A00))));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public void A09(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.A0B) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.A0B.add(animatorListener);
    }

    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0C.add(animatorPauseListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.add(animatorUpdateListener);
    }

    public void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.A0B) {
            onAnimationCancel.onAnimationCancel(this);
        }
        boolean z = false;
        if (this.A04 < 0.0f) {
            z = true;
        }
        A09(z);
        Choreographer.getInstance().removeFrameCallback(this);
        this.A07 = false;
    }

    public float getAnimatedFraction() {
        float f;
        float A022;
        if (this.A06 == null) {
            return 0.0f;
        }
        if (this.A04 < 0.0f) {
            f = A01();
            A022 = this.A00;
        } else {
            f = this.A00;
            A022 = A02();
        }
        return (f - A022) / (A01() - A02());
    }

    public long getDuration() {
        C39801tf r0 = this.A06;
        if (r0 == null) {
            return 0;
        }
        return (long) r0.A00();
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.A0B.clear();
    }

    public void removeAllUpdateListeners() {
        this.A0D.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.A0B.remove(animatorListener);
    }

    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0C.remove(animatorPauseListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.remove(animatorUpdateListener);
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void A03() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.A07 = false;
        boolean z = false;
        if (this.A04 < 0.0f) {
            z = true;
        }
        A09(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r4 > r2) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r8) {
        /*
            r7 = this;
            r7.A06()
            X.1tf r6 = r7.A06
            if (r6 == 0) goto L_0x00ae
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00ae
            long r1 = r7.A05
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            long r3 = r8 - r1
        L_0x0015:
            r5 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r6.A01
            float r5 = r5 / r0
            float r2 = r7.A04
            float r0 = java.lang.Math.abs(r2)
            float r5 = r5 / r0
            float r1 = (float) r3
            float r1 = r1 / r5
            float r6 = r7.A01
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            float r1 = -r1
        L_0x002c:
            float r4 = r6 + r1
            float r3 = r7.A02()
            float r2 = r7.A01()
            android.graphics.PointF r0 = X.C40761vE.A00
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0041
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r5 = r0 ^ 1
            float r0 = java.lang.Math.min(r2, r4)
            float r4 = java.lang.Math.max(r3, r0)
            r3 = r4
            r7.A01 = r4
            boolean r2 = r7.A08
            if (r2 == 0) goto L_0x0059
            double r0 = (double) r4
            double r0 = java.lang.Math.floor(r0)
            float r3 = (float) r0
        L_0x0059:
            r7.A00 = r3
            r7.A05 = r8
            if (r2 == 0) goto L_0x0063
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
        L_0x0063:
            r7.A04()
        L_0x0066:
            if (r5 == 0) goto L_0x009c
            int r1 = r7.getRepeatCount()
            r0 = -1
            if (r1 == r0) goto L_0x00b4
            int r1 = r7.A09
            int r0 = r7.getRepeatCount()
            if (r1 < r0) goto L_0x00b4
            float r1 = r7.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00af
            float r0 = r7.A02()
        L_0x0082:
            r7.A01 = r0
            r7.A00 = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.removeFrameCallback(r7)
            r0 = 0
            r7.A07 = r0
            float r1 = r7.A04
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0099
            r0 = 1
        L_0x0099:
            r7.A09(r0)
        L_0x009c:
            X.1tf r0 = r7.A06
            if (r0 == 0) goto L_0x00ae
            float r3 = r7.A00
            float r1 = r7.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00fa
            float r0 = r7.A02
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00fa
        L_0x00ae:
            return
        L_0x00af:
            float r0 = r7.A01()
            goto L_0x0082
        L_0x00b4:
            java.util.Set r0 = r7.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x00ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r0.onAnimationRepeat(r7)
            goto L_0x00ba
        L_0x00ca:
            int r0 = r7.A09
            int r0 = r0 + 1
            r7.A09 = r0
            int r1 = r7.getRepeatMode()
            r0 = 2
            if (r1 != r0) goto L_0x00e5
            boolean r0 = r7.A0A
            r0 = r0 ^ 1
            r7.A0A = r0
            float r0 = r7.A04
            float r0 = -r0
            r7.A04 = r0
        L_0x00e2:
            r7.A05 = r8
            goto L_0x009c
        L_0x00e5:
            float r1 = r7.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f5
            float r0 = r7.A01()
        L_0x00f0:
            r7.A01 = r0
            r7.A00 = r0
            goto L_0x00e2
        L_0x00f5:
            float r0 = r7.A02()
            goto L_0x00f0
        L_0x00fa:
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0 = 0
            r2[r0] = r1
            float r0 = r7.A02
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1
            r2[r0] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "Frame must be [%f,%f]. It is %f"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38651rf.doFrame(long):void");
    }

    public Object getAnimatedValue() {
        return Float.valueOf(A00());
    }

    public boolean isRunning() {
        return this.A07;
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.A0A) {
            this.A0A = false;
            this.A04 = -this.A04;
        }
    }
}
