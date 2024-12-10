package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import java.util.Iterator;

public class BIK extends FrameLayout {
    public static final Interpolator A07 = C29111bd.A00(0.17f, 0.17f, 0.0f, 1.0f);
    public E0U A00;
    public boolean A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final ObjectAnimator A05;
    public final Animator.AnimatorListener A06;

    private void A00(long j, long j2) {
        ObjectAnimator objectAnimator = this.A04;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
        }
        ObjectAnimator objectAnimator2 = this.A05;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j2);
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(j);
        }
        ObjectAnimator objectAnimator4 = this.A03;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(j2);
        }
    }

    public static void A01(View view, BIK bik) {
        E0U e0u = bik.A00;
        if (e0u != null) {
            D8A d8a = (D8A) e0u;
            C18070vi.A0d(view, 0);
            for (CSC csc : d8a.A0C) {
                if (csc.A00 == view) {
                    csc.A04.BIW();
                    csc.A00 = null;
                }
            }
            Iterator it = d8a.A0D.iterator();
            while (it.hasNext()) {
                CSC csc2 = (CSC) it.next();
                if (csc2.A00 == view) {
                    it.remove();
                    EAQ eaq = csc2.A04;
                    eaq.BIW();
                    csc2.A00 = null;
                    eaq.destroy();
                }
            }
        }
        bik.removeView(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (1 == X.C108965cb.A03(r2).getLayoutDirection()) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.view.View r9, X.BIK r10, java.lang.Integer r11, boolean r12) {
        /*
            if (r11 != 0) goto L_0x0004
            java.lang.Integer r11 = X.AnonymousClass00R.A00
        L_0x0004:
            int r0 = r11.intValue()
            r4 = 1
            r5 = 2
            if (r0 == r5) goto L_0x015c
            if (r0 == r4) goto L_0x0111
            r2 = 280(0x118, double:1.383E-321)
            r0 = 200(0xc8, double:9.9E-322)
            r10.A00(r2, r0)
            android.content.Context r2 = r10.getContext()
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x010e
            android.content.res.Configuration r0 = X.C108965cb.A03(r2)
            int r0 = r0.getLayoutDirection()
            r7 = 1
            if (r4 != r0) goto L_0x010e
        L_0x002f:
            android.animation.ObjectAnimator r2 = r10.A04
            r6 = 0
            r3 = 0
            if (r2 == 0) goto L_0x004b
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            int r0 = r10.getWidth()
            if (r7 == 0) goto L_0x0043
            int r0 = -r0
        L_0x0043:
            float r0 = (float) r0
            r1[r3] = r0
            r1[r4] = r6
            r2.setFloatValues(r1)
        L_0x004b:
            android.animation.ObjectAnimator r2 = r10.A05
            if (r2 == 0) goto L_0x0065
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            r1[r3] = r6
            int r0 = r10.getWidth()
            if (r7 != 0) goto L_0x005f
            int r0 = -r0
        L_0x005f:
            float r0 = (float) r0
            r1[r4] = r0
            r2.setFloatValues(r1)
        L_0x0065:
            android.animation.ObjectAnimator r2 = r10.A02
            if (r2 == 0) goto L_0x007f
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            int r0 = r10.getWidth()
            if (r7 != 0) goto L_0x0077
            int r0 = -r0
        L_0x0077:
            float r0 = (float) r0
            r1[r3] = r0
            r1[r4] = r6
            r2.setFloatValues(r1)
        L_0x007f:
            android.animation.ObjectAnimator r2 = r10.A03
            if (r2 == 0) goto L_0x0099
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            r1[r3] = r6
            int r0 = r10.getWidth()
            if (r7 == 0) goto L_0x0093
            int r0 = -r0
        L_0x0093:
            float r0 = (float) r0
            r1[r4] = r0
            r2.setFloatValues(r1)
        L_0x0099:
            android.view.ViewParent r1 = r9.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a6
            if (r1 != r10) goto L_0x0178
            r10.removeView(r9)
        L_0x00a6:
            boolean r0 = r10.A01
            r2 = -1
            r1 = -1
            if (r0 == 0) goto L_0x00ad
            r1 = -2
        L_0x00ad:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r1)
            r10.addView(r9, r0)
            int r8 = r10.getChildCount()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r7 = 0
            if (r11 != r0) goto L_0x0102
            r6 = r7
        L_0x00bf:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            r3 = 0
            r2 = 0
        L_0x00c5:
            if (r2 >= r8) goto L_0x0163
            android.view.View r1 = r10.getChildAt(r2)
            if (r1 != r9) goto L_0x00e6
            r1.setVisibility(r3)
            if (r8 <= r4) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            boolean r0 = r6.isStarted()
            if (r0 == 0) goto L_0x00dd
            r6.cancel()
        L_0x00dd:
            r6.setTarget(r1)
            r6.start()
        L_0x00e3:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00e6:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00e3
            if (r7 == 0) goto L_0x00fe
            boolean r0 = r7.isStarted()
            if (r0 == 0) goto L_0x00f7
            r7.cancel()
        L_0x00f7:
            r7.setTarget(r1)
            r7.start()
            goto L_0x00e3
        L_0x00fe:
            r5.add(r1)
            goto L_0x00e3
        L_0x0102:
            if (r12 == 0) goto L_0x0109
            android.animation.ObjectAnimator r6 = r10.A04
            android.animation.ObjectAnimator r7 = r10.A05
            goto L_0x00bf
        L_0x0109:
            android.animation.ObjectAnimator r6 = r10.A02
            android.animation.ObjectAnimator r7 = r10.A03
            goto L_0x00bf
        L_0x010e:
            r7 = 0
            goto L_0x002f
        L_0x0111:
            r0 = 250(0xfa, double:1.235E-321)
            r10.A00(r0, r0)
            android.animation.ObjectAnimator r1 = r10.A04
            if (r1 == 0) goto L_0x0127
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            r1.setFloatValues(r0)
        L_0x0127:
            android.animation.ObjectAnimator r1 = r10.A05
            if (r1 == 0) goto L_0x0138
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            r1.setFloatValues(r0)
        L_0x0138:
            android.animation.ObjectAnimator r1 = r10.A02
            if (r1 == 0) goto L_0x0149
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            r1.setFloatValues(r0)
        L_0x0149:
            android.animation.ObjectAnimator r1 = r10.A03
            if (r1 == 0) goto L_0x0099
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            r1.setFloatValues(r0)
            goto L_0x0099
        L_0x015c:
            r0 = 0
            r10.A00(r0, r0)
            goto L_0x0099
        L_0x0163:
            java.util.Iterator r1 = r5.iterator()
        L_0x0167:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            A01(r0, r10)
            goto L_0x0167
        L_0x0177:
            return
        L_0x0178:
            java.lang.String r0 = "Trying to show a view that is attached to a different parent"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIK.A02(android.view.View, X.BIK, java.lang.Integer, boolean):void");
    }

    public BIK(Context context) {
        super(context);
        BEQ beq = new BEQ(this, 2);
        this.A06 = beq;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A07;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(beq);
        this.A04 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A05 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(beq);
        this.A02 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A03 = objectAnimator4;
    }

    public View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }

    public void setOnViewRemovedListener(E0U e0u) {
        this.A00 = e0u;
    }
}
