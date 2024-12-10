package X;

import android.animation.ValueAnimator;

/* renamed from: X.74c  reason: invalid class name and case insensitive filesystem */
public class C1410574c implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C1410574c(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r2.A0e != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r0 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        r0 = r2.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r0 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        r0.setAlpha(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a0, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        r0 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        if (r0 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r0.setAlpha(r1);
        r0 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ab, code lost:
        if (r0 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ad, code lost:
        r0.setAlpha(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b0, code lost:
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b2, code lost:
        if (r0 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b4, code lost:
        r0.setAlpha(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ce, code lost:
        if (r0 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d5, code lost:
        r0.setAlpha(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0027
            java.lang.Object r2 = r9.A01
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r9.A02
            java.lang.Object r0 = r10.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            X.C42491yG.A07(r2, r0)
            if (r1 == 0) goto L_0x001f
            float r1 = r10.getAnimatedFraction()
        L_0x001b:
            r2.setAlpha(r1)
        L_0x001e:
            return
        L_0x001f:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.getAnimatedFraction()
            float r1 = r1 - r0
            goto L_0x001b
        L_0x0027:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            boolean r8 = r9.A02
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r2 = r0.A0I
            X.7JS r0 = r0.A0G
            int r7 = r0.A09()
            float r1 = X.C108985cd.A00(r10)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            boolean r0 = r2.A0e
            r3 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r3 = r1
        L_0x0047:
            r0 = 1
            java.lang.String r6 = "textTool"
            java.lang.String r5 = "cropTool"
            if (r7 == r0) goto L_0x0087
            r0 = 2
            java.lang.String r4 = "penTool"
            if (r7 == r0) goto L_0x00bc
            r0 = 3
            if (r7 == r0) goto L_0x0097
            r0 = 5
            if (r7 == r0) goto L_0x00bc
            r0 = 6
            if (r7 != r0) goto L_0x001e
            android.widget.ImageView r0 = r2.A09
            if (r0 == 0) goto L_0x00d0
            r0.setAlpha(r1)
            com.whatsapp.WaTextView r0 = r2.A0G
            if (r0 == 0) goto L_0x008f
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.A0A
            if (r0 == 0) goto L_0x0071
            r0.setAlpha(r1)
        L_0x0071:
            android.widget.ImageView r0 = r2.A05
            if (r0 == 0) goto L_0x00b8
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.A06
            if (r0 == 0) goto L_0x007f
            r0.setAlpha(r3)
        L_0x007f:
            android.widget.FrameLayout r0 = r2.A03
            if (r0 == 0) goto L_0x001e
            r0.setAlpha(r1)
            return
        L_0x0087:
            android.widget.ImageView r0 = r2.A0A
            if (r0 != 0) goto L_0x00d5
        L_0x008b:
            com.whatsapp.WaTextView r0 = r2.A0G
            if (r0 != 0) goto L_0x0093
        L_0x008f:
            X.C18070vi.A11(r6)
            goto L_0x00d3
        L_0x0093:
            r0.setAlpha(r1)
            goto L_0x00a2
        L_0x0097:
            android.widget.ImageView r0 = r2.A09
            if (r0 == 0) goto L_0x00d0
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.A0A
            if (r0 != 0) goto L_0x0093
        L_0x00a2:
            android.widget.ImageView r0 = r2.A05
            if (r0 == 0) goto L_0x00b8
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r2.A06
            if (r0 == 0) goto L_0x00b0
            r0.setAlpha(r3)
        L_0x00b0:
            android.widget.ImageView r0 = r2.A0B
            if (r0 == 0) goto L_0x007f
            r0.setAlpha(r1)
            goto L_0x007f
        L_0x00b8:
            X.C18070vi.A11(r5)
            goto L_0x00d3
        L_0x00bc:
            if (r8 == 0) goto L_0x00cc
            android.widget.ImageView r0 = r2.A0A
            if (r0 == 0) goto L_0x00c5
            r0.setAlpha(r1)
        L_0x00c5:
            android.widget.ImageView r0 = r2.A0C
            if (r0 == 0) goto L_0x00cc
            r0.setAlpha(r1)
        L_0x00cc:
            android.widget.ImageView r0 = r2.A09
            if (r0 != 0) goto L_0x00d5
        L_0x00d0:
            X.C18070vi.A11(r4)
        L_0x00d3:
            r0 = 0
            throw r0
        L_0x00d5:
            r0.setAlpha(r1)
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410574c.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
