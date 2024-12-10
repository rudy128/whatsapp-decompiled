package X;

import android.animation.AnimatorListenerAdapter;

/* renamed from: X.5ci  reason: invalid class name and case insensitive filesystem */
public class C109035ci extends AnimatorListenerAdapter {
    public final /* synthetic */ C136986uj A00;
    public final /* synthetic */ boolean A01;

    public C109035ci(C136986uj r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009e, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00aa, code lost:
        if (r0 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ac, code lost:
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        if (r0 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d1, code lost:
        r0.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d5, code lost:
        r0.setVisibility(4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r11) {
        /*
            r10 = this;
            super.onAnimationEnd(r11)
            X.6uj r5 = r10.A00
            android.animation.AnimatorSet r0 = r5.A02
            if (r0 == 0) goto L_0x00e0
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.util.Iterator r1 = r0.iterator()
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            android.animation.Animator r0 = (android.animation.Animator) r0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.removeAllUpdateListeners()
            goto L_0x0011
        L_0x0023:
            android.animation.AnimatorSet r0 = r5.A02
            r0.removeAllListeners()
            boolean r4 = r10.A01
            r3 = 0
            if (r4 == 0) goto L_0x00dd
            android.animation.AnimatorSet r0 = r5.A00(r3)
        L_0x0031:
            r5.A02 = r0
            if (r4 == 0) goto L_0x00cc
            X.7JS r6 = r5.A0G
            X.1Lc r0 = r6.A0C
            X.0ve r2 = r0.A01
            r1 = 9237(0x2415, float:1.2944E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r9 = X.C18020vd.A05(r0, r2, r1)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r2 = r5.A0I
            int r8 = r6.A09()
            r0 = 1
            java.lang.String r7 = "textTool"
            r1 = 4
            if (r8 == r0) goto L_0x0095
            r0 = 2
            java.lang.String r6 = "penTool"
            if (r8 == r0) goto L_0x0074
            r0 = 3
            if (r8 == r0) goto L_0x00a1
            r0 = 5
            if (r8 == r0) goto L_0x0074
            r0 = 6
            if (r8 != r0) goto L_0x00b7
            android.widget.ImageView r0 = r2.A09
            if (r0 == 0) goto L_0x00d9
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0A
            if (r0 == 0) goto L_0x006b
            r0.setVisibility(r1)
        L_0x006b:
            com.whatsapp.WaTextView r0 = r2.A0G
            if (r0 != 0) goto L_0x00d1
        L_0x006f:
            X.C18070vi.A11(r7)
        L_0x0072:
            r0 = 0
            throw r0
        L_0x0074:
            android.widget.ImageView r0 = r2.A09
            if (r0 == 0) goto L_0x00d9
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r2.A0G
            if (r0 == 0) goto L_0x006f
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0B
            if (r0 == 0) goto L_0x0089
            r0.setVisibility(r1)
        L_0x0089:
            if (r9 == 0) goto L_0x00b0
            android.widget.ImageView r0 = r2.A0A
            if (r0 == 0) goto L_0x0092
            r0.setVisibility(r1)
        L_0x0092:
            android.widget.ImageView r0 = r2.A0C
            goto L_0x00ae
        L_0x0095:
            android.widget.ImageView r0 = r2.A0A
            if (r0 == 0) goto L_0x009c
            r0.setVisibility(r1)
        L_0x009c:
            com.whatsapp.WaTextView r0 = r2.A0G
            if (r0 != 0) goto L_0x00d5
            goto L_0x006f
        L_0x00a1:
            android.widget.ImageView r0 = r2.A09
            if (r0 == 0) goto L_0x00d9
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0A
            if (r0 != 0) goto L_0x00d5
        L_0x00ac:
            android.widget.ImageView r0 = r2.A0B
        L_0x00ae:
            if (r0 != 0) goto L_0x00d1
        L_0x00b0:
            android.widget.FrameLayout r0 = r2.A03
            if (r0 == 0) goto L_0x00b7
            r0.setVisibility(r1)
        L_0x00b7:
            android.widget.ImageView r0 = r2.A05
            java.lang.String r7 = "cropTool"
            if (r0 == 0) goto L_0x006f
            int r6 = r0.getVisibility()
            r0 = 8
            if (r6 == r0) goto L_0x00cc
            android.widget.ImageView r0 = r2.A05
            if (r0 == 0) goto L_0x006f
            r0.setVisibility(r1)
        L_0x00cc:
            r5.A08 = r4
            r5.A07 = r3
            return
        L_0x00d1:
            r0.setVisibility(r1)
            goto L_0x00b0
        L_0x00d5:
            r0.setVisibility(r1)
            goto L_0x00ac
        L_0x00d9:
            X.C18070vi.A11(r6)
            goto L_0x0072
        L_0x00dd:
            r0 = 0
            goto L_0x0031
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109035ci.onAnimationEnd(android.animation.Animator):void");
    }
}
